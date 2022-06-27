package UTOPIA;
import java.util.Scanner;
import java.util.ArrayList;
public class AppleandOrange {
    public static void main(String[] args) {
        ArrayList<Integer> apples = new ArrayList<>();
        ArrayList<Integer> oranges = new ArrayList<>();
        Scanner sc = new  Scanner(System.in);
        int appletree = sc.nextInt();
        int orangetree = sc.nextInt();
        int samshousestarts = sc.nextInt();
        int samshouseends = sc.nextInt();
        int apcount = sc.nextInt();
        int orcount = sc.nextInt();
        int acount=0;
        int bcount=0;
        for (int i = 0; i < apcount; i++) {
            apples.add(sc.nextInt());
        }
        for (int j = 0; j < orcount; j++) {
            oranges.add(sc.nextInt());
        }
        for (int i = 0; i < apples.size(); i++) {
            if (apples.get(i) + appletree >= samshousestarts && apples.get(i) + appletree <= samshouseends) {
                acount++;
            }
        }
        for (int j = 0; j < oranges.size(); j++) {
            if (oranges.get(j) + orangetree >= samshousestarts && oranges.get(j) + orangetree <= samshouseends) {
                bcount++;
            }
        }
        System.out.println(acount);
        System.out.println(bcount);


    }


    }


