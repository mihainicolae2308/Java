/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclasses;

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
public class HelloWorldAnonymousClassesIT {
    
    public HelloWorldAnonymousClassesIT() {
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
     * Test of sayHello method, of class HelloWorldAnonymousClasses.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        HelloWorldAnonymousClasses.LANGUAGES language = HelloWorldAnonymousClasses.LANGUAGES.ENGLISH;
        HelloWorldAnonymousClasses instance = new HelloWorldAnonymousClasses();
        instance.sayHello(language);
    }

    @Test
    public void testSayHello1() {
        System.out.println("sayHello");
        HelloWorldAnonymousClasses.LANGUAGES language = HelloWorldAnonymousClasses.LANGUAGES.FRENCH;
        HelloWorldAnonymousClasses instance = new HelloWorldAnonymousClasses();
        instance.sayHello(language);
    }
    
    @Test
    public void testSayHello2() {
        System.out.println("sayHello");
        HelloWorldAnonymousClasses.LANGUAGES language = HelloWorldAnonymousClasses.LANGUAGES.SPANISH;
        HelloWorldAnonymousClasses instance = new HelloWorldAnonymousClasses();
        instance.sayHello(language);
    }
    
    /**
     * Test of main method, of class HelloWorldAnonymousClasses.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        HelloWorldAnonymousClasses.main();
    }
    
}
