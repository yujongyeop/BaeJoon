package Algorithm_Basic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class leave {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[][] input = new int[N + 1][2];
		int[] DP = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			String[] userInput = br.readLine().split(" ");
			input[i][0] = Integer.parseInt(userInput[0]);
			input[i][1] = Integer.parseInt(userInput[1]);
			DP[i] = input[i][1];
		}

		for (int i = 2; i <= N; i++) {
			for (int j = 1; j < i; j++) {
				if (i - j >= input[j][0]) {
					DP[i] = Math.max(input[i][1] + DP[j], DP[j]);
				}
			}
		}
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			if (i + input[i][0] <= N + 1) {
				if (ans < DP[i])
					ans = DP[i];
			}
		}

		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
