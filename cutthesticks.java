package hackerrankEasyfirst50;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class cutthesticks {
public static void main(String[] args){
	                  Scanner sc=new Scanner(System.in);
	                  int n=sc.nextInt();
	                  ArrayList <Integer> sticks= new ArrayList<Integer>();
	                  for(int i=0;i<n;i++)
	                  {
		                sticks.add(sc.nextInt());
                      }
	                  ArrayList<Integer> list=new ArrayList<Integer>();
	                   Collections.sort(sticks);
	                   for(int i=0;i<n;i++) 
	                   {
	                	   list.add(n);
	                	   int min=sticks.get(0);
	                       for(int j=0;j<n;j++) 
	                       {
	                		 if(sticks.get(j)==min)  
	                		 {
	                			sticks.remove(j);
	                			j--;
	                			n--;
	                		 }
	                		 else
	                		 {
	                			sticks.set(j,sticks.get(j)-min);
	                		 }
	                     
	                       }
	                   }  
	                     System.out.println(list); 
                 }
	         }