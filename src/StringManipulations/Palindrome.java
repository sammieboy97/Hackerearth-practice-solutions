//Palindrome of String has been done.
package StringManipulations;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            StringBuilder sb1 = new StringBuilder();
            sb1.append(sb);
            sb.reverse();
            if (sb.toString().equals(sb1.toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
