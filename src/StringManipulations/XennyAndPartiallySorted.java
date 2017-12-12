package StringManipulations;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class XennyAndPartiallySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            String arr[] = new String[n];
            char c[][] = new char[n][];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
                c[i] = arr[i].toCharArray();
            }

        }
    }
}
