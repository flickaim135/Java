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
        System.out.println("=========== String Methods ===========\n");

        /* Method 1: length() method => Shows/returns the length of the string */
        System.out.println("=========== 1. length() Method ===========\n");
        System.out.println("Length of the first string is: " + name.length());
        System.out.println("Length of the second string is: " + name2.length() + "\n");

        /* Method 2: toLowerCase() method => Converts all of the characters of a String to lower case */
        System.out.println("=========== 2. toLowerCase() Method ===========\n");
        System.out.println("Lowercase of the first string is: " + name.toLowerCase());
        System.out.println("Lowercase of the second string is: " + name2.toLowerCase() + "\n");

        /* Method 3: toUpperCase() method => Converts all of the characters of a String to upper case */
        System.out.println("=========== 3. toUpperCase() Method ===========\n");
        System.out.println("Uppercase of the first string is: " + name.toUpperCase());
        System.out.println("Uppercase of the second string is: " + name2.toUpperCase() + "\n");

        /* Method 4: trim() method => Removes the spaces of the start and end point of a string */
        System.out.println("=========== 4. trim() Method ===========\n");
        String nonTrimmedString = "    This string is   not     trimmed   ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim() + "\n");    // here the 4 spaces before "This" word and the 4 spaces after "trimmed" word will be removed. So, the output will be: This string is   not     trimmed

        /* Method 5: subString(beginIndex) or subString(beginIndex, endIndex) method => Removes all of the characters before the beginIndex. Here, beginIndex means from which index the string will be printed */
        System.out.println("=========== 5. subString(beginIndex) or subString(beginIndex, endIndex) Method ===========\n");
        String name3 = "This is an another string";
        System.out.println("Main string: " + name3);    
        System.out.println("Main string length: " + name3.length() + "\n");    
        System.out.println("After using subString first time: " + name3.substring(2));    // here the beginIndex is 2. From start of the string means the beginIndex 2 of "This" is  "i". So, the output will be: is string is not trimmed.

        System.out.println("First sub-string length: " + (name3.substring(2)).length() + "\n");    
        String subString = name3.substring(7);
        System.out.println("After using subString second time: " + subString);
        System.out.println("Length of the sencond sub-string is: " + subString.length() + "\n");

        String name4 = "Hello Java";
        System.out.println("Main name4 string: " + name4);
        System.out.println("Main name4 string length: " + name4.length());
        System.out.println("name4 string after trim: " + name4.substring(2, 8));
        System.out.println("name4 string length after trim: " + (name4.substring(2, 8)).length() + "\n");
        
        /* Method 6: replace(oldChar/oldString, newChar/newString) => Replace the old character or old string with the newq character or new string. */
        System.out.println("=========== 6. replace() Method ===========\n");
        System.out.println("Main name4 string: " + name4);
        System.out.println("name4 string after first replace: " + name4.replace('H', 'f'));
        System.out.println("name4 string after secoind replace: " + name4.replace("va", "ann") + "\n");

        /* Method 7: startsWith() & endsWith() method => Check wheather the string Starts or Ends with the given string or characters. Returns bullean result means true or false. */
        System.out.println("=========== 7. startsWith() & endsWith() Method ===========\n");
        System.out.println("Main name4 string: " + name4);
        System.out.println("name4 string after using startsWith(): " + name4.startsWith("Hel"));
        System.out.println("name4 string after using endsWith(): " + name4.endsWith("n") + "\n");
        
        /* Method 8: charAt(index number) method => Shows us the character at given index. */
        System.out.println("=========== 8. charAt() Method ===========\n");
        System.out.println("Main name4 string: " + name4);
        System.out.println("name4 string after using charAt(3) first time: " + name4.charAt(3));
        System.out.println("name4 string after using charAt(0) second time: " + name4.charAt(0) + "\n");
        
        /* Method 9: indexOf() method => Returns the index of the given string and it will always returns the first occurence of the matching string. Returns -1 if no matches found */
        System.out.println("=========== 9. indexOf() Method ===========\n");
        String name5 = "Hellollo Java";
        System.out.println("Main name4 string: " + name5);
        System.out.println("name5 string after using indexOf('lo') : " + name5.indexOf("ll"));
        System.out.println("name5 string after using indexOf('l') : " + name5.indexOf("l"));
        System.out.println("name5 string after using indexOf('lo') : " + name5.indexOf("lo"));
        System.out.println("name5 string after using indexOf('He') : " + name5.indexOf("He"));
        System.out.println("name5 string after using indexOf(''av) : " + name5.indexOf("av"));
        System.out.println("name5 string after using indexOf() : " + name5.indexOf("x", 2));    // When we give the starting index as second parameter, then indexOf() fuinction will start searching the given srting from that index.
        System.out.println("name5 string after using indexOf() : " + name5.indexOf("ll", 3) + "\n");

        /* Method 10: equals() method => Returns true (if the given string match) or false (if the given string doesn't match). This method is case sensitive */
        System.out.println("=========== 10. equals() Method ===========\n");
        System.out.println("Main name4 string: " + name4);
        System.out.println("name4 string after using equals() first time: " + name4.equals("Hello Java"));
        System.out.println("name4 string after using equals() second time: " + name4.equals("hello java") + "\n");

        /* Method 11: equalsIgnoreCase() method => Returns true (if the given string match) or false (if the given string doesn't match). This method is not case sensitive */
        System.out.println("=========== 11. equalsIgnoreCase() Method ===========\n");
        System.out.println("Main name4 string: " + name4);
        System.out.println("name4 string after using equalsIgnoreCase(\"HelloJava 65\") first time: " + name4.equalsIgnoreCase("HelloJava 65"));
        System.out.println("name4 string after using equalsIgnoreCase(\"hello java\") second time: " + name4.equalsIgnoreCase("hello java") + "\n");
    }
}