/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Mihai
 */
public class CnpTester {

    /**
     * @param args the command line arguments
     */
    
    //Method for verifying the correct month legth (the regular expression allows the interval [1-31] for all months)
    public static boolean extraDateValidation(String cnp) {
        int month = Integer.parseInt(cnp.substring(3,5));
        int day = Integer.parseInt(cnp.substring(5,7));
        if ((((month == 2) || (month == 6) || (month == 9) || (month == 11)) && (day == 31)) || ((month == 2) &&((day == 30) || (day == 31)))) {
            return false;
        } else {
            return true;
        }
    }
    
    //Method for testing the CNP format based on a regular expresion
    public static boolean testCnp(String regex, String cnp) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cnp);
        boolean isMonthLengthCorrect = extraDateValidation(cnp);
        // verify if the inserted CNP matches the regular expresion and the correct month length verified by extraDateValidation() method
        return matcher.matches() && isMonthLengthCorrect;
    }
    
    public static void main(String[] args) {
        
        String regex = "[1-2][0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[1-9]|2[1-9]|3[0-1])[0-9]{6}";
        
        // read the source string using a new Scanner object
        Scanner scannerSourceString = new Scanner(System.in);
        System.out.println("Insert CNP: ");
        String source = scannerSourceString.next();
        
        
        boolean isCnpValid = testCnp(regex, source);
        if (isCnpValid) {
            System.out.println("CNP valid");
        } else {
            System.out.println("CNP invalid");
        }
    }
    
}
