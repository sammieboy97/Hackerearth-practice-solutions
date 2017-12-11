//incomplete.!!!
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/9/2017.
 */
public class subsetAnd4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int z = sc.nextInt();
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int check = 0;
            for (int i = 0; i < Math.pow(2, n); i++) {
                int and = 1;
                check = 0;
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0) {
                        and &= arr[j];
                    }
                    if ((and & z)== 0) {
                        System.out.println("Yes");
                        check++;
                        break;
                    }
                }
                if (check != 0) {
                    break;
                }
            }
            if (check == 0) {
                System.out.println("No");
            }
        }
    }
}
