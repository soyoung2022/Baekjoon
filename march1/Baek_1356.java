package march1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1356 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split("");
		int k = 0;
		if(num.length == 1) {
			System.out.println("NO");
			return;
		}
		while(k < num.length) {
			int a = 1, b = 1;
			for(int i = 0; i < k; i++) {
				a *= Integer.parseInt(num[i]);
			}
			for(int i = k; i < num.length; i++) {
				b *= Integer.parseInt(num[i]);
			}
			if(a == b) {
				System.out.println("YES");
				return;
			}
			k++;
		}
		System.out.println("NO");
	}
}
