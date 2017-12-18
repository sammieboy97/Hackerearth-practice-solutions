package NumberTheory;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/15/2017.
 */
public class CalculateThePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        BigInteger bi = new BigInteger(String.valueOf(a));
        BigInteger power = new BigInteger(String.valueOf(b));
        //System.out.println(bi + " " + power);
        BigInteger mod = BigInteger.TEN.pow(7).add(new BigInteger("7"));
        System.out.println(mod);
        BigInteger ans = bi.modPow(power,mod);
        System.out.println(ans);
    }
}
