package org.migratorybirds;
import java.util.Scanner;
public class Grades {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size");
        int n=in.nextInt();
        System.out.println("enter the array");
        int arr[]=new int[n];
        int modifiedValues=0;
        for(int i=0;i<n;i++) {
     	arr[i]=in.nextInt();
        	
        }
        int diff=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=38)
            {
                System.out.println(arr[i]);

            }
            else 
            {
                int remainder=arr[i]%5;
                if(remainder==1)
                {
                    modifiedValues=arr[i]+4;
                }
                else if(remainder==2)
                {
                    modifiedValues=arr[i]+3;
                }
                else  if(remainder==3)
                {
                    modifiedValues=arr[i]+2;
                }
                else  if(remainder==4)
                {
                    modifiedValues=arr[i]+1;
                }
                else  if(remainder==0)
                {
                    modifiedValues=arr[i]+0;
                }
                
                
                diff=modifiedValues-arr[i];
                if(diff<3)
           {
               System.out.println(modifiedValues);
           }
            }
            
 
            }
        }
    }


