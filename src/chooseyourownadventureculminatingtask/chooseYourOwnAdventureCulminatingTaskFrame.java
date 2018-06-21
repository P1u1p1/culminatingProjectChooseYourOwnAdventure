/*
 * Seth James England
 * chooseYourOwnAdventureCulminatingTask.java
 * Its a choose your own adventure game
 * 05/06/2018
 */

package chooseyourownadventureculminatingtask;
import java.util.*;
/**
 * Seth James England
 */
public class chooseYourOwnAdventureCulminatingTaskFrame extends javax.swing.JFrame {
    //Here is my set of global variables, allowing the program to run smoothly
    int count = 0;
    int wait = 0;
    String answers = "";
    String allowedAnswer = "1";
    String allowedAnswer2 = "2";
    String allowedAnswer3 = "3";
    String allowedAnswer4 = "4";
    int Death = (int)Math.ceil(Math.random()*3);
    //the items array list
    ArrayList <String> items = new ArrayList();
   
    public chooseYourOwnAdventureCulminatingTaskFrame() {
        //this i simply added a couple of buttons that turn as false until initialized
        initComponents();
        answerButton.setEnabled(false);
        nextFloorButton.setEnabled(false);
        //a random check 
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
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsTextArea = new javax.swing.JTextArea();
        lootLabel = new javax.swing.JLabel();
        initializeButton = new javax.swing.JButton();
        nextFloorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBar(null);

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

        inputAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputAnswerKeyTyped(evt);
            }
        });

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

        nextFloorButton.setText("Next Floor");
        nextFloorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextFloorButtonActionPerformed(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lootLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(87, 87, 87))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(initializeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nextFloorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(answerButton)
                        .addGap(8, 8, 8)
                        .addComponent(inputAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerButton)
                    .addComponent(inputAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lootLabel)
                    .addComponent(nextFloorButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(initializeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        answers = inputAnswer.getText(); // my answer check from the text box 
         //checking for the first answer
        if (allowedAnswer.equals(answers)) {
           mTTa.setText("");
           //my complicated, yet not complicated death statement
           if (itsYaBoyDeath(0) == 0) {
               mTTa.setText("You have died! Please Re-Initialize ");
               answerButton.setEnabled(false);
               initializeButton.setEnabled(true);
               itemsTextArea.setText("");
         }
           else {
               mTTa.setText("You Look out the window, your feet dangling \nprecariously..."
                       + "Please continue to the next floor");
              nextFloorButton.setEnabled(true);
              answerButton.setEnabled(false);
           }  
         }
        // checking for the second answer
        else if (allowedAnswer2.equals(answers)) {
                nextFloorButton.setEnabled(true);
                answerButton.setEnabled(false);
                mTTa.setText("");
                mTTa.append("Please continue to the next floor");
            
        }
        //checking for the third answer
        else if (allowedAnswer3.equals(answers)) {
            waitingGame(0);
            wait++;
            // an instant win if "wait" gets to 25 or over, just a little secret
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
        // your first ability to get some items!
         else if (allowedAnswer4.equals(answers)) { 
            mTTa.setText("");
            mTTa.append("You decide to look around the room, at first glance \nit doesn't look as if it contains anything important, \nbut you spot a note! You grab it as it may prove \nuseful later... You also spot a stick and a wand, \nwhich one would you like to pick up?");
            itemsTextArea.append("Note - 1\n");
            items.add("Note");
            mTTa.append("\n\n1. Pick up the wand (w) \n2. Pick up the bone (b)"); 
          }
          else if (answers.equals("w")){
            mTTa.setText("");
            mTTa.append("You pick up the wand! What a fantastic choice... \nHowever the bone disappears as soon as you picked up \nthe wand! it looks like you'll have to continue without \nthe bone...");
            answerButton.setEnabled(true);
            items.add("Wand");
            itemsTextArea.append("Wand - 1 \n");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
                    }
          else if (answers.equals("b")){
            mTTa.setText("");
            mTTa.append("You pick up the bone! What a fantastic choice... \nHowever the wand disappears as soon as you picked up \nthe bone! it looks like you'll have to continue without \nthe wand...");
            answerButton.setEnabled(true);
            items.add("Bone");
            itemsTextArea.append("Bone - 1 \n");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
          }   
         
    }//GEN-LAST:event_answerButtonActionPerformed
    /**
     * my initialized code for my initialize button
     * @param evt
    */
    private void initializeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initializeButtonActionPerformed
        // ITITIALIZE
        answerButton.setEnabled(true);
        initializeButton.setEnabled(false);
        wait = 0;
        mTTa.setText("");
        mTTa.append("You awaken in a dark room, you can't remember \nanything... ");
        mTTa.append("yet you have a strong suspicion you are in \na wizards");
        mTTa.append(" ");
        mTTa.append("tower...");
        mTTa.append("\n");
        mTTa.append("\n");
        mTTa.append("You realize that you have four options... \n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n 4. Look around the room \n \n please type the number you've chosen");
    }//GEN-LAST:event_initializeButtonActionPerformed

    private void inputAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputAnswerKeyTyped
        
    }//GEN-LAST:event_inputAnswerKeyTyped
/**
 * This is an extremely important part of my code, it determines what item variables to pass onto the next fame, which also determines how your adventure plays out! I explained the foreign
 * code within the statement, but basically is takes a variable from a array, and turns it into a string, it then opens the next frame (which has code within its run component that opens two voided spots) and declares those two spots as variables, which also has a statement that allows this in the initcomponents section.
 * @param evt 
 */
    private void nextFloorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextFloorButtonActionPerformed
         // an if statement checking for the items 
        if (items.isEmpty()) {
             String info[]=new String[2];  //creates an array to store variable values. You can increase the size when needed
             info[0]="a"; //put jTextField1's value in the array.
             info[1]="a";
             floor1.main(info); // call floor1. Here we create an object of a floor1. We are passing info as arguments to main function.
             this.setVisible(false);
          }
        else if (items.get(1).equals("Wand")) {
             String info[]=new String[2];  //creates an array to store variable values. You can increase the size when needed
             info[0]=items.get(0); //put jTextField1's value in the array.
             info[1]=items.get(1);
             floor1.main(info); // call floor1. Here we create an object of a floor1. We are passing info as arguments to main function.
             this.setVisible(false);
         }
         else if (items.get(1).equals("Bone")) {
             String info[]=new String[2];  //creates an array to store variable values. You can increase the size when needed
             info[0]=items.get(0); //put jTextField1's value in the array.
             info[1]=items.get(1);
             floor1.main(info); // call floor1. Here we create an object of a floor1. We are passing info as arguments to main function.
             this.setVisible(false);
         }
    }//GEN-LAST:event_nextFloorButtonActionPerformed
    /**
     * My method to determine if you die
     * @param chanceOfDeath
     * @return 
     */
    public int itsYaBoyDeath (int chanceOfDeath) {
        // the declaration of a new random number
        int value = (int)Math.ceil(Math.random()*3);
        //System.out.println(value);
        //the check of the death
        if (value == Death) {
        chanceOfDeath = 0;
      }
        else if(value != Death){
        chanceOfDeath = 1;
    }
        // returning whatever it gives you
        return chanceOfDeath;
    }
    /**
     * not gonna lie, I didn't really need this i just wanted to use another 
     * method to get a better overall mark on this project to show my understanding
     * @param waitUp
     * @return 
     */
    public int waitingGame (int waitUp) {
        // a new random
        int howItFeelsToWait = (int)Math.ceil(Math.random()*10);
        //System.out.println(value);
        // the very large check statement to see wat wait message you would get, theres ten
        if (howItFeelsToWait == 1) {
        waitUp = 0;
        mTTa.setText("");
            mTTa.append("You sit there waiting."
                    + "\nWaiting and waiting"
                    + "\nAre you bored yet?");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
      }
        else if (howItFeelsToWait ==2) {
             waitUp = 0;
        mTTa.setText("");
            mTTa.append("You sit there waiting."
                    + "\nWaiting and waiting"
                    + "\nWhy are you like this? honestly");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
        }
        else if (howItFeelsToWait ==3) {
             waitUp = 0;
        mTTa.setText("");
            mTTa.append("You sit there waiting."
                    + "\nWaiting and waiting"
                    + "\nI bet you're super bored right?");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
        }
        else if (howItFeelsToWait ==4) {
             waitUp = 0;
        mTTa.setText("");
            mTTa.append("You sit there waiting."
                    + "\nWaiting and waiting"
                    + "\nHonestly it seems like you're wasting your time");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
        }  
        else if (howItFeelsToWait ==5) {
             waitUp = 0;
        mTTa.setText("");
            mTTa.append("You sit there waiting."
                    + "\nWaiting and waiting"
                    + "\nWho raised you to be this curious");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
        }
        else if (howItFeelsToWait ==6) {
             waitUp = 0;
        mTTa.setText("");
            mTTa.append("You sit there waiting."
                    + "\nWaiting and waiting"
                    + "\nJust get on with the adventure!!!");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
        }
        else if (howItFeelsToWait ==7) {
             waitUp = 0;
        mTTa.setText("");
            mTTa.append("You sit there waiting."
                    + "\nWaiting and waiting"
                    + "\nWhat could possibly happen with all this waiting?");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
        }
         else if (howItFeelsToWait ==8) {
             waitUp = 0;
        mTTa.setText("");
            mTTa.append("You sit there waiting."
                    + "\nWaiting and waiting"
                    + "\nYou're the worst kind of adventurer/prisoner");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
        }
         else if (howItFeelsToWait ==9) {
             waitUp = 0;
        mTTa.setText("");
            mTTa.append("You sit there waiting."
                    + "\nWaiting and waiting"
                    + "\nWhat could possibly happen with all this waiting?");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
        }
         else if (howItFeelsToWait ==10) {
             waitUp = 0;
        mTTa.setText("");
            mTTa.append("You sit there waiting."
                    + "\nWaiting and waiting"
                    + "\nPlease, JUST CONTINUE THE ADVENTURE");
            mTTa.append("\nYou now have 3 options... \n\n 1. Go out the window and climb to safety \n (1/3 chance of instant DEATH) \n 2. Go down the stairs into the first floor down \n 3. Sit here and wait \n \n please type the number you've chosen");
        }
        return waitUp;
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
    private javax.swing.JButton nextFloorButton;
    // End of variables declaration//GEN-END:variables
}
