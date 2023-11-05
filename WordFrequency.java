import java.util.ArrayList;
public class WordFrequency
{
    public static void main(String[] args){
        // two parallel lists: words and frequencies
        ArrayList<String> word = new ArrayList<>();
        ArrayList<Integer> frequency = new ArrayList<>();
        String newWord = "today";
        // try adding words: today, tomorrow, today
        addWord(word, frequency, newWord);
        addWord(word, frequency, "tomorrow");
        addWord(word, frequency, "today");
        addWord(word, frequency, "today");
        addWord(word, frequency, "tomorrow");
        addWord(word, frequency, "another");
        // display the two lists
        System.out.println(word);
        System.out.println(frequency);
        System.out.println(newWord);
    }

    /**
     * addWord: add a new word to the list of words, or 
     *          increment frequency for existing word
     *
     * parameters:
     *    wordList      a list of words
     *    frequencyList frequencies for words
     *    newWord      potential new word 
     */
    public static void addWord(
                  ArrayList<String> wordList, 
                  ArrayList<Integer> frequencyList, 
                  String newWord)
    {
        // .indexOf(some key) returns -1 if the argument is not found
        int i = wordList.indexOf(newWord);
        //System.out.println(i);
        if ( i>=0 ) {
            // new word found in list
            // get the frequence of the current word from the 
            // frequency list and add 1 for the new word
            int currentFrequency = frequencyList.get(i)+1;
            frequencyList.set(i,currentFrequency);
        }
        else {
            // new word not found
            wordList.add(newWord);
            frequencyList.add(1);
        }
        //System.out.println();
        //newWord = "blah blah blah.";
    }
}
