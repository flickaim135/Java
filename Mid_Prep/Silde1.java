public class Silde1
{
    public static void main(String[] args)
    {
        /* Type casting : 
            1. implicit type-casting => converting the value of smaller premitive data type to larger premitive data type
            2. explicit type-casting => converting the value of larger premitive data type to smaller premitive data type. Possibility of value loss during the conversion time.
        */

        // Implicit type-casting:
        short s = 505;
        int i;
        i = s;
        System.out.println(i);
        
        // Explicit type-casting:
        long l= 252541;
        short x ;
        x = (short)l;
        System.out.println(x);
    }
}