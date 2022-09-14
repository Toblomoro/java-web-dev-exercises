package exercises.technology;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;



public class Main {


    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Hello human,Would you like to buy a new portable computing device?\nYes\nNo ");
        String choice = input.next();


        //String message = Message.getMessage("fr");
        System.out.println(Computer.getMenuChoice(choice));

        System.out.println("Please Make a selection");
         choice = input.next();

        System.out.println(Selection.getMenuChoice(choice));


}
}


