/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersmagic;

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
public class NumbersMagicIT {
    
    public NumbersMagicIT() {
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
     * Test of customeFormat method, of class NumbersMagic.
     */
    @Test
    public void testCustomeFormat() {
        System.out.println("customeFormat");
        String pattern = "\"%10.3f%n\"";
        double value = 23.056;
        NumbersMagic.customeFormat(pattern, value);
    }

    /**
     * Test of main method, of class NumbersMagic.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NumbersMagic.main(args);
    }
    
}
