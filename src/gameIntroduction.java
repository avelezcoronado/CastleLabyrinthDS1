import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class gameIntroduction {

        void introframe(Player player) {
                JFrame gameFrame = new JFrame();

                JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
                JTextArea jTextArea1 = new javax.swing.JTextArea();
                JPanel enterName = new javax.swing.JPanel();
                JLabel jLabel1 = new javax.swing.JLabel();
                JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
                JTextArea jTextArea2 = new javax.swing.JTextArea();
                JButton jButton1 = new javax.swing.JButton();

                jTextArea1.setColumns(20);
                jTextArea1.setRows(5);
                jScrollPane1.setViewportView(jTextArea1);

                gameFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                gameFrame.setSize(new java.awt.Dimension(700, 500));

                enterName.setBackground(new java.awt.Color(0, 0, 0));
                enterName.setForeground(new java.awt.Color(255, 255, 255));

                jLabel1.setFont(new java.awt.Font("Trattatello", 1, 48)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Your journey begins!");

                jTextArea2.setEditable(false);
                jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
                jTextArea2.setColumns(20);
                jTextArea2.setFont(new java.awt.Font("Trattatello", 0, 36)); // NOI18N
                jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
                jTextArea2.setLineWrap(true);
                jTextArea2.setRows(5);
                jTextArea2.setText(
                                "Once upon a time, " + player.getPlayerName()
                                                + " was walking in the night in his village. A terrible dragon swooped down and grabbed him with his claws and took him to a castle in another kingdom in the distance, the dragon threw him towards the top of the castle on the terrace and the dragon vanished into the darkness...");
                jTextArea2.setAutoscrolls(false);
                jTextArea2.setRequestFocusEnabled(false);
                jScrollPane2.setViewportView(jTextArea2);
                jScrollPane2.setBorder(null);

                jButton1.setFont(new java.awt.Font("Trattatello", 0, 20)); // NOI18N
                jButton1.setText("Start!");

                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                QuestionTemp popupQuestion = new QuestionTemp();
                                popupQuestion.questionPopup(player);
                                gameFrame.dispose();

                        }
                });

                javax.swing.GroupLayout enterNameLayout = new javax.swing.GroupLayout(enterName);
                enterName.setLayout(enterNameLayout);
                enterNameLayout.setHorizontalGroup(
                                enterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(enterNameLayout.createSequentialGroup()
                                                                .addGroup(enterNameLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(enterNameLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(17, 17, 17)
                                                                                                .addComponent(jScrollPane2))
                                                                                .addGroup(enterNameLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(345, 345, 345)
                                                                                                .addComponent(jLabel1)
                                                                                                .addGap(0, 351, Short.MAX_VALUE)))
                                                                .addContainerGap())
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enterNameLayout
                                                                .createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                128,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(462, 462, 462)));
                enterNameLayout.setVerticalGroup(
                                enterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(enterNameLayout.createSequentialGroup()
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 15, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(gameFrame.getContentPane());
                gameFrame.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(enterName, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(enterName,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                gameFrame.setResizable(false);
                gameFrame.setSize(1130, 659);
                gameFrame.setLocationRelativeTo(null);
                gameFrame.setVisible(true);
                gameFrame.pack();
        }// </editor-fold>

}
