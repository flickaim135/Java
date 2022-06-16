/* String Methods */

// import java.util.Scanner;
import java.lang.String;

public class Tut4
{
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);

        String name = new String("Fahad Bin Z Islam");
        String name2 = "Hello Java";

        System.out.println("First string is: " + name);
        System.out.println("Second string is: " + name2 + "\n");
        System.out.println("=========== Srring Methods ===========\n");

        /* Method 1: length() method => Shows/returns the length of the string */
        System.out.println("Length of the first string is: " + name.length());
        System.out.println("Length of the second string is: " + name2.length() + "\n");

        /* Method 2: toLowerCase() method => Converts all of the characters of a String to lower case */
        System.out.println("Lowercase of the first string is: " + name.toLowerCase());
        System.out.println("Lowercase of the second string is: " + name2.toLowerCase() + "\n");

        /* Method 3: toUpperCase() method => Converts all of the characters of a String to upper case */
        System.out.println("Uppercase of the first string is: " + name.toUpperCase());
        System.out.println("Uppercase of the second string is: " + name2.toUpperCase() + "\n");

        /* Method 4: trim() method => Removes the spaces of the start and end point of a string */
        String nonTrimmedString = "    This string is   not     trimmed   ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());    // here the 4 spaces before "This" word and the 4 spaces after "trimmed" word will be removed. So, the output will be: This string is   not     trimmed
    }
}