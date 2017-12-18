package LinearSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by Sammie Boy on 12/15/2017.
 */
public class PolicemanAndThief {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int K = Integer.parseInt(line[1]);
            char[][] A = new char[N][N];
            for(int i_A=0; i_A<N; i_A++)
            {
                String[] arr_A = br.readLine().split(" ");
                for(int j_A=0; j_A<arr_A.length; j_A++)
                {
                    A[i_A][j_A] = arr_A[j_A].charAt(0);
                }
            }

            long out_ = solution(A, K);
            System.out.println(out_);
            System.out.println("");
        }

        wr.close();
        br.close();
    }
    static long solution(char[][] A, int K){
        // Write your code here....
        //System.out.println(A.length);
        long countThief = 0;
        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[i].length;j++) {
                long count = 0;
                if (A[i][j] == 'P') {
                    if(j==0){
                        for(int k=j+1;k<A[i].length;k++){
                            if(A[i][k]=='T'){
                                countThief++;
                            //    System.out.println("entered");
                                A[i][k] = ' ';
                                break;
                            }
                            count++;
                            if(count==K){
                                break;
                            }
                        }
                    }
                    else if(j==A[i].length-1){
                        for(int k=j-1;k>=0;k--){
                            if(A[i][k]=='T'){
                                //System.out.println("entered");
                                countThief++;
                                A[i][k] = ' ';
                                break;
                            }
                            count++;
                            if(count==K){
                                break;
                            }
                        }
                    }
                    else{
                        int k=j+1,l = j-1;
                        while(true){
                            if((k<A[i].length && A[i][k]=='T') || (l>=0 && A[i][l]=='T')){
                                countThief++;
                                if(A[i][k]=='T'){
                                    A[i][k] = ' ';
                                }
                                else {
                                    A[i][l] = ' ';
                                }
                                break;
                            }
                            count++;
                            if(count == K){
                                break;
                            }
                        }
                    }
                }
            }
        }
        return countThief;
    }
}
