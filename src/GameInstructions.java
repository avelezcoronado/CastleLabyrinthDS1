import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GameInstructions {

        void howToPlay(Player player) {
                gameIntroduction intro = new gameIntroduction();

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
                jLabel1.setText("How To Play");

                jTextArea2.setEditable(false);
                jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
                jTextArea2.setColumns(20);
                jTextArea2.setFont(new java.awt.Font("Trattatello", 0, 24)); // NOI18N
                jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
                jTextArea2.setLineWrap(true);
                jTextArea2.setRows(5);
                jTextArea2.setText(
                                "Obective: Find your way to the exit of the castle through a maze of rooms filled with mythical monsters and heros...\nTo fight the monster or try and run around is your choice...but you must face the consequences.\n\nBefore entering a room a mysterious voice asks you a question...get it right and move forward, get it wrong and lose a life.With only 7 lives you better be prepared...5 Questions right and your free!\n\nGood Luck,\nThe Castle Keeper");
                jTextArea2.setAutoscrolls(false);
                jTextArea2.setRequestFocusEnabled(false);
                jScrollPane2.setViewportView(jTextArea2);
                jScrollPane2.setBorder(null);

                jButton1.setFont(new java.awt.Font("Trattatello", 0, 24)); // NOI18N
                jButton1.setText("Begin");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                intro.introframe(player);
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
                                                                                                .addGap(401, 401, 401)
                                                                                                .addComponent(jLabel1))
                                                                                .addGroup(enterNameLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(450, 450, 450)
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                128,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(409, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                enterNameLayout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(jScrollPane2)));
                enterNameLayout.setVerticalGroup(
                                enterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(enterNameLayout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jScrollPane2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                371,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

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
                gameFrame.setSize(1130, 659);

                gameFrame.setLocationRelativeTo(null);
                gameFrame.setVisible(true);
                gameFrame.setResizable(false);
                gameFrame.pack();
        }// </editor-fold>

}
