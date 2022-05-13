/* Taking user input in Java */

/* For taking input form the user we need to import "Scanner" class in Java by using this line
    => import java.util.Scanner; (by using import.java.util.* we can import all of the classes of "util")

 */
import java.util.Scanner;
public class tut2
{
    public static void main(String[] args)
        {
            Scanner x = new Scanner(System.in); /* Here, x is an object od Scanner class and System.in means that we are commanding the System to take input. */
            System.out.print("Enter number 1: ");
            double a = x.nextDouble();
            System.out.print("Enter number 2: ");
            int b = x.nextInt();
            System.out.print("Enter number 3: ");
            float c = x.nextFloat();
            double sum = a+b;
            double div = a-b*c;
            System.out.println("Sum of " + a + " and " + b + " is: " + sum);
            
            /* System.out.print("Enter number 4: ");
            boolean d = x.hasNextInt();
            System.out.print(d); */

            /* String text = x.next();
            System.out.println(text); */
            String text2 = x.nextLine();
            System.out.println(text2);
        }
}