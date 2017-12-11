//The Strongest String Problem in hackerEarth.!!

package StringManipulations;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class TheStrongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = sc.next();
        String fin = "";
        int k = 0;
        for (int i = 'z'; i >= 'a'; i--) {
            for (int j = k; j < s.length(); j++) {
                if (s.charAt(j) == (char)i) {
                    fin = fin + "" + (char)i;
                    k = j+1;
                    break;
                }
            }
        }
        System.out.println(fin);
    }
}
