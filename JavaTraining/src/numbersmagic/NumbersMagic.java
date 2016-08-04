/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersmagic;

import java.util.Calendar;

/**
 *
 * @author mnicolae
 */
public class NumbersMagic {

    /**
     * @param args the command line arguments
     */
    
    static void customeFormat(String pattern, double value) {
            System.out.format(pattern, value);
        }
    
    public static void main(String[] args) {
        //Math methods
        System.out.println(Math.abs(-191.635));
        System.out.println(Math.ceil(43.74));
        System.out.println(Math.floor(43.74));
        System.out.println(Math.rint(43.74));
        System.out.println(Math.max(16, 45));
        System.out.println(Math.min(16, 45));
        System.out.println(Math.E);
        System.out.println(Math.exp(11.635));
        System.out.println(Math.log(11.635));
        System.out.println(Math.pow(11.635, 2.76));
        System.out.println(Math.sqrt(11.635));
        System.out.println(Math.random()*10);
        System.out.println(Math.random()*10);
        System.out.println(Math.random()*10);
        
        //System.out.format
        System.out.format("%d%n", 461012);
        System.out.format("%08d%n", 461012);
        System.out.format("%+d%n", 461012);
        System.out.format("%,d%n", 461012);
        System.out.format("%,+d%n", 461012);
        
        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
        System.out.format("%tm/%td/%ty%n", c, c, c);
        
        //Using customeFormat method 
        customeFormat("%f%n", Math.PI);
        customeFormat("%.3f%n", Math.PI);
        customeFormat("%10.3f%n", Math.PI);     
        
    }
    
}
