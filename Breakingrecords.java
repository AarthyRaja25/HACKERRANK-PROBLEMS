package UTOPIA;
import java.io.IOException;
import java.util.Scanner;
public class Breakingrecords {
public static void main(String[] args){
	            Scanner sc=new Scanner(System.in);
	            int n=sc.nextInt();
	            int arr[]=new int[n];
	            
	            for(int i=0;i<n;i++)
	            {
	                arr[i]=sc.nextInt();
	            }
	            int max=arr[0];
	            int min=arr[0];
	            int maxcount=0;
	            int mincount=0;
	            for(int i=0;i<n;i++)
	            {
	                if(arr[i]>max)
	                {
	                    max=arr[i];
	                    maxcount++;
	                }
	                if(arr[i]<min)
	                {
	                    min=arr[i];
	                    mincount++;
	                }
	                
	            }

	           System.out.println(mincount);
                System.out.println(maxcount);
            
	        }


	    }




