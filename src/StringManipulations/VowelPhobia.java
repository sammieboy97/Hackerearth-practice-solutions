//VowelPhobia String manipulation problem has been done.
package StringManipulations;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class VowelPhobia {

    static int vowels(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            System.out.println(vowels(s));
        }
    }
}
