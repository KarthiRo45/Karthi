import java.util.*;
public class findunique{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    a[i]=s.nextInt();
	}
	int flag[] = new int[a.length];
	for(int i=0;i<a.length;i++){
		int count=0;
		for(int j=0;j<a.length;j++){
			if(a[i]==a[j]){
				count++;
			}
		}
		flag[i]=count;
	}
	int index=-1;
	for(int i=0;i<a.length;i++){
		if(flag[i]==1){
			index=i;
		}
	}
	System.out.println("Answer is "+a[index]);
	
}
}
