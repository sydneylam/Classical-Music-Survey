/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.survey;

/**
 *
 * @author slam
 */

import java.io.*;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

class userData {

    
    private String name;
    private boolean playInstrument, inSchool, seenConcert;
    
    public userData(String name, boolean playInstrument, boolean inSchool, boolean seenConcert) {
        this.name = name;
        this.playInstrument = playInstrument;
        this.inSchool = inSchool;
        this.seenConcert = seenConcert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPlayInstrument() {
        return playInstrument;
    }

    public void setPlayInstrument(boolean playInstrument) {
        this.playInstrument = playInstrument;
    }

    public boolean isInSchool() {
        return inSchool;
    }

    public void setInSchool(boolean inSchool) {
        this.inSchool = inSchool;
    }

    public boolean isSeenConcert() {
        return seenConcert;
    }

    public void setSeenConcert(boolean seenConcert) {
        this.seenConcert = seenConcert;
    }
    
   
   
    
    
    
}





public class MusicSurvey {
    
    public static void main (String[] args) {
        
        String filepath = "song.wav";
        
        musicStuff musicObject = new musicStuff();
        musicObject.playMusic(filepath);
        
        
    }
    
    
}
