package janfourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baek_18114 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());		// 물건의 개수
		int C = Integer.parseInt(st.nextToken());		// 무게
	
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> w = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			w.add(Integer.parseInt(st.nextToken()));
			// 1개 선택
			if(w.get(i) == C) {
				System.out.println(1);
				return;
			}
		}
		Collections.sort(w);
		// 2개, 3개 선택
		int i, j, weight;
		i = 0;
		j = N-1;
		while(i < j) {
			weight = w.get(i) + w.get(j);
			if(weight == C) {
				System.out.println(1);
				return;
			}
			if(w.indexOf(C-weight) < j && w.indexOf(C-weight) > i){
				System.out.println(1);
				return;
			}
			else if(weight > C) {
				j--;
			}
			else {
				i++;
			}
		}
        System.out.println(0);
	}	
}