package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class succession2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[100001];
		int[][] DP = new int[2][100001];
		String[] input = br.readLine().split(" ");
		for (int i = 1; i <= num; i++) {
			arr[i] = Integer.parseInt(input[i - 1]);
		}
		int ans = arr[1];
		for (int i = 1; i <= num; i++) {
			DP[0][i] = DP[1][i] = arr[i];
			DP[0][i] = Math.max(DP[0][i - 1] + arr[i], arr[i]);
			DP[1][i] = Math.max(DP[0][i - 1], DP[1][i - 1] + arr[i]);
			ans = Math.max(ans, Math.max(DP[0][i], DP[1][i]));
		}
		bw.write(ans + "");
		bw.flush();
		br.close();
		bw.close();
	}

}
