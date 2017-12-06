//Bit manipulation prob Aish and Xor.
//Here one test case do not pass in java even for the optimized logic. SAme logic in c or c++ will work fine. :)

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/7/2017.
 */
public class AishAndXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int a[] = new int[n+1];
        int a0[] = new int[n+1];
        a[1] = 0;
        int count = 0;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            a[i+1] = a[i] ^ arr[i];
            if (arr[i] == 0) {
                count++;
            }
            a0[i+1] = count;
        }
        int q = sc.nextInt();
        /*while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int xor = arr[l-1];
            int count = 0;
            if (xor == 0) {
                count = 1;
            }
            for (int i = l; i < r; i++) {
                xor ^= arr[i];
                if (arr[i] == 0) {
                    count++;
                }
            }
            String ans = new String(xor + " " + count);
            System.out.println(ans);

        } */ //Gives a proper output but is slow.


        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println((a[r]^a[l-1]) + " " + (a0[r]-a0[l-1]));

        }

    }
}
