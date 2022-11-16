import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class insideRoom {

    String defaultMessage = "You Found A ";

    String[] monsters = { "Medusa", "Which", "Werewolf", "Vampire", "Fish Man", "Pack Of Skeletons", "Giant" };
    int[] damage = { 1, 1, 2, 1, 1, 2, 2 };

    String[] helpers = { "Angel Francisco", "Friendly Ghost", "Elf", "Pegasus", "Unicorn", "King", "Phoenix", "Death",
            "Friendly Yeti" };
    int[] heal = { 1, 2, 1, 2, 2, 2, 1, 2, 2 };

    /*
     * void newDoors() {
     * int friendOrFoe = (int) (Math.random() * 5);
     * if (friendOrFoe > 1) {
     * int monsterChooser = (int) (Math.random() * 6);
     * int choice = JOptionPane.showOptionDialog(null, defaultMessage +
     * monsters[monsterChooser],
     * "Your Consequence", 0, JOptionPane.QUESTION_MESSAGE, null, monsters,
     * "Attack");
     * if (choice == 0) {
     * int damageOrKill = (int) Math.random() * 2;
     * if (damageOrKill == 0) {
     * JOptionPane.showMessageDialog(null,
     * "You fought the " + monsters[monsterChooser] +
     * " and won, but took some damage");
     * 
     * } else if (damageOrKill == 1) {
     * JOptionPane.showMessageDialog(null,
     * "You got hit while running away from the " + monsters[monsterChooser]);
     * 
     * } else {
     * JOptionPane.showMessageDialog(null,
     * "You fought the" + monsters[monsterChooser] +
     * "and won without taking damage");
     * 
     * }
     * }
     * } else {
     * 
     * int friendChooser = (int) (Math.random() * 8);
     * JOptionPane.showOptionDialog(null, defaultMessage + helpers[friendChooser],
     * "Your Consequence", 0,
     * JOptionPane.QUESTION_MESSAGE, null, helpers, "Thank helper and keep moving");
     * 
     * }
     * }
     */

    void room() {

        JFrame gameFrame = new JFrame();
        JPanel doorsPanel = new javax.swing.JPanel();
        JLabel jLabel1 = new javax.swing.JLabel();
        JButton attackBtn = new javax.swing.JButton();
        JButton runBtn = new javax.swing.JButton();
        JLabel characterTitle = new javax.swing.JLabel();
        JLabel characterIcon = new javax.swing.JLabel();

        gameFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        doorsPanel.setBackground(new java.awt.Color(0, 0, 0));
        doorsPanel.setForeground(new java.awt.Color(255, 255, 255));
        characterTitle.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
        characterTitle.setForeground(new java.awt.Color(255, 255, 255));
        characterTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Trattatello", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Oh No! You found a...");

        attackBtn.setFont(new java.awt.Font("Trattatello", 0, 24)); // NOI18N

        int friendOrFoe = (int) (Math.random() * 5);
        if (friendOrFoe > 1) {
            int monsterChooser = (int) (Math.random() * 6);
            characterTitle.setText(monsters[monsterChooser]);
            attackBtn.setText("Attack!!");
            runBtn.setText("Run To The Door!");
            int damageOrKill = (int) Math.random() * 2;
            if (damageOrKill == 0) {
                attackBtn.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        JOptionPane.showMessageDialog(null,
                                "You fought the " + monsters[monsterChooser] + " and won, but took some damage");
                        // TAKE LIFE POINTS
                    }
                });
            } else {
                attackBtn.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        JOptionPane.showMessageDialog(null,
                                "You fought the " + monsters[monsterChooser] + " and won, NO DAMAGE TAKEN!");

                    }
                });

            }
        } else {
            int friendChooser = (int) (Math.random() * 8);
            characterTitle.setText(helpers[friendChooser]);
            attackBtn.setVisible(false);
            runBtn.setText("Thank you");

            runBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    JOptionPane.showMessageDialog(null, "You thank the " + helpers[friendChooser] + "and move on");
                }
            });

        }

        runBtn.setFont(new java.awt.Font("Trattatello", 0, 18)); // NOI18N

        runBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        characterIcon.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/com/mycompany/castlelabyrinthv2/resources/ASCII-Castle1.jpg"))); // NOI18N
        characterIcon.setText("jLabel2");

        javax.swing.GroupLayout doorsPanelLayout = new javax.swing.GroupLayout(doorsPanel);
        doorsPanel.setLayout(doorsPanelLayout);
        doorsPanelLayout.setHorizontalGroup(
                doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doorsPanelLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(attackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(runBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doorsPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(345, 345, 345))
                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                .addGroup(doorsPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                                .addGap(424, 424, 424)
                                                .addComponent(characterTitle, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                                .addGap(287, 287, 287)
                                                .addComponent(characterIcon, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        545, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(298, Short.MAX_VALUE)));
        doorsPanelLayout.setVerticalGroup(
                doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(characterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(characterIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 333,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37,
                                        Short.MAX_VALUE)
                                .addGroup(
                                        doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(runBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(attackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(gameFrame.getContentPane());
        gameFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(doorsPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(doorsPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        gameFrame.setResizable(false);

        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);
        gameFrame.pack();
    }// </editor-fold>

}
