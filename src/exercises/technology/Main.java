package exercises.technology;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;



public class Main {


    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Hello human,Would you like to buy a new portable computing device?\nYes\nNo ");
        String choice = input.next();
        input.close();
        //String message = Message.getMessage("fr");
        System.out.println(Computer.getMenuChoice(choice));


}
}


