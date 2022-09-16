package org.launchcode.java.studios.Quiz;

import exercises.technology.Computer;
import exercises.technology.Selection;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {


        //Actually runs the program

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Hello human, are you ready for a test\nYes or No?");
        String choice = input.next().toLowerCase();

        System.out.println(MultipleChoice.getMenuChoice(choice));

        System.out.println("Please Make a selection");
        choice = input.next();

       System.out.println(TrueFalse.getTrueFalse(choice.toLowerCase()));
        choice = input.next();




    }
}
