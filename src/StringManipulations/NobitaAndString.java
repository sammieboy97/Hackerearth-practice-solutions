package StringManipulations;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class NobitaAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String arr[] = s.split(" ");
            int j = arr.length;
            for (int i = j-1; i >=0 ; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
