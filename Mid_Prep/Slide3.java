public class Slide3
{
    /* Static block */
    static int id;
    static double salary;
    
    static
    {
        System.out.println("This is static block 1");
    }
    
    static
    {
        id = 505;
        salary = 505.555;
    }

    static
    {
        System.out.println("This is static block 2");
    }

    static  // here this block will override the first one.
    {
        id = 6452;
        salary = 52989.5452;
    }

    static void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    static
    {
        System.out.println("This is static block 3");
    }

    public static void main(String[] args)
    {
        System.out.println("Main method");
        Slide3.display();
    }
}