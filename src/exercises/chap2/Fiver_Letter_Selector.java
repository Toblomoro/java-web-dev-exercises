package exercises.chap2;

import java.util.ArrayList;
import java.util.Arrays;

public class Fiver_Letter_Selector {
    static ArrayList<String> wordList = new ArrayList<String>(
            Arrays.asList("Hello", "I", "enjoy", "frolicking", "through", "olive", "groves")
    );
    public static void main(String[] args) {
       for (String word : wordList){
           if (word.length() == 5){
               System.out.println(word);

           }
       }
    }

};














