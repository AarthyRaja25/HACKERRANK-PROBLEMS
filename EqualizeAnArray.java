package hackerrankEasyfirst50;
import java.util.Scanner;
public class EqualizeAnArray {
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();	
	int arr[]=new int[n] ;	
	for(int i=0;i<n;i++)
	{
		arr[i]=in.nextInt();
	}
	int count=0;
	int max=0;
	for(int i=0;i<n;i++) 
	{
		for(int j=i+1;j<n;j++)
		{
	if(arr[i]==arr[j])
	{
		count++;
	}
	if(max<count)	
	{
		max=count;
	}
	}
				
	}
int result=n-max;
System.out.println(result);
}
}