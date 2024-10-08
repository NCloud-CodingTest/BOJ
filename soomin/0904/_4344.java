package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _4344 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken()); // 테스트 케이스의 개수
            
            for (int i = 0; i < C; i++) {
                st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken()); // 학생 수
                
                int[] scores = new int[N];
                int sum = 0;
                
                for (int j = 0; j < N; j++) {
                    scores[j] = Integer.parseInt(st.nextToken());
                    sum += scores[j];
                }
                
                double average = (double) sum / N;
                int aboveAverage = 0;
                
                for (int k = 0; k < N; k++) {
                    if (scores[k] > average) {
                        aboveAverage++;
                    }
                }
                
                double perc = (double) aboveAverage / N * 100;
                bw.write(String.format("%.3f%%\n", perc));
            }
        } finally {
            if (bw != null) bw.flush();
            if (bw != null) bw.close();
            if (br != null) br.close();
        }
    }
}

/*
 * 
문제
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
정답과 출력값의 절대/상대 오차는 10-3이하이면 정답이다.
 * 
 * 
 * */
