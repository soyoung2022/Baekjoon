package janthd;
import java.util.Scanner;
import java.util.Arrays;

public class Baek_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		
		char[] str = N.toCharArray();
		Arrays.sort(str);
		
		for(int i = str.length-1; i >= 0; i--) {
			System.out.print(str[i]);
		}
		
		sc.close();
	}
}
