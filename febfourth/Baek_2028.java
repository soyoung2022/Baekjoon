package febfourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2028 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			String numString = br.readLine();
			int numInt = Integer.valueOf(numString);
			//  76 * 2 = 5776 -> 5776 % 100= 76
			if(Math.pow(numInt, 2) % Math.pow(10, numString.length()) == numInt ) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
