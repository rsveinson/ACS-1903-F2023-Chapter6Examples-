import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class WrapperExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        
        ArrayList<Integer> list = new ArrayList<>();
        Integer n = new Integer(5);
        
        // auto-un-boxing
        int m = n;
        
        System.out.println("n " + n);
        System.out.println("m " + m);
        
        m = 6;
        System.out.println("n " + n);
        System.out.println("m " + m);
        
        // auto-boxing
        n = m;
        System.out.println("n " + n);
        System.out.println("m " + m); 
        
        // now some ArrayList Wrapper class stuff
        list.add(5);        // auto boxing
        m = list.get(0);    // auto unboxing
        list.add(rnd.nextInt(10) + 1);  // auto boxing
        
        //auto boxing
        for(int i = 0; i < 5; i++){
            list.add(rnd.nextInt(11) + 100);
        }// end for
        
        for(Integer i : list){
            System.out.println(i);
        }// end for each
        
        

        System.out.println("end of program");
    }
}
