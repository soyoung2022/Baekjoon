package may3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1149 {
    static int N;
    public static void main(String[] args) throws IOException {
        /*
        1, 2, 3 --> 26, 57, 13 == 96
        1, 2, 3 --> 1, 1, 1 == 3
        1, 2, 3 --> 1, 100, 1 == 102
        1, 2, 3, 4, 5, 6 --> 5, 64, 19, 4, 84, 32 == 208
        1, 2, 3, 4, 5, 6, 7, 8 --> 39, 32, 63, 29, 11, 13, 47, 19 ==
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N+1][3];
        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + R;
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + G;
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + B;
        }
        System.out.println(Math.min(Math.min(dp[N][0], dp[N][1]), dp[N][2]));
    }
}
