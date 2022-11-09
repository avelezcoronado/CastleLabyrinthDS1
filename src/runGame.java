import java.util.Arrays;

import javax.swing.JOptionPane;

public class runGame {
    String[] menuOptions = {"New Game", "Load Game"};
void startGame(){
    int choice = JOptionPane.showOptionDialog(null, "Welcome Hero!", "Catstle Labyrinth", 0, JOptionPane.QUESTION_MESSAGE, null, menuOptions, "New Game");
if (choice == 0){
    runGame newPlayer = new runGame();
}

}
    public static void main(String[] args) {
        
        
    
       
        
    }



}
