import java.util.Scanner;

public class q1{

    public static String formatName(String fullName) {
        String[] nameParts = fullName.split(" ");
        
     
        if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            
            return lastName + ", " + firstName + " " + middleName.charAt(0) + ".";
        } else {
            return "Please enter your name in the format 'First Middle Last'.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name (First Middle Last): ");
        String fullName = scanner.nextLine();

        
        String formattedName = formatName(fullName);
        System.out.println(formattedName);
    }
}
