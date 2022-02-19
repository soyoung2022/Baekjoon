package febfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Baek_2010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> cnt = new ArrayList<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			cnt.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(cnt, Collections.reverseOrder());	// 내림차순 정렬

		// 5, 7, 9, 2 --> 9, 7, 5, 2 --> 9 - 3 + 7 + 5 + 2
		// 4, 3, 2, 1, 3, 2--> 4 - 5 + 3 + 3 + 2 + 2 + 1
		// 3, 3, 4, 6 -> list.get(0) - (N-1) + list.get(1) + ... + list.get(N-1)
		// 2, 2, 3 -> list.get(0) - (2-1) + list.get(1)
		int result;
		if(cnt.get(0) > 1) {
			result = cnt.get(0) - (N-1);
			for(int i = 1; i < N; i++) {
				result +=  cnt.get(i);
			}
		}
		else {
			result = 1;
		}
		
		System.out.println(result);
	}
}
