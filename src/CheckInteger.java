import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            
        if (scanner.hasNextInt()) {
        int number = scanner.nextInt();
            System.out.println("You entered the integer: " + number);
        }else {
            System.out.println("You did not enter a valid integer.");
            }
        }
    }
