/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logging;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
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

public class LibraryCatalog {
    
    private static final Logger logger = LogManager.getLogger(LibraryCatalog.class);

    private static void addNovel(HashSet l, String name, int noPages, Novel.TypeOfNovel typeOfNovel, int isbn) {
        Novel n = new Novel();
        n.setName(name);
        n.setNumberOfPages(noPages);
        n.setNovelType(typeOfNovel);
        n.setIsbn(isbn);
        l.add(n);        
    }
    
    private static void addArtAlbum(HashSet l, String name, int noPages, ArtAlbum.PaperQuality quality, int isbn) {
        ArtAlbum a = new ArtAlbum();
        a.setName(name);
        a.setNumberOfPages(noPages);
        a.setQuality(quality);
        a.setIsbn(isbn);
        l.add(a);
    }
    
    private static void listBooks(HashSet l) {
        Iterator it = l.iterator();
        while (it.hasNext()) {
            Book currentBook = (Book)it.next();
            System.out.println(currentBook.getName());          
        }
        
//Another implementation using "for each" loop, left in the code as example for learning purposes
//        for (Object book : l) {
//            Book currentBook = (Book)book;
//            System.out.println(currentBook.getName());
//        }
    }
    
    private static void removeBook(HashSet l, int isbn) {
        Iterator it = l.iterator();
        while (it.hasNext()) {
            Book currentBook = (Book)it.next();
            if (currentBook.getIsbn() == isbn) {
                logger.info("Removing the book with ISBN= " + currentBook.getIsbn());
                it.remove();
            }          
        }
    }
    
    private static void addBooksToFile(File f, HashSet l) {
        FileWriter fw;
        try {
            fw = new FileWriter(f);
        
        Iterator it = l.iterator();
        while (it.hasNext()) {
            Book currentBook = (Book)it.next();
            fw.write(currentBook.getName() + ", " + currentBook.getNumberOfPages() + " pages\n");
        }
        fw.close();
        } catch (IOException ex) {
            logger.error("There was a problem opening the file for writing");
        }
    }
            
    
    
    private static void searchBook(File f, String title) throws NotExistingBook {
        Scanner scanner;
        try {
            scanner = new Scanner(f);
        
//Parsing the file contents line by line:        
        
            boolean bookFound = false;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(title) || line.toLowerCase().contains(title)) {
                    System.out.println("The book '" + line.split(",")[0] + "' has been found");
                    bookFound = true;
                }
            }
            if (bookFound == false) {   
                throw new NotExistingBook("Required book didn't exist in our bookstore.");
            }
            
        } catch (FileNotFoundException ex) {
            logger.fatal("The file has not been found");
        }
        
//Another possible implementation with FileReader and BufferedReader
//This code is left here just for learning purposes
        
//        FileReader fr = new FileReader(f);
//        BufferedReader br = new BufferedReader(fr);
//        
//        String line = br.readLine();
//        while (line != null) {
//            line = br.readLine();
//            if (line.contains(title) || line.toLowerCase().contains(title)) {
//                System.out.println("Exista");
//            }
//        } 
    }
    
    
    public static void main(String[] args) {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
        
        
        
        HashSet listOfBooks = new HashSet();
        addNovel(listOfBooks, "Star Wars", 232, Novel.TypeOfNovel.SF, 23541);
        addArtAlbum(listOfBooks, "Picasso", 157, ArtAlbum.PaperQuality.HIGH, 54343);
        addArtAlbum(listOfBooks, "Grigorescu", 115, ArtAlbum.PaperQuality.MEDIUM, 98546);
        addNovel(listOfBooks, "Codul lui Da Vinci", 313, Novel.TypeOfNovel.MYSTERY, 50080);
        addNovel(listOfBooks, "Life of Picasso", 213, Novel.TypeOfNovel.ROMANCE, 55113);
        
        System.out.println("List of books:");
        listBooks(listOfBooks);
        System.out.println("Removing one book from the list");
        removeBook(listOfBooks, 50080);
        System.out.println("The updated list:");
        listBooks(listOfBooks);

        File f = new File("bookstore.txt");
        
        addBooksToFile(f, listOfBooks);
        
        try {
            searchBook(f, "picasso");  
        } catch (NotExistingBook ex) {
            logger.error(ex.getMessage());
        }
    }
    
}
