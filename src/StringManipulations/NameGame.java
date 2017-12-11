package StringManipulations;

import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/12/2017.
 */
public class NameGame {
    static char changed(char c){
        if((int)c<=69){
            return (char)67;
        }
        else if((int)c>=70 && (int)c<=72){
            return 71;
        }
        else if((int)c>=73 && (int)c<=76){
            return 73;
        }
        else if((int)c>=77 && (int)c<=81){
            return 79;
        }
        else if((int)c>=82 && (int)c<=86){
            return 83;
        }
        else if((int)c>=87 && (int)c<=93){
            return 89;
        }
        else if((int)c>=94 && (int)c<=99){
            return 97;
        }
        else if((int)c>=100 && (int)c<=102){
            return 101;
        }
        else if((int)c>=103 && (int)c<=105){
            return 103;
        }
        else if((int)c>=106 && (int)c<=108){
            return 107;
        }
        else if((int)c>=109 && (int)c<=111){
            return 109;
        }
        else{
            return 113;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            char c[] = s.toCharArray();
            for(int i=0;i<c.length;i++){
                System.out.print(changed(c[i]));
            }
            System.out.println();
        }
    }
}
