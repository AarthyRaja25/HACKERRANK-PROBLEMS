
/*There is a sequence of words in CamelCase as a string of letters, , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , determine the number of words in .

Example

There are  words in the string: 'one', 'Two', 'Three'.

 Sample Input

saveChangesInTheEditor
Sample Output

5


*/

package hackerrankEasyfirst50;
import java.util.Scanner;
public class camelcase49 {
public static void main(String[] args)	{	
Scanner sc=new Scanner(System.in);	
System.out.println("String");
String str=sc.next();
int count=1;
for(int i=0;i<str.length();i++) 
{
if(str.charAt(i)>='A' && str.charAt(i)<='Z')
{
count++;
}	
}
System.out.println(count);
}

}
