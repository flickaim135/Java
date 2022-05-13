import java.util.*;

public class tut3
{
    public static void main(String[] args)
    {

        System.out.print("Input your Physics number: ");
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        System.out.print("Input your Chemistry number: ");
        double c = sc.nextDouble();
        System.out.print("Input your Math number: ");
        double m = sc.nextDouble();
        System.out.print("Input your Biology number: ");
        double b = sc.nextDouble();
        System.out.print("Input your English number: ");
        double e = sc.nextDouble();

        double avg = (p + c + m + b + e) / 5;

        if ((p >= 0 && p <= 100) && (c >= 0 && c <= 100) && (m >= 0 && m <= 100) && (b >= 0 && b <= 100) && (e >= 0 && e <= 100))
        {
            System.out.println("Avg number: " + avg);
        }else
        {
            System.out.println("Error!!");
        }

        if (avg >= 0 && avg <= 100)
        {
            if (avg >= 80)
            {
                System.out.println("A+");
            }
            else if (avg < 80 && avg >= 70)
            {
                System.out.println("A");
            }
            else if (avg < 70 && avg >= 60)
            {
                System.out.println("B+");
            }
            else if (avg < 70 && avg >= 50)
            {
                System.out.println("B");
            }
            else if (avg < 50 && avg >= 33)
            {
                System.out.println("C");
            }
            else if (avg < 33)
            {
                System.out.println("F");
            }
        }
        else
        {
            System.out.println("Failed");
        }
    }
}