package exercises.chap2;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_list_practice {


    static ArrayList<Integer> list = new ArrayList<Integer>(
            Arrays.asList(1,2,1,2,1,2,1,2,1,2,1,2)
    );


    public static void main(String[] args) {
        int total = SumEvenClass.SumEven(list);
        System.out.println("The sum of all even numbers in the list is " + total + ".");




    }





        //ArrayList listNumbers = new ArrayList<>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);



    }

