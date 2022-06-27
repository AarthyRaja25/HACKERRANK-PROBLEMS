package UTOPIA;
import java.util.Scanner;
import java.util.ArrayList;
public class AliceAndBob 
{

    public static void main(String[] args) {
        int counta = 0;
        int countb = 0;
        
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        ArrayList<Integer> alice = new ArrayList<Integer>();
        ArrayList<Integer> bob = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
        alice.add(in.nextInt());
        }
        for(int j=0;j<n;j++)
        {
            bob.add(in.nextInt());
        }
        for (int i = 0; i < alice.size(); i++)
            {
                if (alice.get(i) > bob.get(i)) {
                    counta++;
                }
                if (alice.get(i) < bob.get(i)) {
                    countb++;

                }
            }
        
       // System.out.println(counta+" "+countb);
           answer.add(counta);
           answer.add(countb);
           System.out.println(answer);

    }
}

