import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/4/2017.
 */
public class powerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0;
        while(n-- > 0){
            long a = sc.nextLong();
            if((a & (a-1)) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
