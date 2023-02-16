import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        
        int max = 0;
        char maxChar = ' ';

        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

        char[] arr = str.toCharArray();

        for (char ch : arr)
        {
            if (charCount.containsKey(ch)) 
            {
                charCount.put(ch, charCount.get(ch) + 1);   
            }
            else
            {
                charCount.put(ch, 1);
            }
        }

        for (Map.Entry entry : charCount.entrySet())
        {
            if (max < (int) entry.getValue())
            {
                max = (int) entry.getValue();
                maxChar = (char) entry.getKey();
            }

        }
       
        

        return maxChar;
    }
}
