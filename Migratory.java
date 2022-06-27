package org.migratorybirds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Migratory {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<Integer>array=new ArrayList<Integer>();
	for(int i=0;i<n;i++)
	{
		array.add(sc.nextInt());
	}
	int max=0;
	int count=0;
	int id=1;
//	for(int i=1;i<5;i++)
//	{
//		count=0;
//		for(int j=0;j<n;j++)               1 2 3 3 4
//		{
//		if(array.get(j)==1)
//		{
//			count++;
//		}
//		if(count==max)
//		{
//			max=count;
//			id=i;
//		}
//	
//		}
//	
//	System.out.println(id);
//	}
ArrayList<Integer>givenarray=new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
	if(!givenarray.contains(array.get(i)))
	{
		givenarray.add(array.get(i));
		count=Collections.frequency(array,array.get(i));
		if(count>max)
		{
			max=count;
			id=array.get(i);
			
		}
				
		
	}
}
System.out.println(id);	
	
	}

}
