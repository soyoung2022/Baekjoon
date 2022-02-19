package march2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다리 놓기 - 다리 지을 수 있는 경우의 수 구하기 : mCn --> m! / n! * (m-n)!
// Ex) 29! / 13! * (29-13)! = 29! / 13! * 16! = 
public class Baek_1010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if(N == M) {
				System.out.println(1);
			}
			else if(N == 1) {
				System.out.println(M);
			}
			else {
				long result = 1;
				// 17~29 곱하고 2~13 나누기
				int b = Math.max(N, M-N);
				int s = Math.min(N, M-N);
				for(int j = b+1; j <= M; j++) {
					result *= j;
				}
				for(int j = 2; j <= s; j++) {
					result /= j;
				}
				System.out.println(result);
			}
		}
	}
}
