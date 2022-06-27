package org.migratorybirds;
	import java.util.Scanner;
	public class candles {
	public static void main(String[] args)
	{
	    Scanner in=new Scanner(System.in);
	    System.out.println("enter the size");
	    int n=in.nextInt();
	    System.out.println("enter the arrayelement");
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	      arr[i]=in.nextInt() ;
	    }
	    int max=0;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]>max)
	        {
	            max=arr[i];
	        }
	    }
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]==max)
	        {
	           count++;
	        }
	    }
	   System.out.println(count);

	}

	}



