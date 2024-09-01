package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1978 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < num; i ++) {
			int isPrime = Integer.parseInt(st.nextToken());
			
			 if (isPrime <= 1) {
	                continue;
	            }
			
			for(int j = 2; j <= isPrime; j++) {
				if(j == isPrime) {
					cnt++;
				}
				if(isPrime % j == 0) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}

/*
 *
문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다


// 풀이: 소수구하느방법 3가지
 * 1. N보다 작은 자연수로 나누기
 * 2. N의 제곱근보다 작은 자연수로 나누기
 * 3. 에라토스테네스의 체 이용하기
 * -> 1) 2부터 N까지의 수를 나열한다.
 * -> 2) 2부터 가장 작은 수를 소수로 정하고 2의 배수를 모두 지운다.
 * -> 3) 지우지 않은 수 중에서 가장작은수(3)을 소수로 정하고 그 배수(3의 배수)를 지운다.
 * 
	1. N 까지의 범위를 가지는 배열을 만든다.
	   (해당 index 의 수가 소수인지 아닌지 판별해주는 역할)
	2. 제일 작은 소수인 2부터 아래 과정을 돌린다.
	3) 현재 지워지지 않은 수 x 를 중심으로 x를 제외한 x의 배수들은 모두 소수가 아니므로 배열에서 지운다.
   	   -> x 가 이미 지워져있다면 바로 x+1로 넘어간다.
	4) 다음 수 x+1 로 넘어가서 2-1을 반복한다.

*
*
* 스캐너로 풀어보기
* 
import java.util.Scanner;

public class _1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int num;
        
        int cnt = 0;
        
        for(int i = 0; i < N; i++) {
        	num = sc.nextInt();
        	for(int j = 2; j <= num; j++) {
        		if(j == num) {
        			cnt++;
        		}
        		if(num % j == 0) {
        			break;
        		}
        	}
        }
        
        System.out.println(cnt);
	}
}

입력된 수 N을 Scanner를 통해 받는다
N번 반복문을 돌면서 해당 수를 입력 받고
2부터 타겟 넘버까지 반복문을 돌면서
만약 자기 자신이라면 카운트를 1 증가시키고
나머지가 0인 수가 생기면(약수가 존재) 브레이크를 걸어 반복문 탈출
*/



