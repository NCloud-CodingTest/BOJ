package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _9461_파도반_수열 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine());
            long arr[] = new long[101];

            
            arr[1] = arr[2] = arr[3] = 1;
            arr[4] = arr[5] = 2;

            
            for (int i = 6; i <= 100; i++) {
                arr[i] = arr[i - 1] + arr[i - 5];
            }

            
            for (int tc = 0; tc < N; tc++) {
                int num = Integer.parseInt(br.readLine());
                bw.write(arr[num] + "\n");
            }

            br.close();
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
