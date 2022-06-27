package org.migratorybirds;
import java.util.ArrayList;
import java.util.Scanner;
public class migratoryusingswitch 
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[5];
	ArrayList<Integer>array=new ArrayList<Integer>();
	{
		array.add(sc.nextInt());
	}
	int max=0;
	for(int i=0;i<n;i++)
	{
	switch(array.get(i)) {
	  case 1:
		arr[0]++;
		break;
	  case 2:
		arr[1]++;
		break;
		case 3 :
			arr[2]++;
			break;
		case 4:
			arr[3]++;
			break;
		case 5:
			arr[4]++;
			break;
	}
	int answer=0;
	for(int j=0;j<5;j++)
	{
	if(arr[j]>max)
	{
		max=arr[j];
		answer=j+1;
	}
		
	System.out.println(answer);	
	}
	
	}
		

}
}