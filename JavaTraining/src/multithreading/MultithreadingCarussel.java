/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Mihai
 */
public class MultithreadingCarussel {

    public static void main(String[] args) {
        InheritedThread inht = new InheritedThread();
        InterfaceImplementedThread iit = new InterfaceImplementedThread();
        inht.start();
        iit.run();     
    }
    
}
