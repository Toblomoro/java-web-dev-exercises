package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven today?");
        int miles = input.nextInt();
        System.out.println("How many gallons of gas have you consumed?");
        int gallons = input.nextInt();
        int milesPerGallon = miles/gallons;
        System.out.println("You have achived a total MPG of " +milesPerGallon +" MPG today." );
    }
}
