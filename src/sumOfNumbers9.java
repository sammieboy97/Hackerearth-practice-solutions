//Finding all the subset sums in an array using bitwise operation has been done.!
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/9/2017.
 */
public class sumOfNumbers9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long s = sc.nextLong();
            int count = 0;
            for (int i = 0; i < Math.pow(2, n); i++) {
                long sum = 0;
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0)
                        sum += arr[j];
                }
                if (sum == s) {
                    System.out.println("Yes");
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("No");
            }
        }
    }
}
