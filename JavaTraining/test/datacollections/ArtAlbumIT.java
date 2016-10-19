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
public class ArtAlbumIT {
    
    public ArtAlbumIT() {
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
     * Test of getQality method, of class ArtAlbum.
     */
    @Test
    public void testGetQality() {
        System.out.println("getQality");
        ArtAlbum instance = new ArtAlbum();
        ArtAlbum.PaperQuality expResult = null;
        ArtAlbum.PaperQuality result = instance.getQality();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetQality1() {
        System.out.println("getQality");
        ArtAlbum instance = new ArtAlbum();
        ArtAlbum.PaperQuality expResult = ArtAlbum.PaperQuality.HIGH;
        instance.setQuality(expResult);
        ArtAlbum.PaperQuality result = instance.getQality();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetQality2() {
        System.out.println("getQality");
        ArtAlbum instance = new ArtAlbum();
        ArtAlbum.PaperQuality expResult = ArtAlbum.PaperQuality.MEDIUM;
        instance.setQuality(expResult);
        ArtAlbum.PaperQuality result = instance.getQality();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetQality3() {
        System.out.println("getQality");
        ArtAlbum instance = new ArtAlbum();
        ArtAlbum.PaperQuality expResult = ArtAlbum.PaperQuality.LOW;
        instance.setQuality(expResult);
        ArtAlbum.PaperQuality result = instance.getQality();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuality method, of class ArtAlbum.
     */
    @Test
    public void testSetQuality() {
        System.out.println("setQuality");
        ArtAlbum.PaperQuality quality = ArtAlbum.PaperQuality.HIGH;
        ArtAlbum instance = new ArtAlbum();
        instance.setQuality(quality);
    }
    
    @Test
    public void testSetQuality1() {
        System.out.println("setQuality");
        ArtAlbum.PaperQuality quality = ArtAlbum.PaperQuality.MEDIUM;
        ArtAlbum instance = new ArtAlbum();
        instance.setQuality(quality);
    }
    
    @Test
    public void testSetQuality2() {
        System.out.println("setQuality");
        ArtAlbum.PaperQuality quality = ArtAlbum.PaperQuality.LOW;
        ArtAlbum instance = new ArtAlbum();
        instance.setQuality(quality);
    }
    
}
