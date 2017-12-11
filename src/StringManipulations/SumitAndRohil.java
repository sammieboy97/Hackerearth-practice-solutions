//Sumit And Rohil Problem.

package StringManipulations;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class SumitAndRohil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }
        int count=1;
        for(int i=0; i<n-1; i++)
        {
            char c[] = s[i].toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            boolean res = false;
            for(int j=i+1; j<n; j++)
            {
                if(s[i].charAt(0) == s[j].charAt(0) && s[i].charAt(s[i].length()-1) == s[j].charAt(s[j].length()-1))
                {
                    char c1[] = s[j].toCharArray();
                    Arrays.sort(c1);
                    String str1 = new String(c1);
                    if(str.equals(str1))
                    {
                        res = true;
                        break;
                    }
                }
            }
            if(res == false)
                count++;
        }
        System.out.println(count);
    }
}
