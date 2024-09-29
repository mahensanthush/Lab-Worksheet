import java.util.Scanner;

public class q2 {

    // Method to get the middle character of an odd-length word
    public static char getMiddleCharacter(String word) {
        int length = word.length();
        if (length % 2 == 1) {  // Check if the length is odd
            int middleIndex = length / 2;  // Get the middle index
            return word.charAt(middleIndex);  // Return the middle character
        } else {
            throw new IllegalArgumentException("The word length is not odd.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();

        try {
            char middleCharacter = getMiddleCharacter(word);
            System.out.println("Middle character: " + middleCharacter);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
