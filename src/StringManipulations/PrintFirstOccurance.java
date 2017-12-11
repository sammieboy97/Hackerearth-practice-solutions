package StringManipulations;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class PrintFirstOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<Character> al = new ArrayList<>();
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                if (!al.contains(s.charAt(i))) {
                    al.add(s.charAt(i));
                }
            }
            String fin = "";
            for (Character c : al) {
                fin += c;
            }

            System.out.println(fin);
        }
    }
}
