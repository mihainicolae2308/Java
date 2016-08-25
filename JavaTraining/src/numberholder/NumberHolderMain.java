/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberholder;

/**
 *
 * @author mnicolae
 */
public class NumberHolderMain {

    public static void main(String[] args) {
        NumberHolder myNumber = new NumberHolder();
        myNumber.anInt = 23;
        myNumber.aFloat = (float) 5.7;
        System.out.println("The integer value is: " + myNumber.anInt);
        System.out.println("The float value is: " + myNumber.aFloat);
    }
    
}
