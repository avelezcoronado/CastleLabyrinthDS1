import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu {
        enterName nameEnter = new enterName();
        gameIntroduction intro = new gameIntroduction();

        void menu() {
                JFrame gameFrame = new JFrame();
                JPanel jPanel1 = new javax.swing.JPanel();
                JLabel jLabel1 = new javax.swing.JLabel();
                JButton jButton1 = new javax.swing.JButton();
                JButton jButton2 = new javax.swing.JButton();
                JLabel jLabel3 = new javax.swing.JLabel();

                gameFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                gameFrame.setSize(new java.awt.Dimension(700, 500));

                jPanel1.setBackground(new java.awt.Color(0, 0, 0));

                jLabel1.setFont(new java.awt.Font("Kokonor", 1, 48)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Castle Labyrinth");

                jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
                jButton1.setText("Load Game");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                System.out.println("Hello");
                        }
                });

                jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
                jButton2.setText("New Game");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

                                nameEnter.nameInput();
                                gameFrame.dispose();
                        }
                });

                jLabel3.setIcon(new javax.swing.ImageIcon(
                                "/Users/aaaronvelez/NetBeansProjects/CastleLabyrinth/src/Images/ASCII-Castle1.jpg")); // NOI18N
                jLabel3.setText("jLabel3");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(109, 109, 109)
                                                                .addComponent(jButton2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton1)
                                                                .addGap(109, 109, 109))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(231, 231, 231)
                                                                                                .addComponent(jLabel1))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(128, 128, 128)
                                                                                                .addComponent(jLabel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                541,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(151, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton2)
                                                                                .addComponent(jButton1))
                                                                .addGap(0, 32, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(gameFrame.getContentPane());
                gameFrame.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                gameFrame.setSize(1130, 659);

                gameFrame.setLocationRelativeTo(null);
                gameFrame.setVisible(true);
                gameFrame.setResizable(false);
                gameFrame.pack();
        }

        // </editor-fold>

}
