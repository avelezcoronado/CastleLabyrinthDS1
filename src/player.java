import javax.swing.JOptionPane;

public class player {
    int lifePoints;
    String heroName;

    public player(){
       heroName = JOptionPane.showInputDialog(null, "What is your name hero?");
       lifePoints=5;
    }
}
