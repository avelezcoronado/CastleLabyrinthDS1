
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class questionTemp extends player {

   
    private  String Question[] = {
        "The data type created by the data abstraction process is called",
        "Encapsulation is ",
        "Which of the following language support garbage collection ?",
        "Which is not the feature of structured programming?  ",
        "Procedural programming language is "
    };

// multiple choise for each question

private String multipleChoiceAnswers[][]= {
        {"class", "structure", "abstract data type", "User-defined data type"},
        {"dynamic binding", "a mechanism to associate the code and data", "data abstraction", "none of these"},
        {"Java", "C++", "C", "Small Talk"},
        {"Support for modular programming", "User-defined data types", "Emphasis on algorithm", "Data abstraction"},
        {"COBOL", "BASICS", "C++", "PASCAL"},

};

// arraqy of correct question answer
private String CorrectAnswers[] = {"abstract data type", "a mechanism to associate the code and data", "Java", "Data abstraction","COBOL"};
int counter =0;    
int response;
       boolean questionPopup(){
            boolean test =false;
         //int pick = (int) (Math.random()*5);
         //System.out.println(pick);
            response = JOptionPane.showOptionDialog(null, Question[counter], "Espera! Primero una Pregunta!.", 0, JOptionPane.QUESTION_MESSAGE, null, multipleChoiceAnswers[counter], multipleChoiceAnswers[counter]);
            if (multipleChoiceAnswers[counter][response] == CorrectAnswers[counter]){
                test= true;
            } else {
                lifePoints--;
            }
            counter++;
            return test;
           }

    
public static void main(String[] args) {
    questionTemp tester = new questionTemp();
    tester.questionPopup();
    tester.questionPopup();
}

}
 

    
    //JOptionPane.showOptionDialog(null, Questions.ONE.question, "Espera! Primero una Pregunta!.", 0, JOptionPane.QUESTION_MESSAGE, null, Questions.ONE.answers, Questions.ONE.answers[0]);
    
       
 

 




 
