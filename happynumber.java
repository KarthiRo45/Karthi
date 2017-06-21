import java.io.*;
import java.util.*;
class happynumber
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int sum=0;
        int rem,d,e,f=0;
        while(number>0)
        {
            rem=number%10;
            d=rem*rem;
            sum+=rem;
            number=number/10;
            e=number*number;
            f=e+d;
        }
        
        System.out.println("THE SUM IS "+f);
        }
    }





