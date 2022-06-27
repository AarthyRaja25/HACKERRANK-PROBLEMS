package hackerrankEasyfirst50;
import java.util.Scanner;
public class jumponthecloud44 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n] ;
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
	
}
int count=0;
	for(int i=0;i<arr.length-2; )
	{
		if(arr[i+2]==0)
		{
		i=i+2;
		
		}
		else
		{
			i=i+1;
		}
		count++;
	}
	System.out.println(count);
}
}
