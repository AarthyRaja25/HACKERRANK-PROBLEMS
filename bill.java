package org.migratorybirds;
import java.util.Scanner;
import java.util.ArrayList;

public class bill{
    public static void main(String[] Args)
        {
            Scanner sc=new Scanner(System.in);
            ArrayList<Integer>bill=new ArrayList<Integer>();
            System.out.println("enter array size");
            int n=sc.nextInt();
            System.out.println("meal skipped");
            int k=sc.nextInt();
            System.out.println("bill");
            int billpaid= sc.nextInt();
            System.out.println("enter array elements");
            for(int i=0;i<n;i++)
            {
                bill.add(sc.nextInt());
               
            }
            int sum=0;
            for(int i=0;i<n;i++)
            {
            if(i!=k)
            	{
                sum+=bill.get(i);
            }
            }
            int actual=((sum)/2);
            if(actual<billpaid)
            {
                int diff=billpaid-actual;
                System.out.println(diff);
            }
            else
            {
                System.out.println("Bon Appetit");
            }

        }
    }


