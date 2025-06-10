import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner=new Scanner(System.in);
        // Prompt the user for input
        System.out.println("Enter your name:");
        // Read a line of text entered by the user
        String name=scanner.nextLine();
        // Prompt the user for a number
        System.out.println("Enter your age:");
        // Read an integer entered by the user
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        // Close the Scanner to release resources (optional)
        scanner.close();


    }
}
