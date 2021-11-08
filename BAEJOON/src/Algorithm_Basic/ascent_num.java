package Algorithm_Basic;

//https://www.acmicpc.net/problem/11057
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ascent_num {
	/*
	 * 길이가 1인 경우의 오르막 수는 0~9까지 총 10개이다
	 * 이때 끝나는 수로 표를 만들어서 길이가 2인 경우를 구하면 j로 끝나는 길이 2인 오르막 수는
	 * 길이가 1인 오르막 수의 0~j로 끝나는 수의 합이랑 같다. ex)DP[2][3] = DP[1][0] ~ DP[1][3]의 합
	 * 이 경우 점화식은 DP[N][J] = DP[N-1][0~j]의 합이다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[][] DP = new int[1001][10];
		for (int i = 0; i < 10; i++)
			DP[1][i] = 1;
		for (int i = 2; i <= num; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k <= j; k++) {
					DP[i][j] = (DP[i][j] + DP[i - 1][k]) % 10007;
				}
			}
		}
		int result = 0;
		for (int i = 0; i < 10; i++)
			result += DP[num][i];
		bw.write(result % 10007 + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
