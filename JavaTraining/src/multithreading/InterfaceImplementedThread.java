/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.lang.reflect.Method;

/**
 *
 * @author Mihai
 */
public class InterfaceImplementedThread implements Runnable {
    public void displayMethods() {   
        for (Class c = this.getClass(); c != null; c = c.getSuperclass()) {
            for (Method method : c.getDeclaredMethods()) {
                System.out.println(c.getName() + "." + method.getName());
            }
        }
    }

    @Override
    public void run() {
        this.displayMethods();
    }
    
}
