package exercises.chap1;
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length?");
        int length = input.nextInt();
        System.out.println("What is the width?");
        int width = input.nextInt();
        int area = length*width;
        System.out.println(" The rectangle's area is " +area );
        input.close();


    }
}