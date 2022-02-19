package may2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_11726 {
    public static void main(String[] args) throws IOException {
        /*
        세로 * 가로
        1. 2*1: 1가지
        2. 2*2: 2가지
        3. 2*3: 3가지
        4. 2*4: 5가지
        5. 2*5: 8가지
        6. 2*6: 13가지
        7. 2*7: 21가지
        8. 2*8: 34가지
        9. 2*9: 55가지
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+2];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        System.out.println(dp[n]);

        /*
        주의할 점
         1) dp 배열 크기 n+1로 선언 시 n = 1 입력되면 index error 발생
         2) 10007로 나누는 것은 매 반복문을 돌 때마다 필요
         */
    }
}
