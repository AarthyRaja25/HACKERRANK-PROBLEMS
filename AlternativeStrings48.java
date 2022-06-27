/*You are given a string containing characters  and  only.
 Your task is to change it into a string such that there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

Your task is to find the minimum number of required deletions.

Example

Remove an  at positions  and  to make  in  deletions.

Function Description

Complete the alternatingCharacters function in the editor below.

alternatingCharacters has the following parameter(s):

string s: a string
Returns

int: the minimum number of deletions required
Sample input
5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
Sample Output

3
4
0
0
4
*
*
*/
package hackerrankEasyfirst50;
import java.util.Scanner;
public class AlternativeStrings48 {
public static void main(String[] args){
	
Scanner sc=new Scanner(System.in);
System.out.println("String");
String str=sc.next();
int count=0;
	for(int i=1;i<str.length();i++)
	{
if(str.charAt(i-1)==str.charAt(i))	
{
	count++;
		
}
//System.out.println(count);	
	}
	System.out.println(count);	
}
}
