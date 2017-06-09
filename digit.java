import java.util.Scanner;
 class digit
{
    public static void main(String args[])
    {   
        int n, i=0;
        System.out.print("Enter a Number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while(n>0)
        {
            n=n/10;
            i++;
        }
        System.out.println();
        System.out.println("Number of Digits present : "+i);
    }
}
