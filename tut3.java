/* String in Java */

import java.util.Scanner;
public class tut3
{
    public static void main(String[] args)
        {
            /* We can declare String in 2 ways in Java */
            // Method 1: Here we create a String class object and we allocate memory for that string by using new keyword.
            String name = new String("This is a String");
            System.out.println(name);

            // Method 2
            String name2 = "Another way to declare a String";
            System.out.println(name2);

            /* Note that, Strings are immutable. That means we can not change the string object elements. We can make a copy of that string and then we can change the copy string.  */

            /* Getting string from the user */
            Scanner obj = new Scanner(System.in);

            System.out.print("Enter any text: ");
            String name3 = obj.nextLine();  // Here nextLine() will take the whole string including whitepaces
            System.out.println(name3);
            
            System.out.print("Enter another text: ");
            String name4 = obj.next();  // Here next() will only take the string before a whitespace
            System.out.println(name4);
        }
}