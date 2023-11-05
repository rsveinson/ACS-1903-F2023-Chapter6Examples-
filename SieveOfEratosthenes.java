import javax.swing.JOptionPane;
import java.util.ArrayList;

public class SieveOfEratosthenes
{
    public static void main(String[] args){
        // get limit from user
        String limitAsString = JOptionPane.showInputDialog(
                                    "Enter upper limit:");
        int limit = Integer.parseInt(limitAsString);
        // set up the list of integers
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<=limit; i++){
            list.add(i);
        }
        // apply the sieve technique
        for (int next=2; next<limit; next++){
            if (list.get(next)!=0){
                // cross off multiple of next
                int p = 2*next;
                while (p <= limit){
                    // cross off this element
                    list.set(p, 0); 
                    p+=next;
                }
            }
        }
        // display primes
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=2; i<limit; i++){
            if (list.get(i)!=0) result.add(i);
        }
        JOptionPane.showMessageDialog(null,
                    "primes < "+limit+" are "+result);
    }
}
