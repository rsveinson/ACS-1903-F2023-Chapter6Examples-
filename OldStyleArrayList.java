import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 * Declaring an ArrayList that is not typesafe.
 * Not a recommended practice, but something
 * you might see in legacy code.
 */
public class OldStyleArrayList
{
    public static void main(String[] args){
        // No type specification for people
        // Hence, any old object will do
        ArrayList people = new ArrayList();
        
        // Add some elements 
        people.add("Abigail");
        people.add("Jim");
        
        // these two adds are for demonstration
        people.add(System.out);
        people.add(new Random());
        people.add(new Object());
        
        //String st = people.get(3);
        
        // display the people
        System.out.println(people);
        for (Object p: people)
            System.out.println(p);
    }
}
