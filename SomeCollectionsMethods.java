import java.util.ArrayList;
import java.util.Collections;
public class SomeCollectionsMethods
{
    public static void main(String[] args) 
    {
        // set up
        ArrayList<String> people = new ArrayList<>();
        people.clear();
        
        // add a bunch of objects all at once
        Collections.addAll(people, "John", "Paul", "George", "Ringo");
        // The list people is now ["John", "Paul", "George", "Ringo"]
        System.out.println("original \t"+people);

        //sort()
        //can be used to sort a list
        people.clear();
        Collections.addAll(people, "John", "Paul", "George", "Ringo");
        Collections.sort(people);
        // The list people is now ["George", "John", "Paul", "Ringo"]
        System.out.println("sorted \t\t"+people);

        //shuffle()
        //can be used to randomly order a list 
        people.clear();
        Collections.addAll(people, "John", "Paul", "George", "Ringo");
        Collections.shuffle(people);
        // Now, there are 4*3*2*1 = 24 different possibilities for order of entries in the list
        System.out.println("shuffled  \t"+people);

        // reverse()
        // can be used to reverse the order of a list 
        people.clear();
        Collections.addAll(people, "John", "Paul", "George", "Ringo");
        Collections.reverse(people);
        // The list people is now ["Ringo", "George", "Paul", "John"]
        System.out.println("reversed \t"+people);

    }
}
