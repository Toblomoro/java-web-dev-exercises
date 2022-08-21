

package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String alicesLine  = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Can you guess a word in the first sentence of 'Alice in Wonderland'?");
        String searchTerm = input.nextLine();
        searchTerm = searchTerm.toUpperCase();
        alicesLine = alicesLine.toUpperCase();
        boolean answer = alicesLine.contains(searchTerm);
        System.out.println("It is " +answer +" that 'Alice in Wonderlands' first sentence contains that phrase");
        input.close();



    }}

