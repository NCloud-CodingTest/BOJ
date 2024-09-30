package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10798 {

	public static void main(String[] args) {
//		2차원 배열 문자열을 받고 그 배열을 세로로 한 열씩
//		이때 그 값이 비어있으면 건너뛰고 다음 행의 같은 열의 값을 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char arr[][] = new char[5][15];
		
		try {
			for(int i = 0; i < 5; i++) {
				String str = br.readLine();
				for(int j = 0; j < str.length(); j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			for(int j = 0; j < arr[0].length; j++) {
				for(int i = 0; i < 5; i++) {
					if(arr[i][j] == 0) {
						continue;
					}
					bw.write(String.valueOf(arr[i][j]));
				}
			}
			br.close();
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
