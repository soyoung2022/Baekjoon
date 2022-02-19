package april4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        /*
        작은 문제로 쪼개고, 반복적으로 수행되는데 항상 같은 값을 가지는 작은 문제이어야 한다.
        --> 아래처럼 숫자가 증가할 수록 겹치는 부분이 존재하는데, 4를 구하기 위해 3, 2를 구하고
        또 각자 3, 2를 구하기 위해 2,1과 1,0을 구하면 겹치는 계산들이 많아진다.
        ==> 따라서 아래서부터 올라가는 방법을 사용한다.
        0: f(0)
        1: f(1)
        2: f(1) + f(0)
        3: f(2) + f(1)
        4: f(3) + f(2)
         */
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            int[] fibonacci0 = new int[41];
            int[] fibonacci1 = new int[41];
            fibonacci0[0] = 1;
            fibonacci0[1] = 0;
            fibonacci1[0] = 0;
            fibonacci1[1] = 1;
            for(int k = 2; k <= N; k++){
                fibonacci0[k] = fibonacci0[k-1] + fibonacci0[k-2];
                fibonacci1[k] = fibonacci1[k-1] + fibonacci1[k-2];
            }
            System.out.println(fibonacci0[N] + " " + fibonacci1[N]);
        }
    }
}
