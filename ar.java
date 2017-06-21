import java.util.*;
public class ar {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int k=s.nextInt();
	int a[]=new int[n];
	int i;
	
for(i=n-k;i<=n-1;i++){
	a[i]=s.nextInt();
	
}
for( i=0;i<n-k;i++){
	a[i]=s.nextInt();
	}
for(int x:a){
	System.out.println(x);
}
}}
