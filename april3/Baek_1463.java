package april3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1463 {
    static int N;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        // dp 문제
        /*
        1. 테이블 정의 --> i의 최소 연산 횟수
        2. 점화식 찾기 --> dp[i] = Math.min(dp[i-1]+1, dp[i/2], dp[i/3])
        3. 초기값 설정 --> dp[1] = 0;
         */

        // 1) 입력받고 초기값 설정하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        dp[1] = 0;

        // 2) 구하기
        for(int i = 2; i < N+1; i++) {
            dp[i] = dp[i-1] + 1;
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i/2]+1);
            }
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i/3]+1);
            }
        }

        System.out.println(dp[N]);
    }
}
