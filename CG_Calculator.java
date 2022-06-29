import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
import javax.naming.NamingException;
public class CG_Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter total Credit number: ");
        int x = sc.nextInt();

        System.out.print("Enter total Course number: ");
        int y = sc.nextInt();

        int grade[] = new int[y];
        int credits[] = new int[y];

        for(int i = 0; i<y; i++)
        {
            System.out.print("Enter " + (i+1) + " Course grade: ");
            grade[i] = sc.nextInt();
        }

        for(int i = 0; i<y; i++)
        {
            System.out.print("Enter " + (i+1) + " Course grade credit: ");
            credits[i] = sc.nextInt();
        }

        System.out.print("Enter previous semester taotal CGPA and credits: ");
        double z1 = sc.nextDouble();
        double z2 = sc.nextDouble();
        System.out.print("Previous semester tatal CGPA and credits: " + z1 + " and " + z2);

        double sum1 = 0.0;
        double sum2 = 0.0;
        for(int i = 0; i<y; i++)
        {
            sum1 = sum1 + credits[i];
            sum2 = sum2 + grade[i];
        }

        System.out.println(sum1);
    }
}
