//BitManipulationProblem !
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/4/2017.
 */
public class MonkAndBoxOfChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int bitHash[] = new int[32];
            while (n-- > 0) {
                long a = sc.nextLong();
                int pos = 0;
                while (a > 0) {
                    if ((a & 1) == 1) {
                        bitHash[pos]++;
                    }
                    pos++;
                    a >>= 1;
                }
            }
            long max = Long.MIN_VALUE;
            int ans = 0;
            for(int i=0;i<32;i++) {
                if (bitHash[i] > max) {
                    max = bitHash[i];
                    ans = i;
                }
            }
            System.out.println(ans);
        }
    }
}

