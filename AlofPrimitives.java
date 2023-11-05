import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class AlofPrimitives{
    public static void main(String[] args) {
        //arraylist constructor
        // creates an arraylist object with initial capacity of 10
        // size is 0 but capacity is 10
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> otherN = new ArrayList<>();
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("size of n " + n.size());
        
        for(int i = 0; i < 50; i++){
            n.add(r.nextInt(25) + 1);
        } // end for
        
        // use the sort() method from the Collections class
        printList(n);
        Collections.sort(n);
        printList(n);
        
        
        // makes a deep copy of the list n
        // note that changes made to n don't affect differntN and vise versa
        ArrayList<Integer> differentN = new ArrayList(n);
        
        // both n and otherN now point at the same list
        otherN = n;
        System.out.println(n.get(3));
        System.out.println(otherN.get(3));
        System.out.println(differentN.get(3));
        
        n.set(3, 25);
        System.out.println(n.get(3));
        System.out.println(otherN.get(3));
        System.out.println(differentN.get(3));  // one of these things doesn't belong
        
        int number = n.get(3);
        System.out.println(number);
        //printList(n);
         

        System.out.println("end of program");
    }
    
    public static void printList(ArrayList<Integer> l){
        for (int p: l)
            System.out.println(p);
            
        System.out.println("***************\n");
    }
}
