package janfourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// 2022년 1월 25일 화요일
// 30분 정도 걸림
// 그룹 단어 찾기
public class Baek_1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		

		int cnt = 0;		// 그룹 단어 개수 셀 cnt 변수
		for(int i = 0; i < N; i++) {
			String[] str = br.readLine().split("");			// String[]형으로 입력받기 위해서 .split("") 이용
			// Case 1 : 입력된 단어가 한 글자일 경우 Ex) a, b, c, d, ... , z
			if(str.length == 1) {
				cnt++;
			}
			// Case 2 : 입력된 단어가 두 글자 이상일 경우 Ex) ab, abc, ddef, ... 등
            else{
                String flag = str[0];
			    ArrayList<String> strArr = new ArrayList<>();		// 그냥 배열 안 쓰고 ArrayList 쓴 이유 : 배열 크기 안 정하고 순서대로 앞에서부터 하나씩 배열 원소로 넣고 싶어서
			    strArr.add(str[0]);
			    boolean isGroup = true;			// 맨 처음 가정은 해당 단어가 그룹 단어, 즉, true임 --> 아래 반복문에서 그룹 단어가 아니면 false 대입하기
			    for(int j = 0; j < str.length; j++) {
				    if (flag.equals(str[j])) {
					
				    }
				    else {
					    if(Collections.frequency(strArr, str[j]) > 0) {
					    	isGroup = false;
						    break;
					    }
					    else {
						    strArr.add(str[j]);
					    }
					    flag = str[j];
				    }
			    }
                if(isGroup) {
				    cnt++;
			    }
            }
		}
		
		System.out.println(cnt);
	}
}

