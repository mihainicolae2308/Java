/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

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
public class ComplexNumberIT {
    
    public ComplexNumberIT() {
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
     * Test of getReal method, of class ComplexNumber.
     */
    @Test
    public void testGetReal() {
        System.out.println("getReal");
        ComplexNumber instance = new ComplexNumber(3.0, 4.0);
        double expResult = 3.0;
        double result = instance.getReal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getImag method, of class ComplexNumber.
     */
    @Test
    public void testGetImag() {
        System.out.println("getImag");
        ComplexNumber instance = new ComplexNumber(3.0, 4.0);
        double expResult = 4.0;
        double result = instance.getImag();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of isEqual method, of class ComplexNumber.
     */
    @Test
    public void testIsEqual() {
        System.out.println("isEqual");
        ComplexNumber a = new ComplexNumber(3.0, 4.0);;
        ComplexNumber instance = new ComplexNumber(4.0, 3.0);;
        boolean expResult = false;
        boolean result = instance.isEqual(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsEqual1() {
        System.out.println("isEqual");
        ComplexNumber a = new ComplexNumber(3.0, 4.0);;
        ComplexNumber instance = new ComplexNumber(3.0, 4.0);;
        boolean expResult = true;
        boolean result = instance.isEqual(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of conjugate method, of class ComplexNumber.
     */
    @Test
    public void testConjugate() {
        System.out.println("conjugate");
        ComplexNumber instance = new ComplexNumber(4.0, 5.0);
        ComplexNumber expResult = new ComplexNumber(4.0, -5.0);
        ComplexNumber result = instance.conjugate();
        assertTrue(result.isEqual(expResult));
    }

    /**
     * Test of addNumber method, of class ComplexNumber.
     */
    @Test
    public void testAddNumber() {
        System.out.println("addNumber");
        ComplexNumber a = new ComplexNumber(2.0, 6.0);
        ComplexNumber instance = new ComplexNumber(3.0, 2.0);
        ComplexNumber expResult = new ComplexNumber(5.0, 8.0);
        ComplexNumber result = instance.addNumber(a);
        assertTrue(result.isEqual(expResult));
    }

    /**
     * Test of substractNumber method, of class ComplexNumber.
     */
    @Test
    public void testSubstractNumber() {
        System.out.println("substractNumber");
        ComplexNumber a = new ComplexNumber(2.0, 6.0);
        ComplexNumber instance = new ComplexNumber(3.0, 2.0);
        ComplexNumber expResult = new ComplexNumber(1.0, -4.0);
        ComplexNumber result = instance.substractNumber(a);
        assertTrue(result.isEqual(expResult));
    }

    /**
     * Test of multiplyBy method, of class ComplexNumber.
     */
    @Test
    public void testMultiplyBy() {
        System.out.println("multiplyBy");
        ComplexNumber a = new ComplexNumber(3.0, 2.0);
        ComplexNumber instance = new ComplexNumber(2.0, 1.0);
        ComplexNumber expResult = new ComplexNumber(4.0, 7.0);
        ComplexNumber result = instance.multiplyBy(a);
        assertTrue(result.isEqual(expResult));
    }

    /**
     * Test of divBy method, of class ComplexNumber.
     */
    @Test
    public void testDivBy() {
        System.out.println("divBy");
        ComplexNumber a = new ComplexNumber(2.0, 1.0);
        ComplexNumber instance = new ComplexNumber(3.0, 2.0);
        ComplexNumber expResult = new ComplexNumber(1.6, 0.2);
        ComplexNumber result = instance.divBy(a);
        assertTrue(result.isEqual(expResult));
    }

    /**
     * Test of reciprocal method, of class ComplexNumber.
     */
    @Test
    public void testReciprocal() {
        System.out.println("reciprocal");
        ComplexNumber instance = new ComplexNumber(2.0, 1.0);;
        ComplexNumber expResult = new ComplexNumber(0.4, -0.2);
        ComplexNumber result = instance.reciprocal();
        assertTrue(result.isEqual(expResult));    
    }
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ComplexNumber.main(args);
    }

    
}
