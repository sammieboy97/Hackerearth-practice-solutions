package NumberTheory;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/15/2017.
 */
public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String n = sc.next();
            BigInteger mod = BigInteger.TEN.pow(9). add(new BigInteger("7"));
            BigInteger min = new BigInteger(n).divide(new BigInteger("2")).pow(2).multiply(new BigInteger(n)).mod(mod);
            BigInteger max = new BigInteger(n).multiply(new BigInteger(n).subtract(new BigInteger("1"))).multiply(new BigInteger("2").multiply(new BigInteger(n)).subtract(new BigInteger("1"))).divide(new BigInteger("6")).mod(mod);
            System.out.println(min + " " + max);
                   // System.out.print(((((n/2)*(n/2)))*n)%mod + " ");
            //System.out.println((((((n*(n-1)))*(((2*n))-1)))/6)%mod);
        }
        System.out.println(1);
    }
}
