import java.util.Scanner;

public class CheckString {
public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            
        if (scanner.hasNext()) {
                String input = scanner.nextLine();
                System.out.println("You entered the string: " + input);
        }else {
                System.out.println("You did not enter a valid string.");
            }
        }
    }
}
        