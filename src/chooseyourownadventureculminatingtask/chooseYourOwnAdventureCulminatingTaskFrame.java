/*
 * Seth James England
 * chooseYourOwnAdventureCulminatingTask.java
 * Its a choose your won adventure game
 * 05/06/2018
 */

package chooseyourownadventureculminatingtask;
import java.util.*;
/**
 * Seth James England
 */
public class chooseYourOwnAdventureCulminatingTaskFrame extends javax.swing.JFrame {
    int count = 0;
    int wait = 0;
    String answers = "";
    String allowedAnswer = "1";
    String allowedAnswer2 = "2";
    String allowedAnswer3 = "3";
    String allowedAnswer4 = "4";
    int Death = (int)Math.ceil(Math.random()*50);
    ArrayList <String> items = new ArrayList();

    public chooseYourOwnAdventureCulminatingTaskFrame() {
        initComponents();
        answerButton.setEnabled(false);
         System.out.println(Death);
         
       }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mTTa = new javax.swing.JTextArea();
        answerButton = new javax.swing.JButton();
        inputAnswer = new javax.swing.JTextField();
        secretsFoundLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsTextArea = new javax.swing.JTextArea();
        lootLabel = new javax.swing.JLabel();
        initializeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mTTa.setEditable(false);
        mTTa.setColumns(20);
        mTTa.setFont(new java.awt.Font("Manga Temple", 0, 10)); // NOI18N
        mTTa.setRows(5);
        jScrollPane1.setViewportView(mTTa);

