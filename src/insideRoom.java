import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Image;

public class insideRoom {

        String defaultMessage = "You Found A ";

        String[] monsters = { "Medusa", "Witch", "Werewolf", "Vampire", "Ogre", "Skeletons", "Dragon" };
        int[] damage = { 1, 1, 2, 1, 1, 2, 2 };

        String[] helpers = { "Angel", "Friendly Ghost", "Elf", "Pegasus", "Unicorn", "King", "Phoenix", "Death" };
        int[] heal = { 1, 2, 1, 2, 2, 2, 1, 2, 2 };

        String[] monsterImagePaths = {
                        "./src/characterImages/medusa.png",
                        "./src/characterImages/witch.png",
                        "./src/characterImages/werewolf.png",
                        "./src/characterImages/vampire.png",
                        "./src/characterImages/ogre.png",
                        "./src/characterImages/skeleton.png",
                        "./src/characterImages/dragon.png" };
        String[] heroImagePaths = {
                        "./src/characterImages/angel.png",
                        "./src/characterImages/ghost.png",
                        "./src/characterImages/elf.png",
                        "./src/characterImages/pegasus.png",
                        "./src/characterImages/unicorn.png",
                        "./src/characterImages/king.png",
                        "./src/characterImages/phoenix.png",
                        "./src/characterImages/death.png" };

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

        void room(Player player) {

                JFrame gameFrame = new JFrame();
                JPanel doorsPanel = new javax.swing.JPanel();
                JLabel jLabel1 = new javax.swing.JLabel();
                JButton attackBtn = new javax.swing.JButton();
                JButton runBtn = new javax.swing.JButton();
                JLabel characterTitle = new javax.swing.JLabel();
                JLabel characterIcon = new javax.swing.JLabel();
                QuestionTemp questions = new QuestionTemp();
                JLabel correctCounter = new javax.swing.JLabel();
                JLabel progressText = new javax.swing.JLabel();
                JLabel livesText = new javax.swing.JLabel();
                JLabel livesCounter = new javax.swing.JLabel();

                gameFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                doorsPanel.setBackground(new java.awt.Color(0, 0, 0));
                doorsPanel.setForeground(new java.awt.Color(255, 255, 255));
                characterTitle.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
                characterTitle.setForeground(new java.awt.Color(255, 255, 255));
                characterTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                jLabel1.setFont(new java.awt.Font("Trattatello", 1, 48)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));

                attackBtn.setFont(new java.awt.Font("Trattatello", 0, 24)); // NOI18N
                runBtn.setFont(new java.awt.Font("Trattatello", 0, 18)); // NOI18N

                correctCounter.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
                correctCounter.setForeground(new java.awt.Color(255, 255, 255));
                correctCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                correctCounter.setText(Integer.toString(player.getCorrectQuestions())+ "/"+Integer.toString(Player.END_GAME));

                progressText.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
                progressText.setForeground(new java.awt.Color(255, 255, 255));
                progressText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                progressText.setText("Progress:");

                livesText.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
                livesText.setForeground(new java.awt.Color(255, 255, 255));
                livesText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                livesText.setText("Lives:");

                livesCounter.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
                livesCounter.setForeground(new java.awt.Color(255, 255, 255));
                livesCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                livesCounter.setText(Integer.toString(player.getLifePoints()));

