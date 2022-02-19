package janfourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2022년 1월 25일 화요일
// 5~6분
// 처음 보자마자 든 생각 -> .indexOf 사용하기
public class Baek_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		
		for(int i = 'a'; i <= 'z'; i++) {		// 첫 제출 틀린 이유 --> i < 'z' 라고 했음 (i <= 'z'라고 해야 한다.)
			System.out.print(str.indexOf(i) + " ");
		}
	}
}
