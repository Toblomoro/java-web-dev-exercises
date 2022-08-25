package exercises.chap2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Fiver_Letter_Selector {
    static ArrayList<String> wordList = new ArrayList<>(
            Arrays.asList("Hello", "I", "enjoy", "frolicking", "through", "olive", "groves")
    );
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters would you like to search for?");
        Integer length = input.nextInt();
          for (String word : wordList){
           if (word.length() == length){
               System.out.println(word);

           }
       }
    }
}














