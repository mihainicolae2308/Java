/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datacollections;

import logging.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


/**
 *
 * @author mnicolae
 */
class NotExistingBook extends Exception {

        public NotExistingBook(String message) {
            super(message);
        }
    }

class InvalidEvaluation extends Exception {

        public InvalidEvaluation(String message) {
            super(message);
        }
    }

public class LibraryCatalog {
    
    private static final Logger logger = LogManager.getLogger(LibraryCatalog.class);

    private static void addNovel(HashSet l, String name, int noPages, Novel.TypeOfNovel typeOfNovel, int isbn) {
        Novel n = new Novel();
        n.setName(name);
        n.setNumberOfPages(noPages);
        n.setNovelType(typeOfNovel);
        n.setIsbn(isbn);
        l.add(n);
        logger.info("The book '" + name + "' has been created.");
    }
    
    private static void addArtAlbum(HashSet l, String name, int noPages, ArtAlbum.PaperQuality quality, int isbn) {
        ArtAlbum a = new ArtAlbum();
        a.setName(name);
        a.setNumberOfPages(noPages);
        a.setQuality(quality);
        a.setIsbn(isbn);
        l.add(a);
        logger.info("The book '" + name + "' has been created.");
    }
    
    private static void addEvaluation(HashMap hm, Book b, double stars, int user_id, StringBuilder description) throws InvalidEvaluation {
        if (stars < 1 || stars > 5 || stars%0.5 != 0.0) {
            throw new InvalidEvaluation("The stars must be between 1 and 5 and multiple of 0.5");
        } else {
            if (user_id <= 0 || user_id >9999) {
                throw new InvalidEvaluation("Invalid user_id");
            } else {
                if (description == null) {
                    throw new InvalidEvaluation("description is a mandatory field");
                } 
            }
        }
        
        Evaluation ev = new Evaluation();
        ev.setStars(stars);
        ev.setUser_id(user_id);
        ev.setDescription(description);
        addBookEvaluationToHashMap(hm, b, ev);
    }
            
    private static void addBookEvaluationToHashMap(HashMap hm, Book b, Evaluation ev) {
        hm.put(ev, b);
    } 
    
    private static void assignEvaluationsToBooks (HashSet hs, HashMap hm) {
        StringBuilder sb1 = new StringBuilder("Very good book.");
        StringBuilder sb2 = new StringBuilder("Good and entertaining book.");
        StringBuilder sb3 = new StringBuilder("Mind blowing.");
        StringBuilder sb4 = new StringBuilder("Interesting.");
        StringBuilder sb5 = new StringBuilder("Not so good as I expected.");
        StringBuilder sb6 = new StringBuilder("Very boring.");
        StringBuilder sb7 = new StringBuilder("Too many details and not so much action.");
        
        for (Object book : hs) {
            Book currentBook = (Book)book;
            if ("Star Wars".equals(currentBook.getName())) {
                try {
                    addEvaluation(hm, currentBook, 4.1, 1202, sb1);
                } catch (InvalidEvaluation ex) {
                    logger.error(ex.getMessage());
                    System.out.println("Invalid evaluation: " + ex.getMessage());
                }
                try {
                    addEvaluation(hm, currentBook, 4.5, 1205, sb1);
                } catch (InvalidEvaluation ex) {
                    logger.error(ex.getMessage());
                    System.out.println("Invalid evaluation: " + ex.getMessage());
                }
                
                try {
                    addEvaluation(hm, currentBook, 5.0, 2014, sb3);
                } catch (InvalidEvaluation ex) {
                    logger.error(ex.getMessage());
                    System.out.println("Invalid evaluation: " + ex.getMessage());
                }
            }
            if ("Rembrandt".equals(currentBook.getName())) {
                try {
                    addEvaluation(hm, currentBook, 3.5, 1202, sb4);
                } catch (InvalidEvaluation ex) {
                    logger.error(ex.getMessage());
                    System.out.println("Invalid evaluation: " + ex.getMessage());
                }
            
                try {
                    addEvaluation(hm, currentBook, 3.5, 10001, sb4);
                } catch (InvalidEvaluation ex) {
                    logger.error(ex.getMessage());
                    System.out.println("Invalid evaluation: " + ex.getMessage());
                }
                
                try {
                    addEvaluation(hm, currentBook, 1.0, 2014, sb6);
                } catch (InvalidEvaluation ex) {
                    logger.error(ex.getMessage());
                    System.out.println("Invalid evaluation: " + ex.getMessage());
                }
            }
            if ("Ingeri si demoni".equals(currentBook.getName())) {
                try {
                    addEvaluation(hm, currentBook, 5.0, 3301, sb3);
                } catch (InvalidEvaluation ex) {
                    logger.error(ex.getMessage());
                    System.out.println("Invalid evaluation: " + ex.getMessage());
                }
            
                try {
                    addEvaluation(hm, currentBook, 4.0, 2014, sb2);
                } catch (InvalidEvaluation ex) {
                    logger.error(ex.getMessage());
                    System.out.println("Invalid evaluation: " + ex.getMessage());
                }
            }
            if ("Cel mai iubit dintre pamanteni".equals(currentBook.getName()))
                try {
                    addEvaluation(hm, currentBook, 2.5, 1202, sb7);
                } catch (InvalidEvaluation ex) {
                    logger.error(ex.getMessage());
                    System.out.println("Invalid evaluation: " + ex.getMessage());
                }
        }
    } 
    
    private static void listBooks(HashSet l) {
        Iterator it = l.iterator();
        while (it.hasNext()) {
            Book currentBook = (Book)it.next();
            System.out.println(currentBook.getName());          
        }
    }
    
    private static void listEvaluations(HashMap hm) {
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            Evaluation currentEvaluation = (Evaluation)entry.getKey();
            Book currentBook = (Book)entry.getValue();
            System.out.println(currentEvaluation.getStars() + " stars, evaluated by " + currentEvaluation.getUser_id() + ", " +
                    currentEvaluation.getDescription() + " For book: " + currentBook.getName());
        }
    }
        
    
    
    public static void main(String[] args) {
        HashSet listOfBooks = new HashSet();
        
        HashMap<Evaluation, Book> soldBooks = new HashMap();
        
        addNovel(listOfBooks, "Star Wars", 232, Novel.TypeOfNovel.SF, 23541);
        addArtAlbum(listOfBooks, "Rembrandt", 122, ArtAlbum.PaperQuality.MEDIUM, 32419);
        addNovel(listOfBooks, "Ingeri si demoni", 413, Novel.TypeOfNovel.MYSTERY, 52380);
        addNovel(listOfBooks, "Cel mai iubit dintre pamanteni", 213, Novel.TypeOfNovel.ROMANCE, 25113);
               
        System.out.println("List of books:");
        listBooks(listOfBooks);
        
        assignEvaluationsToBooks(listOfBooks, soldBooks);
        listEvaluations(soldBooks);
        
    }

      
}
