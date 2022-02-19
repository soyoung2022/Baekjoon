package janthd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baek_2577 {
	public static void main(String[] args) throws IOException{
		int[] cnt = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
	
		int num = A * B * C;
		ArrayList<String> numString = new ArrayList<String>();
		while (num > 0) {
			int addnum = num % 10;
			numString.add(String.valueOf(addnum));
			num /= 10;
		}
		
		for(int i = 0; i < numString.size(); i++) {
			int index = Integer.parseInt(numString.get(i));
			cnt[index]++;
		}
		
		for(int c: cnt) {
			System.out.println(c);
		}
	}
}

