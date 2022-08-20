package org.launchcode.java.demos.lsn1datatypes;
import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter language preference (fr = French, sp = Spanish, ger = German, eng = English): ");
        String choice = input.next(); //Declares the 'name' variable and initializes it with text from the command line.
        input.close();
        //String message = Message.getMessage("fr");
        System.out.println(Message.getMessage(choice));
    }

}
