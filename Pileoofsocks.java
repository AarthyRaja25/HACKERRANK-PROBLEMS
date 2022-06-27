package UTOPIA;
	import java.util.Scanner;
	import java.util.ArrayList;
	public class Pileoofsocks{
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        ArrayList<Integer> socks= new ArrayList();
	   int n=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	        	socks.add(sc.nextInt());
	        }
	     
	        int count=0;
	        for(int i=0;i<socks.size();i++)
	        {
	           int a=socks.get(i);
	            for(int j=i+1;j<socks.size();j++)
	            {
	              int b=socks.get(j);
	                if (b!= 0)
	                {
	                    if (a==b)
	                    {
	                        count++;
	                        socks.set(j, 0);
	                        break;
	                    }
	                }
	            }
	        }
	        System.out.println(count);
	    }
	}



