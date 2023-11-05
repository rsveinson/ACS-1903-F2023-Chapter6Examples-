import java.util.Scanner;
import java.util.ArrayList;
/**
 * Prevent duplicate elements in ArrayList
 */
public class PreventDuplicatesInArrayList
{
    public static void main(String[] args){
        ArrayList<String> people=new ArrayList<String>();
        
        // add some names 
        Scanner kb = new Scanner(System.in);
        System.out.println("enter names followed"
            +" by the word stop: ");
            
        String name = kb.next();
        
        while (!name.equals("stop")) {
            // people.add() will only execute if
            // the current name read from kb is
            // not already present in the list
            if (!people.contains(name))
                people.add(name);
            name = kb.next();
            System.out.println(people.size());
        }// end while
        
        // display the names in people
        for (String p: people)
            System.out.print(p+"  ");
    }
}
