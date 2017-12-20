package Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sammie Boy on 12/19/2017.
 */
public class TheFootballFest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            Stack<Integer> st = new Stack<Integer>();
            st.push(sc.nextInt());
            char prevCh= 'P';
            int prev = st.peek();
            for(int i=0;i<n;i++){
                char c = sc.next().charAt(0);
                if (c == 'P') {
                    int temp = sc.nextInt();
                    st.push(temp);
                    prevCh = 'P';
                }else{
                    if (prevCh == 'B') {
                        st.push(prev);
                        prevCh = 'P';
                    }else{
                        prev = st.pop();
                        prevCh = 'B';
                    }
                }
            }
            System.out.println("Player " + st.peek());
        }
    }
}
