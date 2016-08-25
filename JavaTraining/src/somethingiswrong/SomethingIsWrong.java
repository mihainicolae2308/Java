/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingiswrong;

import java.awt.Rectangle;

/**
 *
 * @author mnicolae
 */
public class SomethingIsWrong {

    
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(); //Using new operator to create an instance of Rectangle
        myRect.width = 40;
        myRect.height = 50;
        //Calculating the area
        int area = myRect.width * myRect.height;
        System.out.println("myRect's area is " + area);
    }
    
}
