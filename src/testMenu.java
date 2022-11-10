import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
public class testMenu {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Demo Frame");
      JPanel panel = new JPanel();
      frame.getContentPane();
      JButton button = new JButton("Demo Button");
      Dimension size = button.getPreferredSize();
      button.setBounds(20, 100, size.width, size.height);
      panel.setLayout(null);
      panel.add(button);
      panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.add(panel);
      frame.setSize(1000, 700);
      frame.setVisible(true);
   }
}
