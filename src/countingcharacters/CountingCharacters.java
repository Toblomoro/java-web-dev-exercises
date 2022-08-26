package countingcharacters;


import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String args[]) {
        String str ;
        int length;

        int counter[] = new int[256];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        str= scanner.nextLine();
        length= str.length();
        for (int i = 0; i < length ; i++) {
            counter[str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0){
                System.out.println((char)i+ ":" +counter[i]);
            }

        }



        //char[] charactersInString = str.toCharArray();


    }


}







