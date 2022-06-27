package hackerrankEasyfirst50;
import  java.util.Scanner;
import java.math.*;
public class beautifuldaysatmovie38 {
public static void main(String[] args) {	
Scanner in= new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
int k=in.nextInt();
int rev=0;
int count=0;
for(int i=a;i<=b;i++)
{
int num=i;
while(i!=0)
{
int digit=i%10;
rev=(rev*10)+digit;
i=i/10;
}

int result=Math.abs(rev-num);
if(result%k==0)
{
	count++;
	rev=0;
}	
}
System.out.println(count);	
	
}
}
