package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

public class _3041_N퍼즐 {
//	단계별로 풀이하기
//	1. 목표 상태 저장하기
//	목표 상태는 고정되어 있으므로 이 값을 배열로 저장
//
//	2. 입력받은 퍼즐의 상태를 배열로 저장하기
//	사용자가 입력한 퍼즐을 배열로 읽어온다
//
//	3. 각 정사각형의 목표 위치 찾기
//	현재 퍼즐의 상태를 기준으로 각 정사각형이 목표 위치와 얼마나 떨어져 있는지 계산
//
//	4. 맨해튼 거리 계산하고 합산하기
//	각 정사각형의 맨해튼 거리를 계산하여 모두 합산하면 흩어짐 정도가 나옴
//
// 5. 맨해튼 거리공식 - 두 점 사이의 수평 및 수직 거리의 합을 의미
// 맨허튼 거리 = ∣p1−q1∣ + ∣p2−q2∣ 또는 ∣x1-x2∣ + ∣y1-y2∣ 
// (x1, y1)는 현재 위치 (x2, y2)는 목표 위치
	
	private static final char[][] finish = {
			// 퍼즐이 풀린 상태를 기억하는 표 (목표 상태)
	        {'A', 'B', 'C', 'D'},
	        {'E', 'F', 'G', 'H'},
	        {'I', 'J', 'K', 'L'},
	        {'M', 'N', 'O', '.'}
	};
	
	public static void main(String[] args) {
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			char[][] puzzle = new char[4][4];
			
			for (int i = 0; i < 4; i++) {
				String line = br.readLine().replace(" ", ""); // 한 줄을 읽어서 빈칸을 지워요.
			    for (int j = 0; j < 4; j++) {
			        puzzle[i][j] = line.charAt(j); // 각 글자를 퍼즐 표에 넣어요.
			    }
			}
			
			int totalDistance = 0;// 흩어짐 정도를 계산하는 숫자
			
			 // 각 칸에 대해 목표 위치와 현재 위치 간 거리 합산
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                char currentChar = puzzle[i][j];// 현재 위치의 글자를 가져와요
	                if (currentChar != '.') {// 빈칸이 아니면
	                	// 그 글자가 목표 상태에서는 어디에 있는지 찾아요.
	                    int[] goalPos = findFinishPosition(currentChar);
	                    int finishX = goalPos[0];
	                    int finishY = goalPos[1];
	                    // 현재 위치와 목표 위치의 거리 차이를 계산해요
	                    totalDistance += Math.abs(i - finishX) + Math.abs(j - finishY);
	                }
	            }
	        }
	        
	        // 흩어짐 정도 출력
	        System.out.println(totalDistance);
	        
	     // 목표 상태에서 알파벳의 위치를 찾는 함수
	        			
		} catch (Exception e) {
			e.printStackTrace();
		}
			

	}
	// 글자가 목표 상태에서 어디에 있는지 찾는 함수
	private static int[] findFinishPosition(char ch) {
		// 목표 상태를 다 뒤져서 그 글자를 찾아요.
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if (finish[x][y] == ch) {
                    return new int[]{x, y};// 찾으면 그 위치를 알려줘요.
                }
            }
        }
        return null; // 절대 발생하지 않는 경우 (모든 알파벳이 존재하므로) // 이 부분은 사실 실행되지 않아요.
    
    }

}
