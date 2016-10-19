/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

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
public class CnpTesterIT {
    
    public CnpTesterIT() {
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
     * Tests of extraDateValidation method, of class CnpTester.
     */
    
    //Testing a valid date
    @Test
    public void testExtraDateValidation() {
        System.out.println("extraDateValidation");
        String cnp = "1800831213724";
        boolean expResult = true;
        boolean result = CnpTester.extraDateValidation(cnp);
        assertEquals(expResult, result);
    }
    //Test with 31-06 (invalid date)
    @Test
    public void testExtraDateValidation2() {
        System.out.println("extraDateValidation");
        String cnp = "1800631213724";
        boolean expResult = false;
        boolean result = CnpTester.extraDateValidation(cnp);
        assertEquals(expResult, result);
    }
    
    //Test with 30-02 (invalid date)
    @Test
    public void testExtraDateValidation3() {
        System.out.println("extraDateValidation");
        String cnp = "1800230213724";
        boolean expResult = false;
        boolean result = CnpTester.extraDateValidation(cnp);
        assertEquals(expResult, result);
    }
    

    /**
     * Tests of testCnp method, of class CnpTester.
     */
    //Test with an invalid starting number
    @Test
    public void testTestCnp() {
        System.out.println("testCnp");
        String regex = "[1-2][0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[1-9]|2[1-9]|3[0-1])[0-9]{6}";
        String cnp = "3800823213724";
        boolean expResult = false;
        boolean result = CnpTester.testCnp(regex, cnp);
        assertEquals(expResult, result);
    }
    
    //Test that a valid CNP works
    @Test
    public void testTestCnp2() {
        System.out.println("testCnp");
        String regex = "[1-2][0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[1-9]|2[1-9]|3[0-1])[0-9]{6}";
        String cnp = "1800823213724";
        boolean expResult = true;
        boolean result = CnpTester.testCnp(regex, cnp);
        assertEquals(expResult, result);
    }

    //Test with an invalid day (>31)
    @Test
    public void testTestCnp3() {
        System.out.println("testCnp");
        String regex = "[1-2][0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[1-9]|2[1-9]|3[0-1])[0-9]{6}";
        String cnp = "1800832213724";
        boolean expResult = false;
        boolean result = CnpTester.testCnp(regex, cnp);
        assertEquals(expResult, result);
    }
    
    //Test with an invalid month (>12)
    @Test
    public void testTestCnp4() {
        System.out.println("testCnp");
        String regex = "[1-2][0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[1-9]|2[1-9]|3[0-1])[0-9]{6}";
        String cnp = "1801323213724";
        boolean expResult = false;
        boolean result = CnpTester.testCnp(regex, cnp);
        assertEquals(expResult, result);
    }
    
    //Test with a longer number (length > 13)
    @Test
    public void testTestCnp5() {
        System.out.println("testCnp");
        String regex = "[1-2][0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[1-9]|2[1-9]|3[0-1])[0-9]{6}";
        String cnp = "18008232137241";
        boolean expResult = false;
        boolean result = CnpTester.testCnp(regex, cnp);
        assertEquals(expResult, result);
    }    
}
