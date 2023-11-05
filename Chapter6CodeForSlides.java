
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Lab XX
 * 
 * Description: Starter code for ACS-1903 labs
 **********************************************************************/

// import statements go here
 import java.util.Scanner;
 import javax.swing.JOptionPane;
 
 
 import java.util.ArrayList;

public class Chapter6CodeForSlides {
    public static void main(String[] args) {
    // ****** declare and allocate some ArrayLists *****
    
        ArrayList<String> names = new ArrayList<>();
        names.add("Rincewind");
        names.add("Angua");
        names.add("Carrot");
        names.remove(0);
        System.out.println(names.indexOf("Carrot"));
        
        // names.add(5, "Vetinari");
        // names.set(3, "RegShoe");
        // names.get(3);
        // names.remove(3);
        
        
        // variations
        ArrayList<Integer> ages;     // declare an ArrayList
        // ages = null;
        // System.out.println(ages);
        ages = new ArrayList<>();    // allocate memory and set the pointer
        
        // declare and allocate a new ArrayList of type <Sttring>
        // with an initial capacity of 5
        ArrayList<String> list = new ArrayList<>(5);
        
        System.out.println();
        
        ArrayList<Integer> m = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(5);
        n.add(7);
        n.add(13);

        for(int i = 0; i < n.size(); i++){
            m.add(n.get(i));
        }// end copy for
        
        System.out.println(n);
        System.out.println(m);
        
        m.set(0, 359);
        System.out.println(n);
        System.out.println(m);
        
        
                
        //m = n;
        // System.out.println(n);
        // System.out.println(m);
        
        // //m.set(0, 100);
        // System.out.println(n);
        // System.out.println(m);
        
        
        for(Integer i : m){
            System.out.println(i);
        }// end print with for-each
        
        int len = n.size();
        
        
        
        n.add(1, 25);
        n.add(3, 123);
        //n.add(7, 56);
        //System.out.println(n);

        String s = "Emerson";
        
        names.add("Keke");
        names.add("Emerson");
        names.add("Lando");
        //names.add(7, "Darth Vader");
        //s = names.remove(2);
        //System.out.println(s);
        //System.out.println(names);
        
        
        names.add("Enzo");
        names.add("Ayrton");
        //System.out.println(names);
        names.remove("Keke");
        //System.out.println(names);
        
        //System.out.println(names);
        s = names.set(0, "JuanManuel");
        //System.out.println(s);
        //System.out.println(names);
    
    // ***** Declaration of Variables *****
                   
        Scanner scanner = new Scanner(System.in);        

    // ***** Output Banners *****
    
    // ***** get some input from the keyboard *****
      
    // ***** Processing *****

           
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
