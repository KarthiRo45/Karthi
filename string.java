import java.util.*;
public class string{
   public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String s1=s.next();
      String reverse = new StringBuffer(s1).reverse().toString();
      System.out.println("\nString before reverse: "+s1);
      System.out.println("String after reverse: "+reverse);
   }
}

