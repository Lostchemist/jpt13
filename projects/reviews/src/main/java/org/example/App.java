package org.example;

/**
 * Hello world!
 *
 */
public class App
{

    // Properties

    private String name;
    private String description;

    // constructors
    public App() { }

   // getters setters

    // custom methods

    public static void main(String[] args )
    {

        try {
            User user = new User("admin", "asdfr");
        } catch(IllegalArgumentException e) {
            System.err.println("Couldn't create user. Error: " + e.getMessage());
        }

        System.out.println( "Hello World!" );
    }

}
