/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.survey;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author slam
 */
public class musicStuff {
    
    void playMusic(String musicLocation) {
        
        try {
            File musicPath = new File(musicLocation);
            
            
            if(musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                
                JOptionPane.showMessageDialog(null, "Press OK to pause");
                long clipTimePosition = clip.getMicrosecondPosition();
                clip.stop();
                
                JOptionPane.showMessageDialog(null, "Press OK to resume");
                clip.setMicrosecondPosition(clipTimePosition);
                clip.start();
                
                JOptionPane.showMessageDialog(null, "Press OK to stop");
                clip.stop();
                
                
            } else {
                System.out.println("Can't find file");
            }
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        
        
    }
    
    
    
}
