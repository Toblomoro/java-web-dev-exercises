package org.launchcode.java.studios.Quiz;

public class MultipleChoice extends Question {
    // A B C D format
    // would be similar to the exercise computer class
    static String choice;
    static String menuChoice1 = "1- Camenbert";
    static String menuChoice2 = "2- Cheddar";
    static String menuChoice3 = "3- Swiss";
    static String menuChoice4 = "4- American";
    static String menuChoice5 = "5- Velveeta";


    public static String getMenuChoice(String menuChoice) {
        if (menuChoice.equals("yes")) {
            return "Very well, First Question\nWhat was Charlemagne's favorite cheese?\n" + menuChoice1 + "\n" + menuChoice2 + "\n" + menuChoice3 + "\n" + menuChoice4 + "\n" + menuChoice5;

        } else {
            return "Well why are you 'ere then? Good bye.";
        }
    }
}
