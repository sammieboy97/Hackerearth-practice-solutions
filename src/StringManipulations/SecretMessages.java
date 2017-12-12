package StringManipulations;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class SecretMessages {

    static char AfterKeying(char c, int k) {
        if ((c >= 'a' && c <= 'z') || ((c >= 'A') && c <= 'Z') || ((c>='0') && (c<='9'))) {
            if ((c >= 'a') && (c <= 'z')) {
                if (((int) c) + k <= 'z') {
                    return (char) (c + k);
                } else {
                    int sum = c + k;
                    while (sum > 'z') {
                        sum -=26;
                    }
                    return (char)sum;
                }
            } else if ((c >= 'A') && c <= 'Z') {
                if (((int) c) + k <= 'Z') {
                    return (char) (c + k);
                } else {
                    int sum = c + k;
                    while (sum > 'Z') {
                        sum -= 26;
                    }
                    return (char) sum;
                }
            } else {
                if (((int) c) + k <= '9') {
                    return (char) (c + k);
                } else {
                    int sum = c + k;
                    while (sum > '9') {
                        sum -= 10;
                    }
                    return (char) sum;
                }
            }

        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            char c[] = s.toCharArray();
            for(int i=0;i<c.length;i++)
                System.out.print(AfterKeying(c[i],k));

            System.out.println();
        }
    }
}
