package hackerrank;
import java.util.Scanner;
public class Findthedigit {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the digit");
	int n=sc.nextInt();
	int number=n;
	int digit;
	int count=0;
	while(number!=0)
	{
		digit=number%10;
		if(n%digit==0)
		{
			count++;
		}
		n=n/10;
	}
	System.out.println(count);

}
}
