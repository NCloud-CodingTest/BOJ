package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class num_4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
				int cnt = Integer.parseInt(br.readLine());
				
				for(int i = 0; i < cnt; i++) {
					StringTokenizer st = new StringTokenizer(br.readLine(), " ");
					
					int students = Integer.parseInt(st.nextToken());
					int[] scores = new int[students];
					float avg = 0;
					
					for(int j = 0; j < students; j++) {
						scores[j] = Integer.parseInt(st.nextToken());
						avg += scores[j];
					}
					
					avg /= students;
					float hi = 0;
					
					for(int j = 0; j < students; j++) {
						if(avg < scores[j]) {
							hi++;
						}
					}
					System.out.printf("%.3f%%\n", (hi / students) * 100);
				}
			
	}

}
