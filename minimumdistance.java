package hackerrankEasyfirst50;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class minimumdistance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList <Integer> numberarray=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
		numberarray.add(sc.nextInt());
		}
		HashMap<Integer,Integer> minimum=new HashMap <>();
		int min=Integer.MAX_VALUE;
		int first=0;
		int last=0;
		for(int i=0;i<numberarray.size();i++)
		{
			if(minimum.containsKey(numberarray.get(i)))
			{
			first=i;
			last=minimum.get(numberarray.get(i));
			min=Math.min(first-last,min);
			}
			minimum.put(numberarray.get(i),i);
		}
		System.out.println(min);
		
		
	}

}