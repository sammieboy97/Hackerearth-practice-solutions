package StringManipulations;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class Passwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> al = new ArrayList<String>();
        while(t-- >0){
            String s = sc.next();
            if(!al.contains(new StringBuilder().append(s).reverse().toString())){
                al.add(s);
            }else{
                System.out.println(s.length() + " " + s.charAt(s.length()/2));
                break;
            }
        }

    }
}
