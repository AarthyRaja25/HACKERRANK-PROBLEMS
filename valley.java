package hackerrank;
import java.util.Scanner;
public class valley {
public static void main(String  args[]) {
Scanner in=new Scanner(System.in);
System.out.println("Enter String");
String str=in.nextLine();
int n=str.length();
int count=0;
int sealevel=0;
int valley=0;
 char ch[]=str.toCharArray();
 
	for(int i=0;i<n;i++) 
	{
	if(ch[i]=='U')
	{
		sealevel=sealevel+1;
	}
	else
	{
		valley=valley+1;
	}
	if(ch[i]=='U' && (sealevel==valley))
	{
		count++;
	}
	
	}
	
	System.out.println(count); 
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	

