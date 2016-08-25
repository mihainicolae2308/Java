/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclasses;

/**
 *
 * @author mnicolae
 */
public class HelloWorldAnonymousClasses {

    // define constants for languages

    //static final int ENGLISH = 0;

    //static final int FRENCH =1;

    //static final int SPANISH =2;



    /**

     * enumeration of languages to prevent bad argument values

     */

    public enum LANGUAGES {ENGLISH, FRENCH,SPANISH}

    

    // Inner interface HelloWorld

    interface HelloWorld {

        public void greet();

        public void greetSomeone(String someone);

    }

    // Method sayHello prints 

    public void sayHello(LANGUAGES language) {



        // Local class EnglishGreetings implemented in the method sayHello()

        class EnglishGreeting implements HelloWorld {

            String name = "world";

            @Override

            public void greet() {

                greetSomeone("world");

            }

            @Override

            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Hello " + name);

            }

        } // end of EnglishGreeting local class

        // create an EnglishGreeting object/instance 

        HelloWorld englishGreeting = new EnglishGreeting();

        // create a class that greets in French language

        class FrenchGreeting implements HelloWorld {

            String name = "tout le monde";

            @Override

            public void greet() {

                greetSomeone("tout le monde");

            }

            @Override

            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Salut " + name);

            }

        } // End of FrenchGreeting local class
        
        //Create a FrenchGreeting instance
        
        HelloWorld frenchGreeting = new FrenchGreeting();
        
        // create a class for Spanish language

        class SpanishGreeting implements HelloWorld {

            String name = "mundo";

            @Override

            public void greet() {

                greetSomeone("mundo");

            }

            @Override

            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Hola, " + name);

            }

        } // End of SpanishGreeting local class
        
        // Create a SpanishGreeting instance
        
        HelloWorld spanishGreeting = new SpanishGreeting();

        switch (language) {

            case ENGLISH:

                englishGreeting.greet();

                break;

            case FRENCH:

                frenchGreeting.greetSomeone("Fred");

                break;

            case SPANISH:

                spanishGreeting.greet();

                break;

            default:

                System.out.println("You should take Nobel Price!");

                break;

        }

    }

    // main method

    public static void main(String... args) {

        HelloWorldAnonymousClasses myApp =

            new HelloWorldAnonymousClasses();

        myApp.sayHello(LANGUAGES.ENGLISH);

        //myApp.sayHello(LANGUAGES.FRENCH);

        myApp.sayHello(LANGUAGES.FRENCH);

        //myApp.sayHello(10);

        myApp.sayHello(LANGUAGES.SPANISH);

    }            
    
}
