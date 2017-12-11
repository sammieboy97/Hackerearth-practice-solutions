//Binary Matrix Problem in Strings

package StringManipulations;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class AshishAndBinaryMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;
            String arr[] = new String[m];
            ArrayList<String> al = new ArrayList<String>();
            for (int i = 0; i < m; i++) {
                arr[i] = sc.next();
                if(!al.contains(arr[i]))
                    al.add(arr[i]);
            }
            //System.out.println(hs);
            if (al.size() == m) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
