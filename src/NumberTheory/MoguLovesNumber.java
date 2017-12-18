package NumberTheory;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/17/2017.
 */
public class MoguLovesNumber {


    static boolean[] createPrimeSequence(int max) {
        int a = 2;
        boolean arr[] = new boolean[max + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        while (a * a <= max) {
            crossOff(arr, a);
            a = nextPrime(arr,a);
        }
        return arr;
    }

    static void crossOff(boolean[] arr, int a) {
        for (int i = a * a; i < arr.length; i += a) {
            arr[i] = false;
        }
    }

    static int nextPrime(boolean[] arr, int a) {
        int prime = a+1;
        while (prime<arr.length && !arr[prime]) {
            prime++;
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = createPrimeSequence(1000000);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (l > r) {
                int temp = l;
                l = r;
                r = temp;
            }
            long count = 0;
            for(int i=l;i<=r;i++){
                if (arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
