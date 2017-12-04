//BitManipulation Problem.!
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/4/2017.
 */
public class SherlockAndXOR {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            long countodd = 0, counteven = 0;
            int n;
            n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 1) {
                    countodd++;
                } else {
                    counteven++;
                }
            }
            long ans = counteven * countodd;
            System.out.println(ans);
        }
    }
}
