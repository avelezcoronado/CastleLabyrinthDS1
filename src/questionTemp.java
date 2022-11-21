import javax.swing.JOptionPane;

public class QuestionTemp {

    doors makeDoor = new doors();

    String Question[] = {
            "Which statement is true about Java?",
            "Which component is used to compile, debug and execute the java programs?",
            "Identify the corrected definition of a package",
            "Which one of the following is not a Java feature?",
            "What is the extension of compiled java classes?",
            "Which statement is true regarding an object?",
            "In object-oriented programming, composition relates to",
            "Choose the option that does not contain an array list feature:",
            "What is the extension of java code files?",
            "Which of the following is a reserved keyword in Java?",
            "When a new object is created in a program a constructor gets invoked corresponding to the class.",
            "Which keyword is used for accessing the features of a package?",
            "What is the size of float and double in java?",
            "Select the valid statement.",
            "Arrays in java are-",
            "Select the valid statement to declare and initialize an array.",
            "In Java, declaring a class abstract is useful",
            "Basic Java language functions are stored in which of the following java package?",
            "Which of the following would equate to true?",
            "Given a class named Book, which one of these is a valid constructor declaration for the class?",
            "Output of Math.floor(3.6)?",
            "Identify the modifier which cannot be used for constructor.",
            "What is the variables declared in a class for the use of all methods of the class called?",
            "Java programming is not statically-typed, means all variables should not first be",
            "The modifiers public and static cannot written in either order public static or static public.",
            "James Gosling is father of Java?",
            "Java technology is both a programming language and a platform?",
            "The modulus operator (%) in Java can be used only with variables of integer type",
            "The switch selection structure must end with the default case.",
            "Abstract art, like an abstract method, gives a vague idea of the actual object being represented, but does not specify all the details."

    };

    // multiple choise for each question

    String multipleChoiceAnswers[][] = {
            { "Java is a sequence-dependent programming language", "Java is a code dependent programming language",
                    "Java is a platform-independent programming language" },
            { "JRE", "JIT", "JDK", "JVM" },
            { "A package is a collection of editing tools", "A package is a collection of classes",
                    "A package is a collection of classes and interfaces", "A package is a collection of interfaces" },
            { "Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible" },
            { ".txt.js", ".class", ".java" },
            { "An object is what classes instantiated are from", "An object is an instance of a class",
                    "An object is a variable" },
            { "The use of consistent coding conventions",
                    "The organization of components interacting to achieve a coherent, common behavior",
                    "The use of inheritance to achieve polymorphic behavior" },
            { "Size may not be required. It changes the size dynamically", "No index required", "name[1] = book" },
            { ".js", ".txt", ".class", ".java" },
            { "object", "strictfp", "main", "system" },
            { "Class", "Method", "Constructor" },
            { "package", "import", "extends", "export" },
            { "32 and 64", "32 and 32", "64 and 64", "64 and 32" },
            { "char[] ch = new char[5]", "char[] ch = new char()", "char[] ch = new char[]" },
            { "Object references", "objects", "Primitive data type", "None" },
            { "int[] A = {}", "int[] A = {1, 2, 3}", "int[][] A = {1,2,3}" },
            { "To prevent developers from further extending the class",
                    "When it does not make sense to have objects of that class" },
            { "java.lang", "java.util", "java.awt" },
            { "s1 == s2", "s1 = s2", "s1!=s2" },
            { "Book(Book b) { }", "Book Book() { }", "private final Book() { }" },
            { "3", "3.0", "4" },
            { "public", "protected", "private", "static" },
            { "Instance variables", "Reference variable", "None" },
            { "True", "False" },
            { "True", "False" },
            { "True", "False" },
            { "True", "False" },
            { "True", "False" },
    };

    // arraqy of correct question answer
    String CorrectAnswers[] = { "Java is a platform-independent programming language", "JDK",
            "A package is a collection of classes and interfaces", "Use of pointers", ".class",
            "An object is an instance of a class",
            "The organization of components interacting to achieve a coherent common behavior", "name[1] = \"book\"",
            ".java", "strictfp", "Constructor", "import", "32 and 64", "char[] ch = new char[5]", "objects",
            "int[] A = {1, 2, 3}", "When it doesn’t make sense to have objects of that class", "java.lang", "s1 == s2",
            "Book(Book b) {}", "3.0", "static", "Instance variables", "False", "False", "True", "True", "False",
            "False", "True" };

    int response;

    void questionPopup(Player player) {
        // int pick = (int) (Math.random()*5);
        // System.out.println(pick);
        int counter = player.getCounter();
        response = JOptionPane.showOptionDialog(null, Question[counter], "You hear a voice from above ask...", 0,
                JOptionPane.QUESTION_MESSAGE, null, multipleChoiceAnswers[counter], multipleChoiceAnswers[counter]);
        player.setCounter(counter+1);
        if (multipleChoiceAnswers[counter][response] == CorrectAnswers[counter]) {
            player.setCorrectQuestions(player.getCorrectQuestions() + 1);
            JOptionPane.showMessageDialog(null,"Correct!");
            makeDoor.doorOption(player);   
            if(player.getCorrectQuestions()==5){
                //add boss fight
                System.out.println("boss fight");
            }
        } else {
            player.setLifePoints(player.getLifePoints() - 1);
            JOptionPane.showMessageDialog(null,"Wrong answer! You lost 1 life");
            if (player.getLifePoints() == 0){
                System.out.println("Lost");
                // frame end game, play again
            } else {
                makeDoor.doorOption(player);
            }
            
            
        }

    }

}

// JOptionPane.showOptionDialog(null, Questions.ONE.question, "Espera! Primero
// una Pregunta!.", 0, JOptionPane.QUESTION_MESSAGE, null,
// Questions.ONE.answers, Questions.ONE.answers[0]);
