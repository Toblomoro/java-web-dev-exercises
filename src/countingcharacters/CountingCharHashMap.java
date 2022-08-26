package countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharHashMap {
    public static void main(String[] args) {
        String str;

        HashMap<Character, Integer> charCount = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        str= scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (charCount.containsKey(str.charAt(i))){
                int counter = charCount.get(str.charAt(i));
                charCount.put(str.charAt(i), ++counter); ;
            }
            else {
                charCount.put(str.charAt(i),1);
            }
        }
        //System.out.println(charCount+"\n");
        charCount.forEach((key, value) -> System.out.println(key + " " + value));
    }
}

