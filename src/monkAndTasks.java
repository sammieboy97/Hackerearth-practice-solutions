//Monk and Tasks bit manipulation problem. Do in C++ as it is fast there.!
import java.io.PrintWriter; //PrintWriter is used here as some inputs are huge.
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/9/2017.
 */
public class monkAndTasks {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long arr[] = new long[n];
            int bits[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
                bits[i] = Long.bitCount(arr[i]);
            }
            for (int i = 1; i <= 32; i++) {
                for (int j = 0; j < n; j++) {
                    if(bits[j]==i){
                        output.print(arr[j] + " ");
                    }
                }
            }
            output.println();
        }
        output.flush();
    }
}

