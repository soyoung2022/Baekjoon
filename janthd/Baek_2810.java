package janthd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2810 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		String seatInfoString = br.readLine();
		
		int cnt = 1;		// 맨 오른쪽 좌석의 오른쪽에 있는 컵홀더 고려
		for(int i = 0; i < A; i++) {
			char c = seatInfoString.charAt(i);
			
			if(c == 'S') {
				cnt++;
			}
			else if(c == 'L'){
				i++;
				cnt++;
			}
		}
		System.out.println(cnt > A ? A : cnt);
	}
}