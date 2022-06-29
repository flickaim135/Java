public class Slide4
{
    /* Setter and Getter method */

    private String name;
    private int age;
    private float salary;
    private String UniversityName;

    

    public void setter(String n, int a, float s, String uName)
    {
        name = n;
        age = a;
        salary = s;
        UniversityName = uName;
    }

    public int getAge()
    {
        return age;
    }

    public float getSalary()
    {
        return salary;
    }

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("University Name: " + UniversityName);
    }

    public static void main(String[] args)
    {
        Slide4 obj = new Slide4();
        obj.setter("Fahad Bin Z Islam", 22, 35500.50f, "BN College Dhaka");
        obj.display();
        System.out.println("Age: " + obj.getAge());
        System.out.println("Salary: " + obj.getSalary());
        
        
        /* String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.equals(s3));
        System.out.println(s2.compareTo(s1)); */
    }

}
