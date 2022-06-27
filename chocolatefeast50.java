package hackerrankEasyfirst50;
import java.util.Scanner;
public class chocolatefeast50 {
	public static void main(String[] args){	
Scanner sc=new Scanner(System.in);
System.out.println("amount");
int amount=sc.nextInt();
System.out.println("freechocowrapper");
int wrapperforfree=sc.nextInt();
System.out.println("cost");
int costofchoco=sc.nextInt();
int noofchoco=amount/costofchoco;
int wrapper=0;
int chocoeaten=0;
while(noofchoco>0)
{
chocoeaten +=noofchoco;	
wrapper+=noofchoco;
noofchoco=wrapper/wrapperforfree;
wrapper=wrapper%wrapperforfree;
}
System.out.println(chocoeaten);
	}
}
