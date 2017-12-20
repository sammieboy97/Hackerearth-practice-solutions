package Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sammie Boy on 12/19/2017.
 */
public class MonkAndPhilosophersStone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noCoins = sc.nextInt();
        long coins[] = new long[noCoins];
        for (int i = 0; i < noCoins; i++) {
            coins[i] = sc.nextLong();
        }
        Stack<Long> harry = new Stack<Long>();
        Stack<Long> monk = new Stack<Long>();
        for (int i = noCoins-1; i >= 0 ; i--) {
            harry.push(coins[i]);
        }
        int q = sc.nextInt();
        long x = sc.nextLong();
        long sum = 0;
        int check = 0;
        int count = 0;
        while (q-- > 0) {
            String s = sc.next();
            if (s.equals("Harry")) {
                monk.push(harry.pop());
                sum += monk.peek();
                count++;
                if(sum==x){
                    System.out.println(count);
                    check++;
                    break;
                }
            }else{
                long temp = monk.pop();
                sum -= temp;
                count--;
                if (sum == x) {
                    System.out.println(count);
                    check++;
                    break;
                }
            }
        }
        if (check == 0) {
            System.out.println("-1");
        }
    }
}
