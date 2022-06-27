package hackerrankEasyfirst50;
import java.util.Scanner;
public class RepeatedString43 {
	public static void main(String[] args) {
		
	Scanner in=new Scanner(System.in);
	String str=in.next();
	int n=in.nextInt();
	int len=str.length();
	int count=0;
	for(int i=0;i<len;i++)
	{
	if(str.charAt(i)=='a')
	{
		count++;
	}	
	}
	 count=(n/len)*count;
	int temp=n%len;
	for(int i=0;i<temp;i++)
	{
		if(str.charAt(i)=='a')
		{
			count++;
		}
	}
		
	System.out.println(count);	
	}

}
