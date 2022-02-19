package march3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1769 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String X = br.readLine();
		int cnt = 0, result;
		while(true) {
			result = 0;
			if(X.length() == 1) {
				result = Integer.parseInt(X);
				break;
			}
			else {
				cnt += 1;
				for(int i = 0; i < X.length(); i++) {
					result += Integer.parseInt(String.valueOf(X.charAt(i)));
				}
				X = String.valueOf(result);
			}
		}
		System.out.println(cnt);
		if(result % 3 == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
