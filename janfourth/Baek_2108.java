package janfourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// 백준 2108번 통계학
public class Baek_2108 {
	public static void main(String[] args) throws IOException {
		// 수의 개수  N 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> numArr = new ArrayList<Integer>();	// 숫자 저장하기 위한 배열 생성
		int[] checkCnt = new int[8001];
		ArrayList<Integer> modeList = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			numArr.add(Integer.parseInt(br.readLine()));		// N개의 줄에 입력되는 N개의 정수들 배열에 저장하기
			checkCnt[numArr.get(i)+4000]++;		// 각 숫자 개수 배열에 저장하기
		}
		
		// 산술평균
		float sum = (float) numArr.stream().mapToInt(Integer::intValue).sum() / N;
		int sumResult = Math.round(sum);
		System.out.println(sumResult);
		
		// 중앙값
		Collections.sort(numArr);	// 오름차순 정렬하기
		int medNum = numArr.get(N/2);	// 예시) 5 -> 0, 1, 2, 3, 4 중 2를 가져와야 함
		System.out.println(medNum);
		
		// 최빈값
		int max = 0;
		for(int i = 0; i < 8001; i++) {
			if(checkCnt[i] > max) {
				max = checkCnt[i];
			}
		}
		for(int j = 0; j < 8001; j++) {
			if(max == checkCnt[j]) {
				modeList.add(j-4000);
			}
		}
		
		if(modeList.size() == 1) {
			System.out.println(modeList.get(0));
		}
		else {
			Collections.sort(modeList);
			System.out.println(modeList.get(1));
		}
		
		
		// 범위
		int range = numArr.get(N-1) - numArr.get(0);
		System.out.println(range);
	}
}
