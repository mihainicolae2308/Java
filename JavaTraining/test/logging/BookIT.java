/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logging;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mihai
 */
public class BookIT {
    
    public BookIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIsbn method, of class Book.
     */
    @Test
    public void testGetNumberOfPages() {
        System.out.println("getNumberOfPages");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getNumberOfPages();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetNumberOfPages1() {
        System.out.println("getNumberOfPages");
        Book instance = new Book();
        int expResult = 257;
        instance.setNumberOfPages(257);
        int result = instance.getNumberOfPages();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumberOfPages method, of class Book.
     */
    @Test
    public void testSetNumberOfPages() {
        System.out.println("setNumberOfPages");
        int numberOfPages = 0;
        Book instance = new Book();
        instance.setNumberOfPages(numberOfPages);
    }

    /**
     * Test of getName method, of class Book.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Book instance = new Book();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetName1() {
        System.out.println("getName");
        Book instance = new Book();
        String expResult = "Tyuiop";
        instance.setName("Tyuiop");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Book.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Book instance = new Book();
        instance.setName(name);
    }
    
}
