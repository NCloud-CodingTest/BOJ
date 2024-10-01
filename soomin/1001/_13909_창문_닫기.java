package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _13909_창문_닫기 {
	
	// 이해하는데 참고된 벨로그: https://velog.io/@gayeong39/백준-13909-창문-닫기-JAVA
	// 1. Math.sqrt(n)은 n의 제곱근을 계산하는 메서드
	// 2. Math.floor()는 소수점 이하의 숫자를 내림하는 함수
	// (내림이란, 주어진 수를 가장 가까운 작은 정수로 변환)
	

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			int N = Integer.parseInt(br.readLine()); // 입력 값 정수 변환
	        int result = (int) Math.floor(Math.sqrt(N));
	        // 1. 제곱근 구해서
	        // 2. 내림으로 해서 정수 반환
	        // 3. 이후 캐스팅 연산자써서 int로 변환
	        bw.write(result+ "\n");
	    
	        br.close();
	        bw.flush();
	        bw.close();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}




