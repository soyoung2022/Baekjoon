package janfourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bark_18114 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());		// 물건의 개수
		int C = Integer.parseInt(st.nextToken());		// 무게
		
		boolean flag = false;
		String[] wStr = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				if(Integer.parseInt(wStr[i]) + Integer.parseInt(wStr[j]) == C) {
					flag = true;
					break;
				}
			}
			if(flag) break;
		}
		if(!flag) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
	}
}
