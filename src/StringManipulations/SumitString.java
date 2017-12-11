//Sumit String problem has been solved.
package StringManipulations;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/11/2017.
 */
public class SumitString {

    static boolean sumitString(String s) {
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length-1 ; i++) {
            if (Math.abs(c[i]-c[i + 1])!=1) {
                if (c[i] == 'z' && c[i + 1] == 'a') {
                    continue;
                } else if (c[i]=='a' && c[i+1] == 'z') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (sumitString(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
