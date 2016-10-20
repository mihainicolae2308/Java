/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiprocess;


import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author Mihai
 */
public class Multiprocess {
    
    private static final Logger logger = LogManager.getLogger(Multiprocess.class);
   
    public static void main(String[] args) {
        ProcessBuilder pb;
        pb = new ProcessBuilder("notepad.exe");
        
        try {
            Process p1 = pb.start();
            logger.info("Opened the first instance of Notepad.");
            Process p2 = pb.start();
            logger.info("Opened the second instance of Notepad.");
            Process p3 = pb.start();
            logger.info("Opened the third instance of Notepad.");
        } catch (IOException ex) {
            logger.error("There was an I/O error when trying to start a process!");
        }
        
        
        
    }
    
}
