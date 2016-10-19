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
public class NovelIT {
    
    public NovelIT() {
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
     * Test of getNovelType method, of class Novel.
     */
    @Test
    public void testGetNovelType() {
        System.out.println("getNovelType");
        Novel instance = new Novel();
        Novel.TypeOfNovel expResult = null;
        Novel.TypeOfNovel result = instance.getNovelType();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetNovelType1() {
        System.out.println("getNovelType");
        Novel instance = new Novel();
        instance.setNovelType(Novel.TypeOfNovel.ROMANCE);
        Novel.TypeOfNovel expResult = Novel.TypeOfNovel.ROMANCE;
        Novel.TypeOfNovel result = instance.getNovelType();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetNovelType2() {
        System.out.println("getNovelType");
        Novel instance = new Novel();
        instance.setNovelType(Novel.TypeOfNovel.SF);
        Novel.TypeOfNovel expResult = Novel.TypeOfNovel.SF;
        Novel.TypeOfNovel result = instance.getNovelType();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetNovelType3() {
        System.out.println("getNovelType");
        Novel instance = new Novel();
        instance.setNovelType(Novel.TypeOfNovel.MYSTERY);
        Novel.TypeOfNovel expResult = Novel.TypeOfNovel.MYSTERY;
        Novel.TypeOfNovel result = instance.getNovelType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNovelType method, of class Novel.
     */
    @Test
    public void testSetNovelType() {
        System.out.println("setNovelType");
        Novel.TypeOfNovel novelType = null;
        Novel instance = new Novel();
        instance.setNovelType(novelType);
    }
    
    @Test
    public void testSetNovelType1() {
        System.out.println("setNovelType");
        Novel.TypeOfNovel novelType = Novel.TypeOfNovel.MYSTERY;
        Novel instance = new Novel();
        instance.setNovelType(novelType);
    }
    
    @Test
    public void testSetNovelType2() {
        System.out.println("setNovelType");
        Novel.TypeOfNovel novelType = Novel.TypeOfNovel.ROMANCE;
        Novel instance = new Novel();
        instance.setNovelType(novelType);
    }
    
    @Test
    public void testSetNovelType3() {
        System.out.println("setNovelType");
        Novel.TypeOfNovel novelType = Novel.TypeOfNovel.SF;
        Novel instance = new Novel();
        instance.setNovelType(novelType);
    } 
}
