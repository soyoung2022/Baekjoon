package febfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek_12865 {
    static Integer[][] dp;
    static int[] W;
    static int[] V;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 물품의 수 N
        int K = Integer.parseInt(st.nextToken());   // 준서가 버틸 수 있는 무게 K
        // 배낭 문제(Knapsack Problem) --> 짐 쪼갤 수 없나? O --> DP법 이용
        W = new int[N];
        V = new int[N];
        dp = new Integer[N][K+1];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }


        for(int w = 0; w <= K; w++){
            for(int i = 0; i < N; i++){
                if(i == 0){
                    if(W[i] <= w){
                        dp[i][w] = V[i];
                    }else{
                        dp[i][w] = 0;
                    }
                }
                else if(dp[i][w] == null){
                    dp[i][w] = dp[i-1][w];
                    if(w - W[i] >= 0){
                        dp[i][w] = Math.max(dp[i-1][w], V[i] + dp[i-1][w-W[i]]);
                    }
                }
                System.out.println(dp[i][w]);
                System.out.println(w+" "+i);
            }
        }
        System.out.println(dp[N-1][K]);
    }
}
