public class JavaEscapeSequences {
    public static void main(String[] args) {

        // 1. \n – Newline
        // The \n escape sequence moves the cursor to the beginning of the next line.
        System.out.println("Hello\nWorld!");
        // Output:
        // Hello
        // World!

        // 2. \t – Tab
        // The \t escape sequence inserts a horizontal tab space. It’s similar to pressing the "Tab" key.
        System.out.println("Name : \tAhmed");
        System.out.println("Age : \t20");
        System.out.println("Occupation : \tStudent");
        // Output:
        // Name :   Ahmed
        // Age :     20
        // Occupation :    Student

        // 3. \b – Backspace
        // The \b escape sequence moves the cursor one character back, effectively removing the previous character.
        System.out.println("Hello\bWorld!");
        // Output:
        // HellWorld!

        // 4. \r – Carriage Return
        // The \r escape sequence moves the cursor to the beginning of the current line without advancing to the next line.
        System.out.print("Hello\rWorld!");
        // Output:
        // World! (cursor moves back to start of line)

        // 5. \' – Single Quote
        // The \' escape sequence inserts a single quote character (') into the string.
        System.out.println("It\\'s raining today!");
        // Output:
        // It's raining today!

        // 6. \" – Double Quote
        // The \" escape sequence inserts a double quote character (") into the string.
        System.out.println("He said, \"Hello!\"");
        // Output:
        // He said, "Hello!"

        // 7. \\ – Backslash
        // The \\ escape sequence inserts a literal backslash character (\) into the string.
        System.out.println("C:\\Program Files\\Java");
        // Output:
        // C:\Program Files\Java

        // 8. \f – Form Feed
        // The \f escape sequence represents a form feed, which is a page-breaking character (historically used in printing systems).
        // It may vary depending on the platform and environment.
        System.out.print("Hello\fWorld!");
        // Output:
        // (May cause page break depending on the platform)

        // 9. \\u – Unicode Escape Sequence
        // The \\u escape sequence represents a Unicode character by its hexadecimal code point (4 digits).
        // It allows you to insert characters not easily representable in ASCII.
        System.out.println("\u0048\u0065\u006C\u006C\u006F");
        // Output:
        // Hello
    }
}
