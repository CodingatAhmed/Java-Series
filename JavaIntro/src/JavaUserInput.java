import java.util.Scanner;
public class JavaUserInput {

    public static void main(String[] args) {

        // 1. Introduction to User Input
        // In Java, we can accept user input using classes such as Scanner, BufferedReader, or Console.
        // The Scanner class is the most common and easiest way to handle user input.

        // 2. Using Scanner to Accept User Input
        // The Scanner class is used to get input from the user. It is found in the java.util package.

        // Create a Scanner object to read input from the console
        Scanner userInput = new Scanner(System.in);

        // 3. Accepting String Input
        System.out.print("Enter your name: ");
        String name = userInput.nextLine();  // This will accept a line of input from the user
        System.out.println("Hello, " + name + "!");
        // Description: nextLine() reads a full line of text including spaces.

        // 4. Accepting Integer Input
        System.out.print("Enter your age: ");
        int age = userInput.nextInt();  // nextInt() is used to accept integer input
        System.out.println("You are " + age + " years old.");
        // Description: nextInt() reads the next integer from the user.

        // 5. Accepting Double Input (Decimal Numbers)
        System.out.print("Enter your height (in meters): ");
        double height = userInput.nextDouble();  // nextDouble() accepts a floating-point number
        System.out.println("Your height is " + height + " meters.");
        // Description: nextDouble() reads a floating-point number.

        // 6. Accepting a Single Character Input
        System.out.print("Enter your initial: ");
        char initial = userInput.next().charAt(0);  // next() reads the next token (word), and we use charAt(0) to get the first character
        System.out.println("Your initial is: " + initial);
        // Description: next().charAt(0) reads the first character of the next word.

        // 7. Accepting Boolean Input
        System.out.print("Do you like programming? (true/false): ");
        boolean likesProgramming = userInput.nextBoolean();  // nextBoolean() accepts a boolean value
        System.out.println("Likes programming: " + likesProgramming);
        // Description: nextBoolean() reads a boolean value (true or false).

        // 8. Closing the Scanner
        // It is a good practice to close the scanner object to free up resources when it's no longer needed.
        userInput.close();

        // 9. Error Handling: Avoiding Input Mismatch Exception
        // If we try to input the wrong type, for example, a string where an integer is expected, the program will throw an InputMismatchException.
        // To handle this, we can use try-catch blocks to catch errors and prompt the user again for valid input.
        try {
            System.out.print("Enter a valid integer: ");
            int validInput = userInput.nextInt();  // Try to read an integer
            System.out.println("You entered: " + validInput);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }

        // Summary of Java User Input Methods:
        // 1. scanner.nextLine() – Reads a whole line of text, including spaces.
        // 2. scanner.nextInt() – Reads an integer.
        // 3. scanner.nextDouble() – Reads a decimal (floating-point) number.
        // 4. scanner.next() – Reads the next word.
        // 5. scanner.nextBoolean() – Reads a boolean value (true or false).
        // 6. scanner.next().charAt(0) – Reads a single character.

    }
}
