package exercises.chap2;

import java.util.Arrays;

public class Array_string_practice {
    public static void main(String[] args) {
        String greenEggsAndHam = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] splitEggsAndHam = greenEggsAndHam.split("\\.");
        System.out.println(Arrays.toString(splitEggsAndHam));
    }
}
