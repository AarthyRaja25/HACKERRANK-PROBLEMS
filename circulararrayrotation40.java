package hackerrankEasyfirst50;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class circulararrayrotation40 {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	ArrayList<Integer> arr=new ArrayList<>();
	System.out.println("no of elments");
	int n=in.nextInt();
	System.out.println("rotation");
	int k=in.nextInt();
	System.out.println("no of elments in queries");
	int m=in.nextInt();
	System.out.println("arraylist");
	for(int i=0;i<n;i++)
	{
		arr.add(in.nextInt());
	}
	ArrayList<Integer> queries=new ArrayList<>();
	System.out.println("queries");
	m=queries.size();
	for(int j=0;j<m;j++)
	{
		queries.add(in.nextInt());
	}
	List<Integer>list=new ArrayList<>();
	n=arr.size();
	
	
	for(int i=0;i<k;i++)
	{
		int last=arr.get(n-1);
		arr.remove(n-1);
		arr.add(0,last);
	}

	for(int i=0;i<m;i++)
	{
		list.add(i,arr.get(queries.get(i)));
	}
		
		
	System.out.println(list);	
	}

}
