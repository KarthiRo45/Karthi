import java.util.*;
class fact
{  
     public static void main(String args[]){  
      int i,fact=1;  
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(i=1;i<=n;i++)
      {    
          fact=fact*i;    
      }    
      System.out.println("Factorial of "+n+" is: "+fact);    
     }  
    }  
