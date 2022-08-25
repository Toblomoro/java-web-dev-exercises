package exercises.chap2;

import java.util.ArrayList;

public class SumEvenClass {

    public static int SumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

}

