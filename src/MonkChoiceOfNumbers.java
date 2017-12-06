//Bit Manipulation problem of Monk Choice of numbers.!

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/6/2017.
 */
public class MonkChoiceOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int count = 0;
            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int i=0;i<n;i++) {
                count = 0;
                int a = sc.nextInt();
                while (a > 0) {
                    if ((a & 1) == 1) {
                        count++;
                    }
                    a >>= 1;
                }
                al.add(count);
            }
            Collections.sort(al);
            Collections.reverse(al);
            int sum = 0;
            System.out.println(al);
            for (int i = 0; i < m; i++) {
                sum += al.get(i);
            }
            System.out.println(sum);
        }
    }
}
