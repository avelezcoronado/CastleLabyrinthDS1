import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class loseFrame {

    void youLost() {

        JFrame gameFrame = new JFrame();
        JPanel doorsPanel = new javax.swing.JPanel();
        JLabel characterIcon = new javax.swing.JLabel();
        JLabel jLabel1 = new javax.swing.JLabel();
        JButton playAgain = new javax.swing.JButton();
        JButton playAgain1 = new javax.swing.JButton();

        gameFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setSize(new java.awt.Dimension(700, 500));

        doorsPanel.setBackground(new java.awt.Color(0, 0, 0));
        doorsPanel.setForeground(new java.awt.Color(255, 255, 255));

        characterIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        characterIcon.setIcon(new javax.swing.ImageIcon(
                "/Users/aaaronvelez/repos/CastleLabyrinth/CastleLabyrinth/src/characterImages/deathImage.png")); // NOI18N
        characterIcon.setText("jLabel2");
        characterIcon.setMaximumSize(new java.awt.Dimension(900, 397));
        characterIcon.setMinimumSize(new java.awt.Dimension(1118, 397));

        jLabel1.setFont(new java.awt.Font("Trattatello", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Better luck next time...loser!");

        playAgain.setFont(new java.awt.Font("Trattatello", 0, 24)); // NOI18N
        playAgain.setText("Close Game");
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        playAgain1.setFont(new java.awt.Font("Trattatello", 0, 24)); // NOI18N
        playAgain1.setText("Play Again");
        playAgain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        javax.swing.GroupLayout doorsPanelLayout = new javax.swing.GroupLayout(doorsPanel);
        doorsPanel.setLayout(doorsPanelLayout);
        doorsPanelLayout.setHorizontalGroup(
                doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doorsPanelLayout.createSequentialGroup()
                                .addGap(0, 330, Short.MAX_VALUE)
                                .addGroup(doorsPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                                .addComponent(playAgain1, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(176, 176, 176)
                                                .addComponent(playAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(339, 339, 339))
                        .addComponent(characterIcon, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));
        doorsPanelLayout.setVerticalGroup(
                doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(
                                        doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(playAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(playAgain1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(characterIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 1091,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(32, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(gameFrame.getContentPane());
        gameFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(doorsPanel, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(doorsPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        gameFrame.setSize(1130, 659);

        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);
        gameFrame.setResizable(false);
        gameFrame.pack();
    }// </editor-fold>

}
