package org.launchcode.java.studios.Quiz;

public class CheckBox {
    public static String getTrueFalse(String menuChoice) {
        if (menuChoice.equals("false")) {
            //correctAnswers++
            return "You chose correct! \nNext Question:\nPick all the correct answers: \nThe following actors were in \"The Lord of the Rings Trilogy\": \n1-Toby McGuire\n2- Al Joleson\n 3- Elijah Wood\n4- Viggo Motrenson\n 5- Bobcat Goldwaith\n6- Billy Bob Thorton ";
        } else
//correctAnswer--
            return "Wrong! You fool!";

    }
}
