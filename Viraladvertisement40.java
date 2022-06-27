package hackerrankEasyfirst50;
import java.util.Scanner;
public class Viraladvertisement40 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int advertise=in.nextInt();
		int totallikes=0;
		int shared=0;
		for(int i=0;i<n;i++)
		{
			int liked=advertise/2;
			totallikes+=liked;
	shared=liked*3;
	advertise=shared;
			
		}
		
System.out.println(totallikes);	
	}

}
