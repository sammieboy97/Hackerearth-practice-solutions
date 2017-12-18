package StringManipulations;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class MarutAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t > 10) {
            System.out.println("Invalid Test");
        } else {
            while (t-- > 0) {
                String s = sc.next();
                int lower = 0;
                int upper = 0;

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                        lower++;
                    } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                        upper++;
                    } else {
                        continue;
                    }
                }
                if (lower == 0 && upper == 0) {
                    System.out.println("Invalid Input");
                } else {
                    if (s.length() < 1 || s.length() > 100) {
                        System.out.println("Invalid Input");
                    } else if (lower == 0 || upper == 0) {
                        System.out.println("0");
                    } else {
                        if (lower < upper) {
                            System.out.println(lower);
                        } else {
                            System.out.println(upper);
                        }
                    }
                }
            }
        }
    }
}
