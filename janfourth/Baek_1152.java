package janfourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2022년 1월 25일 화요일
// 푼 시간: 20분 정도 걸린 듯,,  -> split 했다가 막혀서 다시 돌아감...
// 처음 : split으로 공백 기준 분리해서 배열에 넣고 그 배열 길이 출력하기!
public class Baek_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		
		int cnt = 0;
		boolean flag = false; // 알파벳 처음 나오면 true 되고 그 이후에 공백 만나면 다시 false
		for(int i = 0; i < str.length; i++) {
			if (!flag && ((65 <= str[i] && str[i] <= 90) || (97 <= str[i] && str[i] <= 122))) {		// 첫 제출 틀린 이유 : str[i] <= 90 이라고 해야 하는데 str[i] < 90 이라고 해서 Z로 시작하는 단어 카운팅 안 됨
				cnt++;
				flag = true;
			}
			else if(flag && str[i] == ' ') {
				flag = false;
			}
		}
		System.out.println(cnt);
		
	}
}
