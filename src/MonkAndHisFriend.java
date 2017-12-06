import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/6/2017.
 */
public class MonkAndHisFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long m = sc.nextLong();
            long p = sc.nextLong();
            long count = 0;
            while (m > 0 || p > 0) {
                if (((m & 1) == 1 && (p & 1) == 0) || ((m & 1) == 0 && (p & 1) == 1)) {
                    count ++;
                }
                m >>= 1;
                p >>= 1;
            }
            System.out.println(count);
        }
    }
}
