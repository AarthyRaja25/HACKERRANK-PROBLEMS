/*When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle

 In this PDF viewer, each word is highlighted independently. For example:

PDF-highighting.png

There is a list of  character heights aligned by index to their letters. For example, 'a' is at index  and 'z' is at index . There will also be a string. Using the letter heights given, determine the area of the rectangle highlight in  assuming all letters are  wide.

Example
 

The heights are  and . The tallest letter is  high and there are  letters. The hightlighted area will be  so the answer is .

Function Description

Complete the designerPdfViewer function in the editor below.

designerPdfViewer has the following parameter(s):

int h[26]: the heights of each letter
string word: a string
Returns

int: the size of the highlighted area
Input Format

The first line contains  space-separated integers describing the respective heights of each consecutive lowercase English letter, ascii[a-z].
The second line contains a single word consisting of lowercase English alphabetic letters.

Constraints

, where  is an English lowercase letter.
 contains no more than  letters.
Sample Input 0

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc
Sample Output 0

9
Explanation 0

We are highlighting the word abc:

Letter heights are ,  and . The tallest letter, b, is  high. The selection area for this word is .

Note: Recall that the width of each character is .

Sample Input 1

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
zaba
Sample Output 1

28
*/
package hackerrankEasyfirst50;
import java.util.Scanner;
public class pdfviewer39 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str="abc";
int array[]= {1 , 3, 1, 3, 1, 4, 1 ,3, 2, 5, 5, 5, 5 ,5, 5, 5 ,5 ,5, 5, 5, 5, 5 ,5, 5 ,5 ,5};
int asciiofa=97;
int value=0;
 char ch[]=str.toCharArray();
for(int i:ch) {
int index=i-asciiofa;
if(value< array[index]) 
{
value=array[index];
}
}	
int result= value * str.length();		
System.out.println(result);		
}
}
