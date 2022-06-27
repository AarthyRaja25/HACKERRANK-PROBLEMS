package hackerrank;
import java.util.Scanner;
public class hurdle {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int k=in.nextInt();
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=in.nextInt();
	}
	int max=0;
	for(int i=0;i<n;i++)
	{
if(arr[i]>max) {
	max=arr[i];
}

	}
	int result;
	if(max>k) {
		result=max-k;	
	}
	else {
		result=0;
	}
		
System.out.println(result);		
	}
}
	
	
	
	
	
	
	
	
	
	


