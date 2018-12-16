package problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {
    static String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";


    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        duplicates();

/*        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String st2 = st.toLowerCase();
        String st1[] = st2.split(" ");
        int wrc = 1;

        for (int i = 0; i < st1.length; i++) {
            wrc = 1;
            for (int j = i + 1; j < st1.length; j++)    //Inner loop for Comparison
            {

                if (st1[i].equals(st1[j]))    //Checking for both strings are equal
                {
                    wrc = wrc + 1;                //if equal increment the count
                    st1[j] = "0";            //Replace repeated words by zero
                }
            }
            if (st1[i] != "0")
                System.out.println(st1[i] + "--" + wrc);


        }*/

    }

    public static void duplicates() {
String st1=st.toLowerCase();

        List<String> list = Arrays.asList(st1.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
    }
}

