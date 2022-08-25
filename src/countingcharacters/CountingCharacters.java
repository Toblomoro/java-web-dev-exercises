package countingcharacters;


import java.util.HashMap;

public class CountingCharacters {
    public static void main(String args[]) {
        String str = " When Mr. Bilbo Baggins of Bag End announced that he would shortly be celebrating his eleventy-first birthday with a party of special magnificence, there was much talk and excitement in Hobbiton.";
        int length;
        length= str.length();
        int counter[] = new int[256];
        for (int i = 0; i < length ; i++) {
            counter[(int) str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0){
                System.out.println((char)i+ " " +counter[i]);
            }

        }



        //char[] charactersInString = str.toCharArray();


    }


}







