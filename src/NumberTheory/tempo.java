//Incomplete
package NumberTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/18/2017.
 */
public class tempo {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<Long> al = new ArrayList<Long>();
            long n = sc.nextLong();
            for (long i = 0; i < n; i++) {
                al.add(sc.nextLong());
            }
            ArrayList<Integer> freq = new ArrayList<Integer>();
            // freq.add(Collections.frequency(,));
            System.out.println(freq);
        }
    }
}
