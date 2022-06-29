public class Slide2
{
    /* Java have 3 types of variables:

        * Local variable => Variables declared inside the scope of any method, constructor, loop, conditional statements are known as local variables. Local variables do not have any existence outside the scope it is declared.

        * Class or Static variable => Variables declared inside the scope of a class but outside any method or constructor are called Class or Static variable if and only if "static" keyword is used in the declaration of the variable.
        
        * Instance variable => Variables declared inside the scope of a class but outside any method or constructor are called instance variable if and only if "static" keyword is not used in the declaration of the variable.
        
    */

    public int a = 500;
    public float x = 20.22f;
    public String name = "Fahad";
    /* Here a, x, name are instance variable */

    public static double salary = 35000.50;     // salary is a static or class variable

    void display()
    {
        System.out.println("Instance variable : " + a + ", " + x + " and " + name);
    }

    public static float calculate(float a, int b)  // here a and b are local variable
    {
        return a*b;
    }

    //  Static method => We can only use static variables and static methods in a static method.
    public static void display1()
    {
        System.out.println("Static method 1");
    }
    public static void display2()
    {
        System.out.println("Static method 2");
        display1();
        // display(); => we cant use display() method since display() method is a non-static method. So, it wiil show error.
    }

    public static void main(String[] args)
    {
        Slide2 obj = new Slide2();
        System.out.println(Slide2.calculate(25.45f, 13));   // we dont need to create a object to use or call a static method.
        obj.display();
        System.out.println(Slide2.salary);  // we dont need to create a object to use or call a static variable.
        
        Slide2.display1();
        Slide2.display2();
    }
}