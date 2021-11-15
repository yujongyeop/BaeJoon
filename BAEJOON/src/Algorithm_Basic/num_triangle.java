package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num_triangle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int line_num = Integer.parseInt(br.readLine());
		int[][] triangle = new int[501][501];
		int[][] DP = new int[501][501];
		for (int i = 1; i <= line_num; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 1; j <= i; j++) {
				triangle[i][j] = Integer.parseInt(input[j - 1]);
			}
		}
		DP[1][1] = triangle[1][1];
		for (int i = 2; i <= line_num; i++) {
			for (int j = 1; j <= i; j++) {
				DP[i][j] = Math.max(DP[i - 1][j - 1], DP[i - 1][j]) + triangle[i][j];
			}
		}
		int ans = 0;
		for (int i = 1; i <= line_num; i++) {
			if (ans < DP[line_num][i])
				ans = DP[line_num][i];
		}
		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();

	}
}
