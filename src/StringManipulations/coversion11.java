//Did the conversion11 problem of changing alphabets to integers.

package StringManipulations;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class coversion11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = sc.nextLine();
        while (t-- > 0) {
            s = sc.nextLine();
            for(int i=0;i<s.length();i++){
                switch (s.charAt(i)) {
                    case 'a':
                        System.out.print("1");
                        break;
                    case 'A':
                        System.out.print("1");
                        break;
                    case 'b':
                        System.out.print("2");
                        break;
                    case 'B':
                        System.out.print("2");
                        break;
                    case 'c':
                        System.out.print("3");
                        break;
                    case 'C':
                        System.out.print("3");
                        break;
                    case 'd':
                        System.out.print("4");
                        break;
                    case 'D':
                        System.out.print("4");
                        break;
                    case 'e':
                        System.out.print("5");
                        break;
                    case 'E':
                        System.out.print("5");
                        break;
                    case 'f':
                        System.out.print("6");
                        break;
                    case 'F':
                        System.out.print("6");
                        break;
                    case 'g':
                        System.out.print("7");
                        break;
                    case 'G':
                        System.out.print("7");
                        break;
                    case 'h':
                        System.out.print("8");
                        break;
                    case 'H':
                        System.out.print("8");
                        break;
                    case 'i':
                        System.out.print("9");
                        break;
                    case 'I':
                        System.out.print("9");
                        break;
                    case 'j':
                        System.out.print("10");
                        break;
                    case 'J':
                        System.out.print("10");
                        break;
                    case 'k':
                        System.out.print("11");
                        break;
                    case 'K':
                        System.out.print("11");
                        break;
                    case 'l':
                        System.out.print("12");
                        break;
                    case 'L':
                        System.out.print("12");
                        break;
                    case 'm':
                        System.out.print("13");
                        break;
                    case 'M':
                        System.out.print("13");
                        break;
                    case 'n':
                        System.out.print("14");
                        break;
                    case 'N':
                        System.out.print("14");
                        break;
                    case 'o':
                        System.out.print("15");
                        break;
                    case 'O':
                        System.out.print("15");
                        break;
                    case 'p':
                        System.out.print("16");
                        break;
                    case 'P':
                        System.out.print("16");
                        break;
                    case 'q':
                        System.out.print("17");
                        break;
                    case 'Q':
                        System.out.print("17");
                        break;
                    case 'r':
                        System.out.print("18");
                        break;
                    case 'R':
                        System.out.print("18");
                        break;
                    case 's':
                        System.out.print("19");
                        break;
                    case 'S':
                        System.out.print("19");
                        break;
                    case 't':
                        System.out.print("20");
                        break;
                    case 'T':
                        System.out.print("20");
                        break;
                    case 'u':
                        System.out.print("21");
                        break;
                    case 'U':
                        System.out.print("21");
                        break;
                    case 'v':
                        System.out.print("22");
                        break;
                    case 'V':
                        System.out.print("22");
                        break;
                    case 'w':
                        System.out.print("23");
                        break;
                    case 'W':
                        System.out.print("23");
                        break;
                    case 'x':
                        System.out.print("24");
                        break;
                    case 'X':
                        System.out.print("24");
                        break;
                    case 'y':
                        System.out.print("25");
                        break;
                    case 'Y':
                        System.out.print("25");
                        break;
                    case 'z':
                        System.out.print("26");
                        break;
                    case 'Z':
                        System.out.print("26");
                        break;
                    case ' ':
                        System.out.print("$");
                        break;
                    default:
                        System.out.println(s.charAt(i));
                        break;
                }
            }
            System.out.println();
        }
    }
}
