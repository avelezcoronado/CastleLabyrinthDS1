import javax.swing.JOptionPane;

public class gameIntroduction extends player {

    
    String[] continueButton = {"Continue"};
    void introduction(){
    JOptionPane.showOptionDialog(null, "Once upon a time, " + heroName + "was walking in the night in his village. a terrible dragon swooped down and grabbed him with his claws and took him to a castle in another kingdom in the distance, the dragon threw him towards the top of the castle on the terrace and the dragon vanished into the darkness...", "Your Journey", 0, JOptionPane.QUESTION_MESSAGE, null, continueButton, "Continue");
    }
}
