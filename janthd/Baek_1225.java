package janthd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1225 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		String[] a = A.split("");
		String[] b = B.split("");
		
		long sum = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				sum += (Integer.parseInt(a[i]) * Integer.parseInt(b[j]));
			}
		}
		System.out.println(sum);
	}
}
