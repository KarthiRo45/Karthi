import java.util.Scanner;

public class leap
{
    public static void main(String args[])
    {
       int yr;
       Scanner s = new Scanner(System.in);
	   
       System.out.print("Enter Year : ");
       yr = s.nextInt();
	   
       if((yr%4 == 0) && (yr%100!=0))
       {
           System.out.print("This is a Leap Year");
       }
       else if(yr%100 == 0)
       {
           System.out.print("This is not a Leap Year");
       }
       else if(yr%400 == 0)
       {
           System.out.print("This is a Leap Year");
       }
       else
       {
           System.out.print("This is not a Leap Year");
       }
    }
}
