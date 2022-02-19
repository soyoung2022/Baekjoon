package febfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baek4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());    // 테스트 케이스 C
        ArrayList<Integer> scoreList;
        StringTokenizer st;
        for(int i = 0; i < C; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());   // 학생의 수 N
            scoreList = new ArrayList<>();      // 각 테스트 케이스마다 학생들 점수 저장할 배열
            int cnt = 0;        // 평균을 넘는 학생의 수 저장할 변수 cnt
            double avgScore = 0;    // 평균 점수를 저장할 변수 avgScore
            for(int j = 0; j < N; j++){
                scoreList.add(Integer.parseInt(st.nextToken()));    // 학생 점수 토큰으로 분리해 배열에 저장
                avgScore += scoreList.get(j);
            }
            avgScore = avgScore / N;    // 최종 평균 계산
            // System.out.println(avgScore);
            for(int j = 0; j < scoreList.size(); j++){      // 평균 '넘는' 학생 수 구하기 --> 부등호는 >
                if(scoreList.get(j) > avgScore){
                    cnt++;
                }
            }
            // System.out.println(cnt);
            double result = (double) cnt / N * 100;     // 평균 넘는 학생의 '비율'을 출력해야 함 --> 평균 넘는 학생 수 / 전체 학생 수 * 100
            System.out.println(String.format("%.3f%%", result));    // 반올림해 소수점 셋째 자리까지 출력 --> String.format() 사용 -> %%는 % 출력함
        }
    }
}
