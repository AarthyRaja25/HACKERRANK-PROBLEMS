package hackerrankEasyfirst50;
import java.util.Scanner;
public class Taumbirthday46 {
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int wg=in.nextInt();
int bg=in.nextInt();
int wgc=in.nextInt();
int bgc=in.nextInt();
int conversion=in.nextInt();
if(bgc>wgc && (bgc-wgc)>=conversion)
{
bgc=wgc+ conversion;	
}
if(bgc<wgc && (wgc-bgc)>=conversion)
{
wgc=bgc+conversion;
}
long total=  (bg*bgc)+ (wg*wgc);	
System.out.println(total);	
	
	
}
}
