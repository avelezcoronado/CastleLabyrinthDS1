import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BossFight {

    void FinalFight(Player player) {
        JFrame gameFrame = new JFrame();
        JPanel doorsPanel = new javax.swing.JPanel();
        JLabel jLabel1 = new javax.swing.JLabel();
        JLabel progressCounter = new javax.swing.JLabel();
        JLabel progressText = new javax.swing.JLabel();
        JLabel characterTitle = new javax.swing.JLabel();
        JLabel livesText = new javax.swing.JLabel();
        JLabel livesCounter = new javax.swing.JLabel();
        JLabel jLabel2 = new javax.swing.JLabel();
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea jTextArea1 = new javax.swing.JTextArea();
        JButton jButton1 = new javax.swing.JButton();
        JButton jButton2 = new javax.swing.JButton();
        JButton jButton3 = new javax.swing.JButton();

        gameFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        doorsPanel.setBackground(new java.awt.Color(0, 0, 0));
        doorsPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trattatello", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("You made it to the...");

        progressCounter.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
        progressCounter.setForeground(new java.awt.Color(255, 255, 255));
        progressCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progressCounter.setText(Integer.toString(player.getCorrectQuestions())+"/5");

        progressText.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
        progressText.setForeground(new java.awt.Color(255, 255, 255));
        progressText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progressText.setText("Progress:");

        characterTitle.setFont(new java.awt.Font("Trattatello", 0, 48)); // NOI18N
        characterTitle.setForeground(new java.awt.Color(255, 255, 255));
        characterTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        characterTitle.setText("BOSS FIGHT");

        livesText.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
        livesText.setForeground(new java.awt.Color(255, 255, 255));
        livesText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        livesText.setText("Lives:");

        livesCounter.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
        livesCounter.setForeground(new java.awt.Color(255, 255, 255));
        livesCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        livesCounter.setText(Integer.toString(player.getLifePoints()));

        jLabel2.setIcon(new javax.swing.ImageIcon("./src/characterImages/boss.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(
                "I see you made it through my collection of mythical creatures...\nWell I have one final question for you!\nWho is the best professor at Unison?");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);
        jScrollPane1.setBorder(null);

        jButton1.setFont(new java.awt.Font("Trattatello", 0, 24)); // NOI18N
        jButton1.setText("Schmitz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        jButton2.setFont(new java.awt.Font("Trattatello", 0, 24)); // NOI18N
        jButton2.setText("Schmitz");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        jButton3.setFont(new java.awt.Font("Trattatello", 0, 24)); // NOI18N
        jButton3.setText("Schmitz");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        javax.swing.GroupLayout doorsPanelLayout = new javax.swing.GroupLayout(doorsPanel);
        doorsPanel.setLayout(doorsPanelLayout);
        doorsPanelLayout.setHorizontalGroup(
                doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                .addGroup(doorsPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        1110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                                .addGap(447, 447, 447)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(14, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doorsPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(doorsPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doorsPanelLayout
                                                .createSequentialGroup()
                                                .addGroup(doorsPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                                                .addComponent(characterTitle,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 274,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(250, 250, 250)
                                                                .addComponent(progressText,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 109,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                                                .addComponent(jLabel1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 421,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(191, 191, 191)
                                                                .addComponent(livesText,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 73,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(doorsPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(progressCounter,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(livesCounter,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                doorsPanelLayout.createSequentialGroup()
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(180, 180, 180)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(219, 219, 219))))
                        .addGroup(doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(doorsPanelLayout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(793, Short.MAX_VALUE))));
        doorsPanelLayout.setVerticalGroup(
                doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(doorsPanelLayout.createSequentialGroup()
                                .addGroup(
                                        doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(livesText, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(livesCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(progressText, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(progressCounter, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(characterTitle, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24,
                                        Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(
                                        doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                        .addGroup(doorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        doorsPanelLayout.createSequentialGroup()
                                                .addContainerGap(616, Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(gameFrame.getContentPane());
        gameFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(doorsPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(doorsPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        gameFrame.setResizable(false);
        gameFrame.setSize(1130, 659);

        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);
        gameFrame.pack();
    }// </editor-fold>

}
