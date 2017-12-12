package StringManipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class SortedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char c[] = s.toCharArray();
            int arr[] = new int[26];
            for(int i=0;i<c.length;i++){
                arr[c[i]-'a']++;
            }
            ArrayList<Character> al = new ArrayList<>();
            Arrays.sort(c);
            for (int i = 1; i <= 100; i++) {
                for(int j=0;j<c.length;j++){
                    if (arr[c[j]-'a']==i) {
                        al.add(c[j]);
                    }
                }
            }
            String fin = "";
            for (Character ch : al) {
                fin += ch;
            }
            System.out.println(fin);
        }
    }
}
