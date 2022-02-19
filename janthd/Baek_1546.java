package janthd;
import java.util.Scanner;
import java.util.ArrayList;

public class Baek_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> scoreList = new ArrayList<> ();
		int N;
		N = sc.nextInt();
		int scoreFirst = sc.nextInt();
		scoreList.add(scoreFirst);
		int max = scoreList.get(0);
		for(int i = 1; i < N; i++) {
			int score = sc.nextInt();
			scoreList.add(score);
			if(max < score) {
				max = score;
			}
		}
		
		// System.out.println(max);
		double avg = 0;
		for(int i = 0; i < N; i++) {
			avg += (((double) scoreList.get(i) / max) * 100);
		}
		// System.out.println(avg);
		avg /= N;
		System.out.println(avg);
		
		sc.close();
	}
}
