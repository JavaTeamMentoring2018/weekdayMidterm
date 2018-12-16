package problems;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        System.out.println(checkAnagram("mat", "cat"));
    }

    public static boolean checkAnagram(String word1, String word2) {

        String w1 = word1.replace("\\s", "");
        String w2 = word2.replace("\\s", "");

       Boolean anagram=false;


        if (word1.length() != word2.length()) {
            return false;}

         else {
            char[] word1Array = w1.toLowerCase().toCharArray();
            char[] word2Array = w2.toLowerCase().toCharArray();

            Arrays.sort(word1Array);
            Arrays.sort(word2Array);

            if (anagram = Arrays.equals(word1Array, word2Array))
            {
            return true;}

            else{return false;}

        }

        }





    }

