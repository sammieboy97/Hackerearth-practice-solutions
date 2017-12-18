package LinearSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Sammie Boy on 12/14/2017.
 */
public class simpleSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
            hm.put(arr[i],i);
        }
        long k = sc.nextLong();
        System.out.println(hm.get(k));
        //System.out.println(arr1[k]);
    }
}
