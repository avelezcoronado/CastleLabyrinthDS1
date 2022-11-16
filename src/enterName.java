import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class enterName {
    gameIntroduction intro = new gameIntroduction();

    void nameInput() {
        JFrame gameFrame = new JFrame();
        JPanel doorChoice = new javax.swing.JPanel();
        JPanel enterName = new javax.swing.JPanel();
        JLabel jLabel1 = new javax.swing.JLabel();
        JTextField nameInput = new javax.swing.JTextField();
        JButton beginGame = new javax.swing.JButton();

        doorChoice.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout doorChoiceLayout = new javax.swing.GroupLayout(doorChoice);
        doorChoice.setLayout(doorChoiceLayout);
        doorChoiceLayout.setHorizontalGroup(
                doorChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 829, Short.MAX_VALUE));
        doorChoiceLayout.setVerticalGroup(
                doorChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 453, Short.MAX_VALUE));

        gameFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setSize(new java.awt.Dimension(700, 500));

        enterName.setBackground(new java.awt.Color(0, 0, 0));
        enterName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trattatello", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Your Name Hero");

        beginGame.setFont(new java.awt.Font("Trattatello", 0, 18)); // NOI18N
        beginGame.setText("Begin Adventure");
        beginGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player newPlayer = new player();
                newPlayer.playerName = beginGame.getText();
                System.out.println(newPlayer.playerName);
                intro.introframe();
                gameFrame.dispose();

            }
        });

        javax.swing.GroupLayout enterNameLayout = new javax.swing.GroupLayout(enterName);
        enterName.setLayout(enterNameLayout);
        enterNameLayout.setHorizontalGroup(
                enterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(enterNameLayout.createSequentialGroup()
                                .addGroup(enterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(enterNameLayout.createSequentialGroup()
                                                .addGap(373, 373, 373)
                                                .addComponent(jLabel1))
                                        .addGroup(enterNameLayout.createSequentialGroup()
                                                .addGap(434, 434, 434)
                                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 167,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(enterNameLayout.createSequentialGroup()
                                                .addGap(450, 450, 450)
                                                .addComponent(beginGame)))
                                .addContainerGap(414, Short.MAX_VALUE)));
        enterNameLayout.setVerticalGroup(
                enterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(enterNameLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(beginGame)
                                .addContainerGap(189, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(gameFrame.getContentPane());
        gameFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setResizable(false);

        gameFrame.setVisible(true);
        gameFrame.pack();
    }// </editor-fold>

}
