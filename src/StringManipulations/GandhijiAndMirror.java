//Gandhiji mirror probelem. It returns Yes only when the input is mirror image.

package StringManipulations;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class GandhijiAndMirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int check = 0;
            ArrayList<Character> al = new ArrayList<Character>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0' || s.charAt(i)=='8' || s.charAt(i)=='1'){
                    al.add(s.charAt(i));
                }
                else{
                    check++;
                    break;
                }
            }
            if(check != 0){
                System.out.println("NO");
            } else {
                String fin = "";
                for(Character c : al){
                    fin = fin + c;
                }
                //System.out.println(fin);
                StringBuilder sb = new StringBuilder(fin);
                StringBuilder rev = new StringBuilder();
                rev.append(sb);
                rev.reverse();
                if(sb.toString().equals(rev.toString())){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
