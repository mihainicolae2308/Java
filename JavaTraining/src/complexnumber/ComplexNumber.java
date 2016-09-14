/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

/**
 *
 * @author mnicolae
 */
public class ComplexNumber extends Number {

    //Dummy implementation of abstract methods in Number class 
    
    @Override
    public int intValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long longValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float floatValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double doubleValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //The real and imaginary part of the complex number
    private double x,y;
    
    //The constructor with real and imaginary parts as parameters
    public ComplexNumber(double a,double b) {
        x = a;
        y = b;
    }
    
    //Method for returning the real part of a complex number
    public double getReal() {
        return x;
    }
    
    //Method for returning the imaginary part
    public double getImag() {
        return y;
    }
    
    //Method for verifying the equality relation between two complex numbers
    public boolean isEqual(ComplexNumber a) {
        if (x == a.x && y == a.y)
            return true;
        else
            return false;
    }
    
    //Method for returning the conjugate of a complex number
    public ComplexNumber conjugate() {
        return new ComplexNumber(x, -y);
    }
    
    //Method for adding a complex number
    public ComplexNumber addNumber(ComplexNumber a) {
        return new ComplexNumber(x + a.getReal(), y + a.getImag());
    }
    
    //Method for substracting a complex number
    public ComplexNumber substractNumber(ComplexNumber a) {
        return new ComplexNumber(x - a.getReal(), y - a.getImag());
    }
    
    //Method for multilying by a complex number
    public ComplexNumber multiplyBy(ComplexNumber a) {
        return new ComplexNumber(x * a.getReal() - y * a.getImag() , y * a.getReal() + x * a.getImag());
    }
    
    //Method for dividing by a complex number
    public ComplexNumber divBy(ComplexNumber a) {
        return new ComplexNumber((x * a.getReal() + y * a.getImag())/(Math.pow(a.getReal(), 2) + Math.pow(a.getImag(),2)), 
                (y * a.getReal() - x * a.getImag())/(Math.pow(a.getReal(), 2) + Math.pow(a.getImag(),2)));
    }
    
    //Method for calculating the reciprocal of a complex number
    public ComplexNumber reciprocal() {
        return new ComplexNumber(x/(Math.pow(x, 2) + Math.pow(y, 2)), -y/(Math.pow(x, 2) + Math.pow(y, 2)));
    }
    
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2.0, 3.0);
        ComplexNumber b = new ComplexNumber(2.0, 3.0);
        ComplexNumber c = new ComplexNumber(3.0, 2.0);
        
        System.out.println("Verifying the equality between a and b");
        if (a.isEqual(b)) 
            System.out.println("The numbers are equal");
        else
            System.out.println("The numbers are not equal");
        
        System.out.println("Verifying the equality between a and c");
        if (a.isEqual(c)) 
            System.out.println("The numbers are equal");
        else
            System.out.println("The numbers are not equal");
        
        //Calculating the conjugate of number a
        ComplexNumber aConj = a.conjugate();
        System.out.println("The conjugate of number " + a.getReal() + " + " + "i * " + a.getImag() + " is: " 
                + aConj.getReal() + " + " + "i * " + aConj.getImag());
        
        System.out.println("The sum of a and c is: " + a.addNumber(c).getReal() + " + " + "i * " + a.addNumber(c).getImag());
        System.out.println("The difference between a and c is: " + a.substractNumber(c).getReal() + " + " + "i * " + a.substractNumber(c).getImag());
        System.out.println("a multiplied by c is: " + a.multiplyBy(c).getReal() + " + " + "i * " + a.multiplyBy(c).getImag());
        System.out.println("a divided by c is: " + a.divBy(c).getReal() + " + " + "i * " + a.divBy(c).getImag());
        System.out.println("a divided by b is: " + a.divBy(b).getReal() + " + " + "i * " + a.divBy(b).getImag());
        System.out.println("The reciprocal of number a is: " + a.reciprocal().getReal() + " + " + "i * " + a.reciprocal().getImag());
     }
        
}


    
