//Removing dublicates of the string has been done.
package StringManipulations;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //System.out.println(s);
        ArrayList<Character> al = new ArrayList<Character>();
        for(int i=0 ; i<s.length() ; i++){
            if(!al.contains(s.charAt(i))){
                al.add(s.charAt(i));
            }
        }
        String fin = new String();
        for(Character c : al){
            fin += c;
        }

        System.out.println(fin);
    }
}
