/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.survey;
import java.awt.Image;
import javax.swing.*;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;


/**
 *
 * @author slam
 */
public class MainSurvey extends javax.swing.JFrame {
    String userInstrument;
    String userSchool;
    String userComposerGuess;
    String userSongGuess;
    String userLearnInstrument;

    public String getUserLearnInstrument() {
        return userLearnInstrument;
    }

    public void setUserLearnInstrument(String userLearnInstrument) {
        this.userLearnInstrument = userLearnInstrument;
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    public String getUserComposerGuess() {
        return userComposerGuess;
    }

    public void setUserComposerGuess(String userComposerGuess) {
        this.userComposerGuess = userComposerGuess;
    }

    public String getUserSongGuess() {
        return userSongGuess;
    }

    public void setUserSongGuess(String userSongGuess) {
        this.userSongGuess = userSongGuess;
    }
    

    public String getUserInstrument() {
        return userInstrument;
    }

    public void setUserInstrument(String userInstrument) {
        this.userInstrument = userInstrument;
    }
    
    /**
     * Creates new form MainSurvey
     */
    public MainSurvey() {
        initComponents();
        scaleImage();
        
    }
    
    public void scaleImage() {
        ImageIcon imageComposer = new ImageIcon("Beethoven.jpg");
        Image img = imageComposer.getImage();
        Image imgScale = img.getScaledInstance(composer1pic.getWidth(), composer1pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        composer1pic.setIcon(scaledIcon);
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instrumentsButtonGroup = new javax.swing.ButtonGroup();
        schoolButtonGroup = new javax.swing.ButtonGroup();
        symphonyButtonGroup = new javax.swing.ButtonGroup();
        composerButtonGroup = new javax.swing.ButtonGroup();
        knowSongButtonGroup = new javax.swing.ButtonGroup();
        classicalInterestButtonGroup = new javax.swing.ButtonGroup();
        popularListeningButtonGroup = new javax.swing.ButtonGroup();
        futureButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        RockCheckBox = new javax.swing.JCheckBox();
        ClassicalCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        AltCheckBox = new javax.swing.JCheckBox();
        DanceCheckBox = new javax.swing.JCheckBox();
        PopCheckBox = new javax.swing.JCheckBox();
        noSymphonyButton = new javax.swing.JRadioButton();
        composer1pic = new javax.swing.JLabel();
        HiphopCheckBox = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        yesSymphonyButton = new javax.swing.JRadioButton();
        noSchoolButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        userNameEntry = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        yesSchoolButton = new javax.swing.JRadioButton();
        noInstrumentButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        yesInstrumentButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        yesComposerButton = new javax.swing.JRadioButton();
        noComposerButton = new javax.swing.JRadioButton();
        submissionButton = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        Sound = new javax.swing.JButton();
        yesKnowSongButton = new javax.swing.JRadioButton();
        noKnowSongButton = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        yesClassicalInterestButton = new javax.swing.JRadioButton();
        noClassicalInterestButton = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        noListeningButton = new javax.swing.JRadioButton();
        yesListeningButton = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        yesFutureButton = new javax.swing.JRadioButton();
        noFutureButton = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Classical Music Survey");
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        RockCheckBox.setText("Rock");

        ClassicalCheckBox.setText("Classical");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Classical Music Survey");

        AltCheckBox.setText("Alternative/Indie");

        DanceCheckBox.setText("Dance/Electronic");

        PopCheckBox.setText("Pop");

        symphonyButtonGroup.add(noSymphonyButton);
        noSymphonyButton.setText("No");

        HiphopCheckBox.setText("Hip-hop/Rap");
        HiphopCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HiphopCheckBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("Have you seen a live symphony before?");

        symphonyButtonGroup.add(yesSymphonyButton);
        yesSymphonyButton.setText("Yes");

        schoolButtonGroup.add(noSchoolButton);
        noSchoolButton.setText("No");

        jLabel5.setText("What are your favorite music genres?");

        userNameEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameEntryActionPerformed(evt);
            }
        });

        jLabel7.setText("Do you recognize this individual?");

        jLabel3.setText("Do you play any musical instruments?");

