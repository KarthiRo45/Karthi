import java.io.*;
class num
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>0)
{
System.out.println("POSITIVE");
}
else if(n<0)
{
System.out.println("NEGATIVE");
}
else
{
System.out.println("ZERO");
}
}
}
