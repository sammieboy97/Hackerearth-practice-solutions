package StringManipulations;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class DhivyaneshLoveForMaths {
    static boolean check(long n){
        long mod;
        while(n>0){
            mod = n%10;
            if(mod==2 || mod == 3|| mod == 5){
                n = n/10;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long count = 0;
        long temp = 2;
        while(true){
            if(check(temp)){
                count++;
            }
            if(count==n){
                System.out.println(temp);
                break;
            }
            temp++;
        }
    }
}
