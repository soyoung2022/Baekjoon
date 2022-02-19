package febsec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baek_2484 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int finalReward = 0;		// 가장 많은 상금을 받는 사람의 상금을 저장할 finalReward
		for(int i = 0; i < N; i++) {
			int reward = 0;		// 각 사람마다의 상금을 구할 reward
			ArrayList<Integer> numDice = new ArrayList<Integer>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 4; j++) {
				numDice.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(numDice);		// 3, 3, 6, 3 -> 3, 3, 3, 6 => 정렬하면 같은 숫자끼리 모이므로 고려하기 쉬워짐
			// 4개 다 같은 경우
			int j = numDice.get(0);
			int j2 = numDice.get(1);
			int j3 = numDice.get(2);
			if (Collections.frequency(numDice, j) == 4) {
				reward = 50000 + 5000 * j;
			}
			// 3개가 같은 경우(시작 0, 1): 2, 3, 3, 3
			else if(Collections.frequency(numDice, j) == 3) {
				reward = 10000 + 1000 * j;
			}
			else if(Collections.frequency(numDice, j2) == 3) {
				reward = 10000 + 1000 * j2;
			}
			// 2개 2개가 같은 경우(시작 0, 2)
			else if(Collections.frequency(numDice, j) == 2 && Collections.frequency(numDice, j3) == 2) {
				reward = 500 * j + 500 * j3 + 2000;
			}
			// 2개(1쌍)가 같은 경우(0, 1, 2)
			else if(Collections.frequency(numDice, j) == 2) {
				reward = 100 * j + 1000;
			}
			else if(Collections.frequency(numDice, j2) == 2) {
				reward = 100 * j2 + 1000;
			}
			else if(Collections.frequency(numDice, j3) == 2) {
				reward = 100 * j3 + 1000;
			}
			// 다 다른 경우
			if(reward == 0) {
				reward = 100 * numDice.get(3);
			}
			
			if(reward > finalReward) {
				finalReward = reward;
			}
		}
		
		System.out.println(finalReward);
	}
}
