import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter your year of birth: ");
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter your gender: ");
            String sex = scanner.nextLine();
            
            System.out.print("Enter your GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter your hometown: ");
            String home = scanner.nextLine();
            
            System.out.println("\nYour Information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Year of Birth: " + yearOfBirth);
            System.out.println("Gender: " + sex);
            System.out.println("GPA: " + gpa);
            System.out.println("Hometown: " + home);
        }
    }
}
