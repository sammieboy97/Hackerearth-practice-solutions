package Implementation;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/20/2017.
 */
public class StrangeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            StringBuilder sd1 = new StringBuilder(sc.next());
            StringBuilder sd2 = new StringBuilder(sc.next());
            sd1.reverse();
            sd2.reverse();
            int a = Integer.valueOf(sd1.toString());
            int b = Integer.valueOf(sd2.toString());
            long n = a+ b;
            StringBuilder fin = new StringBuilder();
            fin.append(n);
            fin.reverse();
            n = Long.valueOf(fin.toString());
            System.out.println(n);
        }
    }
}
