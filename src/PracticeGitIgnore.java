import java.util.Scanner;

public class PracticeGitIgnore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input message 1
        System.out.print("Input message 1: ");
        String message1 = scanner.nextLine();

        // Input message 2
        System.out.print("Input message 2: ");
        String message2 = scanner.nextLine();

        // Concatenate messages and print the result
        String result = message1 + " " + message2;
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }
}
