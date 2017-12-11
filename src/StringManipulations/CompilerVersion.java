package StringManipulations;//Compiler Version problem in Basic String Manipulations.

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/11/2017.
 */
public class CompilerVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            char c[] = s.toCharArray();
            for (int i = 0; i < c.length - 1; i++) {
               // if ((c[i] != '/') && (c[i + 1] != '/')) {
                //}
                if ((c[i] == '/') && (c[i + 1] == '/')) {
                    break;
                } else {
                    if (c[i] == '-' && c[i + 1] == '>') {
                        s = s.substring(0, i) + "." + s.substring(i + 2);
                        c=s.toCharArray();
                        i = 0;
                    }
                }
            }
            System.out.println(s);
        }
    }
}
