package org.launchcode.java.studios.Quiz;

public class TrueFalse {
    // would be similar to a multiple choice but with 2 choices
    public static String getTrueFalse(String menuChoice) {
        if (menuChoice.equals("1")) {
            //correctAnswers++
            return "You chose correct! \nNext Question:\nTrue or False \nThe name of the small cute furry creature from the movie Gremlins was called \"Spike\"";
        } else
//correctAnswer--
            return "Wrong! You fool!";

    }
}
