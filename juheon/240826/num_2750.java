package baekjoon;

import java.util.Scanner;

public class num_2750 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int temp = 0;
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j= 1 ; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
}