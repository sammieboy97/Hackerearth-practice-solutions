//Bit manipulation prob of Micro and binary Strings

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/6/2017.
 */
public class MicroAndBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            /*int a = Integer.parseInt(s, 2);
            int count = 0;
            while (a > 0) {
                if ((a & 1) == 1) {
                    count++;
                }
                a >>= 1;
            }*/
            char c[] = s.toCharArray();
            int count = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '1') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
