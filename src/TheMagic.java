//BitManipulation Problem.!

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/6/2017.
 */
public class TheMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            while (n > 0) {
                if ((n&1) == 1) {
                    count++;
                }
                n >>= 1;
            }
            System.out.println(count);
        }
    }
}
