import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/** 
 * ACS-1903 Parallel ArrayLists example
 * @author Sveinson
 */

public class ParalleArrayListsExample1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int nextId = 1000;

        // make the array lists
        ArrayList<Integer> id = new ArrayList<Integer>();
        ArrayList<Integer> t1 = new ArrayList<Integer>();
        ArrayList<Integer> t2 = new ArrayList<Integer>();

        // populate the array lists
        for(int i = 0; i < 10; i++){
            id.add(nextId++);
            t1.add(r.nextInt(26) + 25);
            t2.add(r.nextInt(26) + 25);
        } // end for

        //id.set(2, 2000);
        //System.out.println(id.size());
        System.out.println("\n");
        
        // correctly access an entire record
        // System.out.print(id.get(2));
        // System.out.print(": " + t1.get(2));
        // System.out.println(", " + t2.get(2));

        // oops careless indexing can lead to unwanted results
        // System.out.print(id.get(2));
        // System.out.print(": " + t1.get(1));
        // System.out.println(", " + t2.get(6));
        
        
        // print the array lists
        for(int i = 0; i < id.size(); i++){
            // System.out.print(id.get(i) + "\t");
            // System.out.print(t1.get(i) + "\t");
            // System.out.println(t2.get(i));
         }// end for  

        // print the record of the person with the larest t1 value
        
        // set up: set the value of the largest variable
        int largestT1 = Integer.MIN_VALUE;
        int largeIndex = -1;

        // 1. find the largest t1 value and its corresponding index
        for(int i = 0; i < t1.size(); i++){
            if(t1.get(i) > largestT1){
                largestT1 = t1.get(i);
                largeIndex = i;
            }
        }// end find largest t1

        //System.out.println(largestT1 + " " + largeIndex);

        // 2. print the record        
        System.out.print(id.get(largeIndex) + "\t");
        System.out.print(t1.get(largeIndex) + "\t");
        System.out.println(t2.get(largeIndex));
        
        
        System.out.println("\n\nend of program");
    }
}
