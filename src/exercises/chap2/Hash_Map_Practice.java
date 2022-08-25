package exercises.chap2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash_Map_Practice {
    public static void main(String[] args) {
        // class (names, Integer numbers)
        HashMap<String, Integer> newStudents = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        do {

            System.out.println("Input Student Name: ");
            studentName = input.nextLine();
            ;
            if (!studentName.equals("")) {
                System.out.println("Input Student ID: ");
                Integer studentID = input.nextInt();
                newStudents.put(studentName, studentID);
                input.nextLine();
            }
        } while (!studentName.equals(""));
        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<String, Integer> student : newStudents.entrySet()) {
            System.out.println(student.getKey() + "'s ID: " + student.getValue());
        }



    }
}
