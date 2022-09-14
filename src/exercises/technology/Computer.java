package exercises.technology;

import java.util.Objects;
import java.util.Scanner;

public class Computer {
    static String choice;
    static String menuChoice1 = "1- Durability";
    static String menuChoice2 = "2- Gaming";
    static String menuChoice3 = "3- Portability";
    static String menuChoice4 = "4- Work Flexibility";
    static String menuChoice5 = "5- Picture Editing";


    public static String getMenuChoice(String menuChoice) {
        if (menuChoice.equals("Yes")) {
            return "Very well, are you looking for :\n" + menuChoice1 + "\n" + menuChoice2 + "\n" + menuChoice3 + "\n" + menuChoice4 + "\n" + menuChoice5;

        } else {
            return "Well why are you 'ere then? Good bye.";}
    }
}



//property
//Looking to buy a new portable computer?
//property
//property
//method
//Scanner what is most important to you- Gaming, work, pictures, portability, durability
//method
//constuctor




