/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datacollections;

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
public class EvaluationIT {
    
    public EvaluationIT() {
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
     * Test of getDescription method, of class Evaluation.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Evaluation instance = new Evaluation();
        StringBuilder expResult = null;
        StringBuilder result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescription method, of class Evaluation.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        StringBuilder description = null;
        Evaluation instance = new Evaluation();
        instance.setDescription(description);
    }

    /**
     * Test of getUser_id method, of class Evaluation.
     */
    @Test
    public void testGetUser_id() {
        System.out.println("getUser_id");
        Evaluation instance = new Evaluation();
        int expResult = 0;
        int result = instance.getUser_id();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser_id method, of class Evaluation.
     */
    @Test
    public void testSetUser_id() {
        System.out.println("setUser_id");
        int user_id = 0;
        Evaluation instance = new Evaluation();
        instance.setUser_id(user_id);
    }

    /**
     * Test of getStars method, of class Evaluation.
     */
    @Test
    public void testGetStars() {
        System.out.println("getStars");
        Evaluation instance = new Evaluation();
        double expResult = 0.0;
        double result = instance.getStars();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setStars method, of class Evaluation.
     */
    @Test
    public void testSetStars() {
        System.out.println("setStars");
        double stars = 0.0;
        Evaluation instance = new Evaluation();
        instance.setStars(stars);
    }
    
}
