package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class rgbstreet2 {
	/*
	 * 가격이 주어졌을 때 DP[N]은 RGB 각각에 대해 최소값을 구하는 연산하는 방식으로 DP[num]을 구한다. DP[N][1]은
	 * DP[N][1]의 가격 + DP[N-1][2]와 DP[N-1][3]의 최소값을 더 한다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[][] DP = new int[1001][4];
		int[][] price = new int[1001][4];
		int ans = 1000001;
		for (int i = 1; i <= num; i++) {// 값을 price 배열에 저장
			String[] p = br.readLine().split(" ");
			for (int j = 0; j < 3; j++)
				price[i][j + 1] = Integer.parseInt(p[j]);
		}
		for (int k = 1; k <= 3; k++) // 첫 번째 집의 색깔 k(1:red, 2:green, 3:blue)
		{
			for (int i = 1; i <= 3; i++) {
				if (i == k)
					DP[1][i] = price[1][i]; // 현재 색깔을 첫 번째 집 색깔로 고정
				else
					DP[1][i] = 1000 * 1000 + 1;
			}

			for (int i = 2; i <= num; i++) {
				DP[i][1] = Math.min(DP[i - 1][2], DP[i - 1][3]) + price[i][1];
				DP[i][2] = Math.min(DP[i - 1][1], DP[i - 1][3]) + price[i][2];
				DP[i][3] = Math.min(DP[i - 1][1], DP[i - 1][2]) + price[i][3];

			}
			for (int i = 1; i <= 3; i++) {
				if (i == k)
					continue;
				else
					ans = Math.min(ans, DP[num][i]);
			}
		}
		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
