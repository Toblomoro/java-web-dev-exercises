package exercises.chap2;

public class Arraypractice {
    public static void main(String[] args) {
        int[] someArray = {1, 1, 2, 3, 5, 8};
        for (int i : someArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }


        }
    }
}
