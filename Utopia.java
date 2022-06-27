package UTOPIA;
import java.util.Scanner;
import java.util.ArrayList;
	public class Utopia{
	    public static int utopiatree(ArrayList<Integer> growth)
	    {
	        int answer=0;
	        for(int i=0;i<growth.size();i++)
	        {

	            if(growth.get(i)%2==0)
	            {
	                answer=answer+1;
	            }
	            else
	            {
	                answer=answer*2;
	            }
	            
	        }
	        return answer;

	    }
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        ArrayList<Integer>givenarray=new ArrayList<Integer>();
	        System.out.println("number");
	        int n=sc.nextInt();
	        System.out.println("Array element");
	        for(int i=0;i<n;i++)

	        {
	         givenarray.add(sc.nextInt()) ;
	        }
	       int result=Utopia.utopiatree(givenarray);
	        System.out.println(result);
	    }

	}


