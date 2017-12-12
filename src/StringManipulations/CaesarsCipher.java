package StringManipulations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class CaesarsCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String P = sc.next();
            String C = sc.next();
            char c1[] = P.toCharArray();
            char c2[] = C.toCharArray();
            int diff = 0;
            int check = 0;
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < c1.length; i++) {
                if (c2[i]>=c1[i]){
                    diff = c2[i] - c1[i];
                }
                else{
                    diff = c2[i] + 26 - c1[i];
                }
                if(!al.contains(diff)){
                    al.add(diff);
                }
            }
            if (al.size() > 1) {
                System.out.println("-1");
            } else {
                System.out.println(al.get(0));
            }
        }
    }
}
