package hackerrank;
import java.util.Scanner;
public class pdf {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int arr[]= {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5 ,5, 5, 5, 5, 5, 5, 5 ,5 ,5 ,5, 5, 5, 5};
String str=in.nextLine();
int n=str.length();
char ch[]=str.toCharArray();
int max=ch[0];
int asciiofa=97;
for(int i:ch) {
	int index=i-asciiofa;
	if(max>ch[index])
	{
		max=ch[index];
	}
}
int result=max*n;
System.out.println(result);	
	
}	

}
