package org.migratorybirds;
import java.util.Scanner;
public class gradesofstudent {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int modifiedvalue=0;
		for(int i=0;i<n;i++)
		{
       if(arr[i]<40)
       {
    	
    	modifiedvalue=arr[i] ;  
    	   
       }
       else
       {
    	 int remainder=arr[i]%5;
    	 if(remainder<3)
    	 {
    		 
    		 
    	 }
    	 
    	 
    	 
    	 
    	 
       }
	}
		
		
		
		
		
		
	}
}