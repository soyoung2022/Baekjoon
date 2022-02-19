package janthd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2753 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		
		if((A % 4 == 0 && A % 10 != 0) || (A % 400 == 0)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}