        schoolButtonGroup.add(yesSchoolButton);
        yesSchoolButton.setText("Yes");
        yesSchoolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesSchoolButtonActionPerformed(evt);
            }
        });

        instrumentsButtonGroup.add(noInstrumentButton);
        noInstrumentButton.setText("No");
        noInstrumentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noInstrumentButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        instrumentsButtonGroup.add(yesInstrumentButton);
        yesInstrumentButton.setText("Yes");
        yesInstrumentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesInstrumentButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Are you in school?");

        composerButtonGroup.add(yesComposerButton);
        yesComposerButton.setText("Yes");
        yesComposerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesComposerButtonActionPerformed(evt);
            }
        });

        composerButtonGroup.add(noComposerButton);
        noComposerButton.setText("No");

        submissionButton.setText("Submit Response");
        submissionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submissionButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Do you recognize the composer of this piece?");

        Sound.setText("Click to Play");
        Sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoundActionPerformed(evt);
            }
        });

        knowSongButtonGroup.add(yesKnowSongButton);
        yesKnowSongButton.setText("Yes");
        yesKnowSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesKnowSongButtonActionPerformed(evt);
            }
        });

        knowSongButtonGroup.add(noKnowSongButton);
        noKnowSongButton.setText("No");

        jLabel9.setText("Are you interested in Classical Music?");

        classicalInterestButtonGroup.add(yesClassicalInterestButton);
        yesClassicalInterestButton.setText("Yes");

        classicalInterestButtonGroup.add(noClassicalInterestButton);
        noClassicalInterestButton.setText("No");

        jLabel10.setText("Do you believe listening to Classical Music is popular?");

        popularListeningButtonGroup.add(noListeningButton);
        noListeningButton.setText("No");

        popularListeningButtonGroup.add(yesListeningButton);
        yesListeningButton.setText("Yes");
        yesListeningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesListeningButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Do you believe that one day,");

        jLabel12.setText("nobody will be interested in listening to Classical Music? ");

        futureButtonGroup.add(yesFutureButton);
        yesFutureButton.setText("Yes");

        futureButtonGroup.add(noFutureButton);
        noFutureButton.setText("No");

        jLabel13.setText("(Hint: Don't get distracted with the image above!)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yesComposerButton)
                    .addComponent(noComposerButton)
                    .addComponent(Sound, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(yesSchoolButton)
                            .addComponent(noSchoolButton)
                            .addComponent(yesInstrumentButton)
                            .addComponent(noInstrumentButton)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PopCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(HiphopCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AltCheckBox))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RockCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(ClassicalCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DanceCheckBox))
                            .addComponent(jLabel6)
                            .addComponent(yesSymphonyButton)
                            .addComponent(noSymphonyButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(userNameEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addComponent(composer1pic, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(noKnowSongButton)
                            .addComponent(yesKnowSongButton)
                            .addComponent(jLabel9)
                            .addComponent(yesClassicalInterestButton)
                            .addComponent(noClassicalInterestButton)
                            .addComponent(jLabel10)
                            .addComponent(noListeningButton)
                            .addComponent(yesListeningButton)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yesFutureButton)
                            .addComponent(noFutureButton)
                            .addComponent(jLabel13)))
                    .addComponent(submissionButton))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userNameEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yesInstrumentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noInstrumentButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yesSchoolButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noSchoolButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PopCheckBox)
                    .addComponent(HiphopCheckBox)
                    .addComponent(AltCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RockCheckBox)
                    .addComponent(ClassicalCheckBox)
                    .addComponent(DanceCheckBox))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yesSymphonyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noSymphonyButton)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(composer1pic, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yesComposerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noComposerButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sound)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yesKnowSongButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noKnowSongButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(yesClassicalInterestButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noClassicalInterestButton)
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yesListeningButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noListeningButton)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yesFutureButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noFutureButton)
                .addGap(18, 18, 18)
                .addComponent(submissionButton)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameEntryActionPerformed

    private void HiphopCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HiphopCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HiphopCheckBoxActionPerformed

    private void yesInstrumentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesInstrumentButtonActionPerformed
        // TODO add your handling code here:
        String instrumentPlayed = (String)JOptionPane.showInputDialog(
               this,
               "What instrument do you play?", 
               "Instrument Survey",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               ""
            );
        
        setUserInstrument(instrumentPlayed);
        
    }//GEN-LAST:event_yesInstrumentButtonActionPerformed


    
    private void submissionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submissionButtonActionPerformed
        // TODO add your handling code here:
        
        String name;
        String userInstrument = "N/A";
        String userLearnInstrument = "N/A";
        String userSchool = "N/A";
        String userComposerGuess = "N/A";
        String userSongGuess = "N/A";
        
        boolean instrument = false;
        boolean school = false;
        boolean symphony = false;
        boolean pop = false;
        boolean hipHop = false; 
        boolean alt = false;
        boolean rock = false;
        boolean classical = false;
        boolean dance = false;
        boolean composer = false;
        boolean knowsSong = false;
        boolean classicalInterest = false;
        boolean popularListening = false;
        boolean classicalFuture = false;
        
        
        if (userNameEntry.getText().isEmpty() || 
            (!(yesInstrumentButton.isSelected()) && !(noInstrumentButton.isSelected())) ||
                (!(yesSchoolButton.isSelected()) && !(noSchoolButton.isSelected())) ||
                (!(yesSymphonyButton.isSelected()) && !(noSymphonyButton.isSelected())) ||
                (!(yesComposerButton.isSelected()) && !(noComposerButton.isSelected())) ||
                (!(yesKnowSongButton.isSelected()) && !(noKnowSongButton.isSelected())) ||
                (!(yesClassicalInterestButton.isSelected()) && !(noClassicalInterestButton.isSelected())) ||
                (!(yesListeningButton.isSelected()) && !(noListeningButton.isSelected())) ||
                (!(yesFutureButton.isSelected()) && !(noFutureButton.isSelected()))) {
            JOptionPane.showMessageDialog(null, "You failed to complete all portions of the form. Please reopen and try again.");
        } else {
            
            //Name Entry
            name = userNameEntry.getText().trim();
            
            //Do you play any musical instruments?
            if (yesInstrumentButton.isSelected()) {
                instrument = true;
                userInstrument = getUserInstrument();
            }
            
            if (noInstrumentButton.isSelected()) {
               userLearnInstrument = getUserLearnInstrument(); 
            }
            
            //Are you in school?
            if (yesSchoolButton.isSelected()) {
                school = true; 
                userSchool = getUserSchool();
            } 
            
            //What are your favorite music genres?
             if (PopCheckBox.isSelected()) {
                pop = true;
            }
            if (HiphopCheckBox.isSelected()) {
                hipHop = true;
            }
            if (AltCheckBox.isSelected()) {
                alt = true;
            }
            if (RockCheckBox.isSelected()) {
                rock = true;
            }
            if (ClassicalCheckBox.isSelected()) {
                classical = true;
            }
            if (DanceCheckBox.isSelected()) {
                dance = true;
            }
           
            //Have you seen a live symphony before?                     
            if (yesSymphonyButton.isSelected()) {
                symphony = true; 
            } 
            
            //Do you recognize this individual?
            if (yesComposerButton.isSelected()) {
                composer = true;
                userComposerGuess = getUserComposerGuess();
            }
            
            
            //Do you recognize the composer of this piece?
            if (yesKnowSongButton.isSelected()) {
                knowsSong = true;
                userSongGuess = getUserSongGuess();
            }
            
            //Are you interested in Classical Music?
            if (yesClassicalInterestButton.isSelected()) {
                classicalInterest = true;
            }
            
            //Do you believe listening to Classical Music is popular?
            if (yesListeningButton.isSelected()) {
                popularListening = true;
            }
            
            //Do you believe that one day, nobody will be interested?
            if (yesFutureButton.isSelected()) {
                classicalFuture = true;
            }
            
            
            try {
            File file = new File("surveyData.txt");

            if (!file.exists()) {
            file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file);
                       
            pw.write("Name: " + name + "\n");
            pw.write("Plays instrument: " + instrument + "\n");
            pw.write("Plays the: " + userInstrument + "\n");
            pw.write("In School: " + school + "\n");
            pw.write("School's Name: " + userSchool + "\n");
            pw.write("Likes Pop: " + pop + "\n");
            pw.write("Likes Hip-Hop: " + hipHop + "\n");
            pw.write("Likes Alt/Indie: " + alt + "\n");
            pw.write("Likes Rock: " + rock + "\n");
            pw.write("Likes Classical: " + classical + "\n");
            pw.write("Likes Dance: " + dance + "\n");
            pw.write("Seen Symphony: " + symphony + "\n");
            pw.write("Knows Composer: " + composer + "\n");
            pw.write("Composer Guess: " + userComposerGuess + "\n");
            pw.write("Knows Song/Composer: " + knowsSong + "\n");
            pw.write("Song Composer Guess: " + userSongGuess + "\n");
            pw.write("Interested in Classical Music: " + classicalInterest + "\n");
            pw.write("Believes Classical Music is Popular: " + popularListening + "\n");
            pw.write("Death of Classical Music: " + classicalFuture + "\n");
            
            
            pw.close();
            
            JOptionPane.showMessageDialog(null, "Successfully Submitted!");

            
            } catch (IOException e) {
               
                JOptionPane.showMessageDialog(null, "Error");
            }
            
            
            
            
            
        }
        
        dispose();
        
    }//GEN-LAST:event_submissionButtonActionPerformed

    private void yesComposerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesComposerButtonActionPerformed
        // TODO add your handling code here:
        String composerGuess = (String)JOptionPane.showInputDialog(
               this,
               "What is their name?", 
               "Composer Survey",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               ""
            );
        
        setUserComposerGuess(composerGuess);
    }//GEN-LAST:event_yesComposerButtonActionPerformed

    private void SoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoundActionPerformed
        // TODO add your handling code here:
        String filepath = "song.wav";
        
        musicStuff musicObject = new musicStuff();
        musicObject.playMusic(filepath);
       
    
    }//GEN-LAST:event_SoundActionPerformed

    private void yesKnowSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesKnowSongButtonActionPerformed
        // TODO add your handling code here:
        String songGuess = (String)JOptionPane.showInputDialog(
               this,
               "Who composed this song?", 
               "Song Survey",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               ""
            );
        
        setUserSongGuess(songGuess);
    }//GEN-LAST:event_yesKnowSongButtonActionPerformed

    private void noInstrumentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noInstrumentButtonActionPerformed
        // TODO add your handling code here:
        String learnInstrument = (String)JOptionPane.showInputDialog(
               this,
               "What instrument would you want to learn how to play?", 
               "Learn An Instrument Survey",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               ""
            );
        
        setUserLearnInstrument(learnInstrument);
    }//GEN-LAST:event_noInstrumentButtonActionPerformed

    private void yesSchoolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesSchoolButtonActionPerformed
        // TODO add your handling code here:
        String school = (String)JOptionPane.showInputDialog(
               this,
               "What is the name of your school?", 
               "School Survey",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               ""
            );
        
        setUserSchool(school);
      
    }//GEN-LAST:event_yesSchoolButtonActionPerformed

    private void yesListeningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesListeningButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesListeningButtonActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(MainSurvey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSurvey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSurvey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSurvey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSurvey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AltCheckBox;
    private javax.swing.JCheckBox ClassicalCheckBox;
    private javax.swing.JCheckBox DanceCheckBox;
    private javax.swing.JCheckBox HiphopCheckBox;
    private javax.swing.JCheckBox PopCheckBox;
    private javax.swing.JCheckBox RockCheckBox;
    private javax.swing.JButton Sound;
    private javax.swing.ButtonGroup classicalInterestButtonGroup;
    private javax.swing.JLabel composer1pic;
    private javax.swing.ButtonGroup composerButtonGroup;
    private javax.swing.ButtonGroup futureButtonGroup;
    private javax.swing.ButtonGroup instrumentsButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup knowSongButtonGroup;
    private javax.swing.JRadioButton noClassicalInterestButton;
    private javax.swing.JRadioButton noComposerButton;
    private javax.swing.JRadioButton noFutureButton;
    private javax.swing.JRadioButton noInstrumentButton;
    private javax.swing.JRadioButton noKnowSongButton;
    private javax.swing.JRadioButton noListeningButton;
    private javax.swing.JRadioButton noSchoolButton;
    private javax.swing.JRadioButton noSymphonyButton;
    private javax.swing.ButtonGroup popularListeningButtonGroup;
    private javax.swing.ButtonGroup schoolButtonGroup;
    private javax.swing.JToggleButton submissionButton;
    private javax.swing.ButtonGroup symphonyButtonGroup;
    private javax.swing.JTextField userNameEntry;
    private javax.swing.JRadioButton yesClassicalInterestButton;
    private javax.swing.JRadioButton yesComposerButton;
    private javax.swing.JRadioButton yesFutureButton;
    private javax.swing.JRadioButton yesInstrumentButton;
    private javax.swing.JRadioButton yesKnowSongButton;
    private javax.swing.JRadioButton yesListeningButton;
    private javax.swing.JRadioButton yesSchoolButton;
    private javax.swing.JRadioButton yesSymphonyButton;
    // End of variables declaration//GEN-END:variables
}


