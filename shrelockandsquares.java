/*Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value that describe a range of integers, inclusive of the endpoints. Sherlo

omplete the squares function in the editor below. It should return an integer representing the number of square integers in the inclusive range from  to .

squares has the following parameter(s):

int a: the lower range boundary
int b: the upper range boundary
Returns

int: the number of square integers in the range
Input Format

The first line contains , the number of test cases.
Each of the next  lines contains two space-separated integers,  and , the starting and ending integers in the ranges.




Sample Input

2
3 9
17 24
Sample Output

2
0 */
package hackerrankEasyfirst50;
import java.util.Scanner;
public class shrelockandsquares {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	
	int first=in.nextInt();
	int last=in.nextInt();
	
	int a=(int)Math.sqrt(first);
	int b=(int)Math.sqrt(last);	
	int count=b-a;
	if(a*a>=first)
	{
		count++;
	}
	System.out.println(count);	
	}

}
