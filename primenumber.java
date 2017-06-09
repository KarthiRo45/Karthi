import java.util.*;

public class primenumber
{
    public static void main(String args[])
    {
        int num;
        Scanner s= new Scanner(System.in);
        num = s.nextInt();
            if(num%2 != 0)
            {
               
            System.out.print("This is a Prime Number");
            }
           else
           {
            System.out.print("This is not a Prime Number");
           }
    }
}

