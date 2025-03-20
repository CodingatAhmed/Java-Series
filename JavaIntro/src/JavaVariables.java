import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;
public class JavaVariables {
    public static void main(String[] args) {
//       Variables are the most important part of any code as you may not be able to code without
//       using variables. First let us look at some of the common rules while using variables in JAVA.

            // 1. **Identifiers Must Start with a Letter, Dollar Sign, or Underscore**
            // Valid identifiers:
            String firstName = "John";  // Starts with a letter
            String $lastName = "Doe";    // Starts with a dollar sign
            String _middleName = "James"; // Starts with an underscore

            // Invalid identifiers:
            // String 1stName = "John";  // Invalid, starts with a number
            // String @price = "100";    // Invalid, starts with an invalid character

            // 2. **Subsequent Characters Can Include Letters, Digits, Dollar Sign, or Underscore**
            String user1 = "Alice";  // Valid, includes a number after the first character
            String item_price$ = "15.50"; // Valid, uses dollar sign and underscore

            // Invalid identifiers (Cannot start with a digit):
            // String 2ndItem = "Banana";  // Invalid, starts with a number
            // String price-amount = "20"; // Invalid, contains a hyphen, which is not allowed

            // 3. **Case Sensitivity** (Java identifiers are case-sensitive)
            String userName = "Alice";  // Valid identifier
            String UserName = "Bob";    // Valid, but different from 'userName' (case-sensitive)
            String username = "Charlie"; // Valid, but different from the previous two

            // 4. **No Reserved Keywords** (You cannot use reserved keywords as identifiers)
            // These are reserved by Java and cannot be used as variable, method, or class names:
            // String public = "Invalid"; // Invalid, 'public' is a reserved keyword
            // int class = 10;            // Invalid, 'class' is a reserved keyword
            // String if = "Invalid";     // Invalid, 'if' is a reserved keyword
            // boolean while = false;     // Invalid, 'while' is a reserved keyword

            // Valid identifiers:
            int myClass = 10;  // Valid variable name
            boolean isActive = true; // Valid boolean variable

            // 5. **Identifiers Should Be Descriptive**
            // Good practice: Use descriptive names
            int totalAmount = 100;  // Meaningful and descriptive
            String userFirstName = "Alice"; // Descriptive and clear

            // Bad practice: Single character variable names, unless used for simple counters
            int a = 10;  // Bad practice: not clear
            String b = "test";  // Bad practice: not clear

            // 6. **Avoid Using Hungarian Notation**
            // Not recommended in Java, but can be seen in other languages
            // Example: String strName = "Alice"; // Avoid this style in Java
            String userNameWithoutPrefix = "Bob";  // Preferred approach, descriptive and clear

            // 7. **Variable Names Should Be Camel Case**
            int myTotalAmount = 50;  // Correct: camelCase style
            String myFirstName = "John"; // Correct: camelCase style

            // 8. **Constant Variables Should Be All Uppercase**
            // Constants are often written in uppercase letters, with words separated by underscores
            final double PI = 3.14159;  // Correct: constant in uppercase
            final int MAX_USERS = 100;  // Correct: constant in uppercase

    }
}
