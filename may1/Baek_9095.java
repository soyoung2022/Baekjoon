package may1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_9095 {
    public static void main(String[] args) throws IOException {
        /*
        1, 2, 3의 합으로 나타내기
        1 = 1, 2 = 2 = 1+1, 3 = 3 = 1+2 = 2+1 = 1+1+1
        1: 1 -> 1가지
        2: 1 + 1, 2 -> 2가지
        3: 1 + 1 + 1, 1 + 2, 2 + 1, 3 -> 4가지
        4: 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1 -> 7가지
        5: 1+1+1+1+1, 1+1+1+2(4), 1+1+3(3), 2+2+1(3), 2+3(2) -> 13가지
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            if(n >= 4 && dp[n] == 0){
                for(int k = 4; k <= n; k++){
                    dp[k] = dp[k-1] + dp[k-2] + dp[k-3];
                }
            }
            System.out.println(dp[n]);
        }
    }
}
