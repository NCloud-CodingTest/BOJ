package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class num_25305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int result = arr[N - k];

        System.out.println(result);

        sc.close();
		}
	} 

