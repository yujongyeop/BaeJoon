package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LBS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] L_DP = new int[1001];
		int[] R_DP = new int[1001];
		int[] arr = new int[1001];
		int ans = 0;
		String[] input = br.readLine().split(" ");
		for (int i = 1; i <= num; i++)
			arr[i] = Integer.parseInt(input[i - 1]);
		for (int i = 1; i <= num; i++) {// 왼쪽부터 시작하는 LIS
			L_DP[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					L_DP[i] = Math.max(L_DP[i], L_DP[j] + 1);
				}
			}
		}

		for (int i = num; i > 0; i--) {// 오른쪽부터 시작하는 LIS
			R_DP[i] = 1;
			for (int j = num; j > i; j--) {
				if (arr[i] > arr[j]) {
					R_DP[i] = Math.max(R_DP[i], R_DP[j] + 1);
				}
			}
			int tmp = R_DP[i] + L_DP[i] - 1;// R_DP와 L_DP의 합의 -1 값 중 가장 큰 값이 LBS이다.
			if (ans < tmp)
				ans = tmp;
		}
		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
