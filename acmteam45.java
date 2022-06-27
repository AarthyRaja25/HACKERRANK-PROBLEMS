package hackerrankEasyfirst50;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class acmteam45 {
	public static void main(String[] main) {
	ArrayList<String> str=new ArrayList<String>();
	List<Integer> list=new ArrayList<Integer>();
	int max=0;
	int team=0;
	System.out.println("INPUT STRING");
	Scanner in=new Scanner(System.in);
	for(int i=0;i<str.size();i++)
	{
		str.add(in.nextLine());	
	}
	for(int i=0;i<str.size();i++) 
	{
		for(int j=0;j<str.size();j++)
		{
		   int count=0;
		     for(int k=0;k<str.get(i).length();k++)
		      {
	           if(str.get(i).charAt(k)==1|| str.get(j).charAt(k)==1)
                 {
                  count++;	

                   if(count>max)
                    {
	                 max=count;
	                 team=1;
                    }
                   else if(max==count)
                    {
	                team++;
                    }

                }					
           }
		}
	}	
	list.add(max);
	list.add(team);
		
			
	System.out.println(list);			
	}

}
