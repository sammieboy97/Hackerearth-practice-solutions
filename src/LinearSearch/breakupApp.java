//Incomplete

package LinearSearch;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sammie Boy on 12/14/2017.
 */
public class breakupApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count19 = 0;
        int count21 = 0;
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String str[] = s.split("\\D+");
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0;i<str.length;i++){
                if(str[i].length()!=0){
                    al.add(Integer.valueOf(str[i]));
                }
            }
            Pattern pat = Pattern.compile("19");
            Matcher m = pat.matcher(s);
            while(m.find()) {
                count19++;
            }
            Pattern pat1 = Pattern.compile("19");
            Matcher m1 = pat1.matcher(s);
            while(m1.find()) {
           //     count20++;
            }
        }

        //System.out.println(count19);
    }
}
