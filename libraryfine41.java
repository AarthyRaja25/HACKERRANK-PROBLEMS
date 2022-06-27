/*our local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

If the book is returned on or before the expected return date, no fine will be charged (i.e.: .
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, .
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .
If the book is returned after the calendar year in which it was expected, there is a fixed fine of .
Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be .

Example


The first values are the return date and the second are the due date. The years are the same and the months are the same. The book is  days late. Return .

Function Description

Complete the libraryFine function in the editor below.

libraryFine has the following parameter(s):

d1, m1, y1: returned date day, month and year, each an integer
d2, m2, y2: due date day, month and year, each an integer
Returns

int: the amount of the fine or  if there is none
Input Format

The first line contains  space-separated integers, , denoting the respective , , and  on which the book was returned.
The second line contains  space-separated integers, , denoting the respective , , and  on which the book was due to be returned.

Constraints

Sample Input

9 6 2015
6 6 2015
Sample Output

45*/


package hackerrankEasyfirst50;
import java.util.Scanner;
public class libraryfine41 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int rd=in.nextInt();
		int rm=in.nextInt();
		int ry=in.nextInt();
		int dd=in.nextInt();
		int dm=in.nextInt();
		int dy=in.nextInt();
		
		int diffd=rd-dd;
		int diffm=rm-dm;
		int diffy=ry-dy;
		int fine=0;
		
		if(diffd<=0 && diffm==0 && diffy==0) {
			fine=0;
		}
		else if(diffd>0 && diffm==0 && diffy==0)
		{
			fine=15*diffd;
		}
		else if(diffm>0 && diffy==0)
		{
			fine=500*diffm;
		}
		else if(diffy>0)
		{
			fine=10000;
		}
		else
		{
			fine=0;
		}
	System.out.println(fine);	
	}

}