                int friendOrFoe = (int) (Math.random() * 5) + 1;
                if (friendOrFoe > 1) {
                        int monsterChooser = (int) (Math.random() * 6);
                        ImageIcon imageIcon = new ImageIcon(monsterImagePaths[monsterChooser]); // load the image to a
                                                                                                // imageIcon
                        Image image = imageIcon.getImage(); // transform it
                        Image newimg = image.getScaledInstance(350, 350, java.awt.Image.SCALE_SMOOTH); // scale it the
                                                                                                       // smooth way
                        imageIcon = new ImageIcon(newimg);
                        characterIcon.setIcon(imageIcon);
                        characterTitle.setText(monsters[monsterChooser]);
                        jLabel1.setText("Oh No! You found a...");
                        attackBtn.setText("Attack!!");
                        runBtn.setText("Run To The Door!");
                        int damageOrKill = (int) (Math.random() * 2);
                        if (damageOrKill == 0) {
                                attackBtn.addActionListener(new java.awt.event.ActionListener() {
                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                JOptionPane.showMessageDialog(null,
                                                                "You fought the " + monsters[monsterChooser]
                                                                                + " and won, but you took some damage. You lost "+damage[monsterChooser]+" live(s).");
                                                player.setLifePoints(player.getLifePoints() - damage[monsterChooser]);
                                                livesCounter.setText(Integer.toString(player.getLifePoints()));

                                                if (player.getLifePoints() <= 0){
                                                        //end game
                                                gameFrame.dispose();
                                                loseFrame lose = new loseFrame();
                lose.youLost();
                                                } else{
                                                        
                                                        questions.questionPopup(player);
                                                gameFrame.dispose();
                                                }
                                                

                                        }
                                });
                                runBtn.addActionListener(new java.awt.event.ActionListener() {
                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                JOptionPane.showMessageDialog(null,
                                                                        "The " + monsters[monsterChooser]+ " cut your path off and chased you out the room! You're one door further from escaping.");
                                                if (player.getCorrectQuestions() != 0){
                                                        player.setCorrectQuestions(player.getCorrectQuestions()-1);
                                                        correctCounter.setText(Integer.toString(player.getCorrectQuestions())+ "/5");

                                                }
                                                questions.questionPopup(player);

                                                gameFrame.dispose();

        
                                        }
                                });

                        } else {
                                attackBtn.addActionListener(new java.awt.event.ActionListener() {
                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                JOptionPane.showMessageDialog(null,
                                                                "You fought the " + monsters[monsterChooser]
                                                                                + " and won, NO DAMAGE TAKEN!");
                                                questions.questionPopup(player);
                                                gameFrame.dispose();

                                        }
                                });
                                runBtn.addActionListener(new java.awt.event.ActionListener() {
                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                JOptionPane.showMessageDialog(null,
                                                                        "You made it out the door, but you took some damage. You lost "+damage[monsterChooser]+" live(s).");
                                                player.setLifePoints(player.getLifePoints() - damage[monsterChooser]);
                                                livesCounter.setText(Integer.toString(player.getLifePoints()));

                                                if (player.getLifePoints() <= 0){
                                                        //end game
                                                gameFrame.dispose();
                                                loseFrame lose = new loseFrame();
                lose.youLost();
                                                } else{
                                                        
                                                        questions.questionPopup(player);
                                                gameFrame.dispose();
                                                }
        
                                        }
                                });

                        }

                        

                } else {
                        jLabel1.setText("Look! It's A...");
                        int friendChooser = (int) (Math.random() * 7);
                        ImageIcon imageIcon = new ImageIcon(heroImagePaths[friendChooser]); // load the image to a
                                                                                            // imageIcon
                        Image image = imageIcon.getImage(); // transform it
                        Image newimg = image.getScaledInstance(350, 350, java.awt.Image.SCALE_SMOOTH);

                        // smooth way
                        imageIcon = new ImageIcon(newimg);
                        characterIcon.setIcon(imageIcon);

                        characterTitle.setText(helpers[friendChooser]);
                        attackBtn.setVisible(false);

                        runBtn.setText("Thank you");

                        runBtn.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        JOptionPane.showMessageDialog(null,
                                                        "The " + helpers[friendChooser] + " gave you "
                                                                        + heal[friendChooser]
                                                                        + " heart(s)! You thank him and move on.");
                                        player.setLifePoints(player.getLifePoints() + heal[friendChooser]);
                                        livesCounter.setText(Integer.toString(player.getLifePoints()));

                                        questions.questionPopup(player);

                                        gameFrame.dispose();

                                }
                        });

                }

                

                characterIcon.setText("jLabel2");
                characterIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                javax.swing.GroupLayout doorsPanelLayout = new javax.swing.GroupLayout(doorsPanel);
                doorsPanel.setLayout(doorsPanelLayout);
                doorsPanelLayout.setHorizontalGroup(
                                doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doorsPanelLayout
                                                                .createSequentialGroup()
                                                                .addGap(181, 181, 181)
                                                                .addComponent(attackBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                146,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(runBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                149,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(199, 199, 199))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doorsPanelLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(characterIcon,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap())
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doorsPanelLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(364, Short.MAX_VALUE)
                                                                .addGroup(doorsPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(progressText,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                109,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(doorsPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                421,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(191, 191, 191)
                                                                                                .addComponent(livesText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                73,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(doorsPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(correctCounter,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                51,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(livesCounter,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                51,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(12, 12, 12))
                                                .addGroup(doorsPanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                doorsPanelLayout.createSequentialGroup()
                                                                                                .addContainerGap(444,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(characterTitle,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                274,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(412, 412,
                                                                                                                412))));
                doorsPanelLayout.setVerticalGroup(
                                doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(doorsPanelLayout.createSequentialGroup()
                                                                .addGroup(doorsPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                78,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(livesText,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                59,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(livesCounter,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                59,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(doorsPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(progressText,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                59,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(correctCounter,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                59,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(characterIcon,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                397,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(doorsPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(runBtn,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                61,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(attackBtn,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                61,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(45, 45, 45))
                                                .addGroup(doorsPanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(doorsPanelLayout.createSequentialGroup()
                                                                                .addGap(104, 104, 104)
                                                                                .addComponent(characterTitle,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                59,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(496,
                                                                                                Short.MAX_VALUE))));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(gameFrame.getContentPane());
                gameFrame.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(doorsPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(doorsPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                gameFrame.setSize(1130, 659);
                gameFrame.setResizable(false);
                gameFrame.setLocationRelativeTo(null);
                gameFrame.setVisible(true);
                gameFrame.pack();
        }// </editor-fold>

}
