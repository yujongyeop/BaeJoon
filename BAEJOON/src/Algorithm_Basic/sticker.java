package Algorithm_Basic;

//https://www.acmicpc.net/problem/9465
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class sticker {
	/*
	 * DP배열에 모든 경우에 대한 최소값을 구하는 방식
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] DP = new int[2][100002];
		int[][] price = new int[2][100002];
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			int size = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			for (int j = 1; j <= size; j++)
				price[0][j] = Integer.parseInt(str[j - 1]);
			str = br.readLine().split(" ");
			for (int j = 1; j <= size; j++)
				price[1][j] = Integer.parseInt(str[j - 1]);
			DP[0][1] = price[0][1];
			DP[1][1] = price[1][1];
			for (int j = 2; j <= size; j++) {
				DP[0][j] = Math.max(DP[1][j - 1], DP[1][j - 2]) + price[0][j];
				DP[1][j] = Math.max(DP[0][j - 1], DP[0][j - 2]) + price[1][j];
			}
			bw.write(Math.max(DP[0][size], DP[1][size]) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
