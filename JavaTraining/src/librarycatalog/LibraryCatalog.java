/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycatalog;

import java.util.LinkedList;

/**
 *
 * @author mnicolae
 */
public class LibraryCatalog {

    private static void addNovel(LinkedList l, String name, int noPages, Novel.TypeOfNovel typeOfNovel) {
        Novel n = new Novel();
        n.setName(name);
        n.setNumberOfPages(noPages);
        n.setNovelType(typeOfNovel);
        l.add(n);        
    }
    
    private static void addArtAlbum(LinkedList l, String name, int noPages, ArtAlbum.PaperQuality quality) {
        ArtAlbum a = new ArtAlbum();
        a.setName(name);
        a.setNumberOfPages(noPages);
        a.setQuality(quality);
        l.add(a);
    }
    
    private static void removeBook(LinkedList l, int index) {
        l.remove(index);
    }
    
    private static void listBooks(LinkedList l) {
        short index = 0;
        try {
            while (l.get(index) != null) {
                Book currentBook = (Book)l.get(index);
                System.out.println(currentBook.getName());
                index++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("End of list!");
            System.out.println("********************");
        }
    }
            
    public static void main(String[] args) {
        LinkedList listOfBooks = new LinkedList();
        addNovel(listOfBooks, "Star Wars", 232, Novel.TypeOfNovel.SF);
        addArtAlbum(listOfBooks, "Picasso", 157, ArtAlbum.PaperQuality.HIGH);
        addArtAlbum(listOfBooks, "Grigorescu", 115, ArtAlbum.PaperQuality.MEDIUM);
        addNovel(listOfBooks, "Codul lui Da Vinci", 313, Novel.TypeOfNovel.MYSTERY);
        listBooks(listOfBooks);
        System.out.println("Removing first book in the list:");
        removeBook(listOfBooks, 0);
        System.out.println("New list:");
        listBooks(listOfBooks);
        
    }
    
}