        answerButton.setText("Answer");
        answerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonActionPerformed(evt);
            }
        });

        secretsFoundLabel.setText("Secrets Found: 0");

        itemsTextArea.setEditable(false);
        itemsTextArea.setColumns(20);
        itemsTextArea.setRows(5);
        jScrollPane2.setViewportView(itemsTextArea);

        lootLabel.setText("Gold: 0");

        initializeButton.setText("Initialize");
        initializeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initializeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lootLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(secretsFoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(initializeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 119, Short.MAX_VALUE)
                        .addComponent(answerButton)
                        .addGap(8, 8, 8)
                        .addComponent(inputAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answerButton)
                            .addComponent(inputAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lootLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(secretsFoundLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(initializeButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButtonActionPerformed
        answers = inputAnswer.getText();
        int waitingAndWaiting = (int)Math.ceil(Math.random()*1);
         if (allowedAnswer.equals(answers)) {
           mTTa.setText("");
           if (itsYaBoyDeath(0) == 0) {
               mTTa.setText("You have died! Please Re-Initialize ");
               answerButton.setEnabled(false);
               initializeButton.setEnabled(true);
               itemsTextArea.setText("");
         }
           else {
               mTTa.setText("You Look out the window, your feet dangling precariously..."
                       + "\nLuckily, you have climbed down one whole floor! \nYou can either:"
                       + "\n1. Climb inside the window"
                       + "\n2. Try your luck again in climbing down \n(1/3 chance of instant death!)");
              count++;
              System.out.println(count);
              if (count == 5){
                  mTTa.setText("And so... you have reached my final floor");
              }
              }
         }
         else if (allowedAnswer2.equals(answers)) {
             switch (count) {
                 case 0:
                 mTTa.setText("");
                 mTTa.append("You enter the first floor\n");
                 mTTa.append("In front of you, a Goblin is rummaging through a chest,\nhe "
                         + "looks pretty distracted... you can either:\n"
                         + "1. Try to sneak past him (sneak)\n"
                         + "2. Fight him! (fight)");
                 switch (answers) {
                     case "72":
                         mTTa.setText("you die");
                         break;
                     case "73":
                         mTTa.setText("you fight the goblin");
                         break;
                 }
             }
         }
             else if (count == 1) {
                 mTTa.setText("");
                 mTTa.append("You enter the second floor");
             }
              else if (count == 2) {
                 mTTa.setText("");
                 mTTa.append("You enter the third floor");
             } else if (count == 3) {
                 mTTa.setText("");
                 mTTa.append("You enter the fourth floor");
             } else if (count == 4) {
                 mTTa.setText("");
                 mTTa.append("You enter the fifth floor");
             }
         
         else if (allowedAnswer3.equals(answers)) {
            mTTa.setText("");
            mTTa.append("You sit there waiting."
                    + "\n Waiting and waiting"
                    + "\n Are you bored yet?");
            wait++;
            if (wait >= 25){
                mTTa.setText("");
                mTTa.append("A wobbly old man walks into the room you've been waiting \nin for so long... 'What are you doing here?' he asks. \n'You shouldn't be here, oh no this is a terrible mistake. \nI hope you excuse that we left you up here for an entire \nday!' The wobbly old man guides you down the tower \nsafely, and gives you some gold to compensate for your \nmisery! 'Have a nice day young lad!' He yells as you walk \nback home. 'What a crazy day' You think." );
                mTTa.append("\n\n"
                        + "So yeah, you won my game\n"
                        + "but you typed 'wait' like a silly person 25 times\n"
                        + "so whos the real winner? \n"
                        + "Kisses - Seth James England");
                lootLabel.setText("Gold: 1000");
                answerButton.setEnabled(false);
               initializeButton.setEnabled(true);
            }
          }
          if (allowedAnswer4.equals(answers)) { 
            mTTa.setText("");
            mTTa.append("You decide to look around the room, at first glance \nit doesn't look as if it contains anything important, but \nyou spot a note! You grab it as it may prove useful later... \nYou also spot a stick and a wand, which one would you like \nto pick up?");
            itemsTextArea.append("Note - 1");
            mTTa.append("\n\n1. Pick up the wand (w) \n2. Pick up the bone (b)"); 
          }
            else if (answers.equals("w")){
            mTTa.setText("");
            mTTa.append("You pick up the wand! What a fantastic choice... \nHowever the bone disappears as soon as you picked up \nthe wand! it looks like you'll have to continue without \nthe bone...");
            answerButton.setEnabled(true);
            items.add("Wand");
            itemsTextArea.append("Wand - 1 \n");
            mTTa.append("\nYou now have 3 options... \n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
                    }
            else if (answers.equals("b")){
            mTTa.setText("");
            mTTa.append("You pick up the bone! What a fantastic choice... \nHowever the wand disappears as soon as you picked up \nthe bone! it looks like you'll have to continue without \nthe wand...");
            answerButton.setEnabled(true);
            items.add("Bone)");
            itemsTextArea.append("Bone - 1 \n");
            mTTa.append("\nYou now have 3 options... \n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
          }      
    }//GEN-LAST:event_answerButtonActionPerformed

    private void initializeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initializeButtonActionPerformed
        answerButton.setEnabled(true);
        initializeButton.setEnabled(false);
        count = 0;
        wait = 0;
        mTTa.setText("");
        mTTa.append("You awaken in a dark room, you can't remember anything");
        mTTa.append("\n");
        mTTa.append("yet you have a strong suspicion you are in a wizards");
        mTTa.append("\n");
        mTTa.append("tower...");
        mTTa.append("\n");
        mTTa.append("\n");
        mTTa.append("You realize that you have four options... \n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n 4. Look around the room \n \n please type the number you've chosen");
    }//GEN-LAST:event_initializeButtonActionPerformed
    public int itsYaBoyDeath (int chanceOfDeath) {
        int value = (int)Math.ceil(Math.random()*3);
        //System.out.println(value);
        if (value == Death) {
        chanceOfDeath = 0;
      }
        else if(value != Death){
        chanceOfDeath = 1;
    }
        return chanceOfDeath;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chooseYourOwnAdventureCulminatingTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chooseYourOwnAdventureCulminatingTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chooseYourOwnAdventureCulminatingTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chooseYourOwnAdventureCulminatingTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chooseYourOwnAdventureCulminatingTaskFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton;
    private javax.swing.JButton initializeButton;
    private javax.swing.JTextField inputAnswer;
    private javax.swing.JTextArea itemsTextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lootLabel;
    private javax.swing.JTextArea mTTa;
    private javax.swing.JLabel secretsFoundLabel;
    // End of variables declaration//GEN-END:variables
}
