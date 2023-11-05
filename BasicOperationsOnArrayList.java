import java.util.ArrayList;
/**
 * Create an ArrayList from an array of strings
 */
public class BasicOperationsOnArrayList
{
    public static void main(String[] args){
        // new, empty ArrayList of people
        ArrayList<String> people = new ArrayList<String>(4);
        int n = people.size();
        System.out.println(n);
        System.out.println(people.isEmpty());
        
        // add some names 
        people.add("Joe");      // added at postion 0
        people.add("Jasper");
        people.add("Dick");
        people.add("Abigail");
        people.add(4, "kelal1");
        people.add(4, "kelal2");
        people.add(4, "kelal3");
        people.add(6, "joral");
        //System.out.println(people.isEmpty());
        
        
        //people.add(9, "will it work");
        
        // get a steiung
        String st = people.get(3);
        System.out.println(st);
        
        people.set(3, "Thor");
        st = people.get(3);
        System.out.println(st);
        // remove a name
        
        
        //st = people.remove("Dick");
        st = people.remove(2);
        System.out.println(st);
        //System.out.println(people);
        
        // display the names in people
        for (String p: people)
            System.out.print(p + "  ");
    }
}
