import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class doors extends player {
    String defaultMessage = "You Found A ";

    String[] monsters = { "Medusa", "Which", "Werewolf", "Vampire", "Fish Man", "Pack Of Skeletons", "Giant" };
    int[] damage = { 1, 1, 2, 1, 1, 2, 2 };

    String[] helpers = { "Angel Francisco", "Friendly Ghost", "Elf", "Pegasus", "Unicorn", "King", "Phoenix", "Death",
            "Friendly Yeti" };
    int[] heal = { 1, 2, 1, 2, 2, 3, 1, 2, 3 };

    void doorOption() {
        insideRoom createRoom = new insideRoom();

        JFrame gameFrame = new JFrame();
        JPanel enterName = new javax.swing.JPanel();
        JLabel jLabel1 = new javax.swing.JLabel();
        JButton leftDoorBtn = new javax.swing.JButton();
        JButton rightDoorBtn = new javax.swing.JButton();
        JLabel leftDoorImage = new javax.swing.JLabel();
        JLabel rightDoorImage = new javax.swing.JLabel();

        gameFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setSize(new java.awt.Dimension(700, 500));

        enterName.setBackground(new java.awt.Color(0, 0, 0));
        enterName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trattatello", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choices, choices, choices...");

        leftDoorBtn.setFont(new java.awt.Font("Trattatello", 0, 18)); // NOI18N
        leftDoorBtn.setText("Left Door");
        leftDoorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRoom.room();
                System.out.println("Left Door");
                gameFrame.dispose();

            }
        });

        rightDoorBtn.setFont(new java.awt.Font("Trattatello", 0, 18)); // NOI18N
        rightDoorBtn.setText("Right Door");
        rightDoorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insideRoom createRoom = new insideRoom();
                createRoom.room();
                System.out.println("Right Door");
                gameFrame.dispose();
            }
        });

        leftDoorImage.setIcon(
                new javax.swing.ImageIcon("/Users/aaaronvelez/Desktop/Screen Shot 2022-11-12 at 2.07.25 PM.png")); // NOI18N
        leftDoorImage.setText("jLabel2");

        rightDoorImage.setIcon(
                new javax.swing.ImageIcon("/Users/aaaronvelez/Desktop/Screen Shot 2022-11-12 at 2.07.25 PM.png")); // NOI18N
        rightDoorImage.setText("jLabel2");

        javax.swing.GroupLayout enterNameLayout = new javax.swing.GroupLayout(enterName);
        enterName.setLayout(enterNameLayout);
        enterNameLayout.setHorizontalGroup(
                enterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(enterNameLayout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(leftDoorBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rightDoorBtn)
                                .addGap(187, 187, 187))
                        .addGroup(enterNameLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(leftDoorImage, javax.swing.GroupLayout.PREFERRED_SIZE, 401,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(205, 205, 205)
                                .addComponent(rightDoorImage, javax.swing.GroupLayout.PREFERRED_SIZE, 401,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enterNameLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(314, 314, 314)));
        enterNameLayout.setVerticalGroup(
                enterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(enterNameLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18,
                                        Short.MAX_VALUE)
                                .addGroup(
                                        enterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(rightDoorImage, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(leftDoorImage, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        449, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        enterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(leftDoorBtn)
                                                .addComponent(rightDoorBtn))
                                .addGap(21, 21, 21)));

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
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        gameFrame.setResizable(false);

        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);
        gameFrame.pack();
    }// </editor-fold>

}
