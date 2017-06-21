import java.util.*;
class removevowels
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String str1=str.replaceAll("[aeiouAEIOU]","");
        System.out.println(str1);
    }
}
