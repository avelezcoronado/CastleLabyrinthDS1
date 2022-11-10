import java.awt.Container;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;  
import java.io.FileWriter;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.io.FileWriter;

public class runGame {
    String[] menuOptions = {"New Game", "Load Game"};
    JFrame frame = new JFrame("JFrame Size Example");
    
void startGame(){
frame.setSize(2000, 1000);
JButton btn1 = new JButton("New Game");
JButton btn2 = new JButton("Load Game");
btn1.setPreferredSize(new Dimension(40, 40));
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container pane = frame.getContentPane();
frame.setContentPane(pane);

pane.setLayout(new GridLayout(3, 2, 10, 10));
pane.add(btn1);
pane.add(btn2);
btn1.setVisible(true);
btn2.setVisible(true);
btn1.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {
        runGame newPlayer = new runGame();
    }
});


frame.setVisible(true);





    /*int choice = JOptionPane.showOptionDialog(frame, "Welcome Hero!", "Catstle Labyrinth", 0, JOptionPane.QUESTION_MESSAGE, null, menuOptions, "New Game");
if (choice == 0){
    runGame newPlayer = new runGame(); */
}






    public static void main(String[] args) {
        runGame test = new runGame();
        test.startGame();
        
    
       
        
    }



}
