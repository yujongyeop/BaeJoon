package Algorithm_Basic;

//https://www.acmicpc.net/problem/1149
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class rgbstreet {
	/*
	 * 가격이 주어졌을 때 DP[N]은 RGB 각각에 대해 최소값을 구하는 연산하는 방식으로 DP[num]을 구한다.
	 * DP[N][1]은 DP[N][1]의 가격 + DP[N-1][2]와 DP[N-1][3]의 최소값을 더 한다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[][] DP = new int[1001][4];
		for (int i = 1; i <= num; i++) {// 값을 price 배열에 저장
			String[] p = br.readLine().split(" ");
			for (int j = 0; j < 3; j++)
				DP[i][j + 1] = Integer.parseInt(p[j]);
		}

		for (int i = 2; i <= num; i++) {
			DP[i][1] += Math.min(DP[i - 1][2], DP[i - 1][3]);// DP[i][1]을 선택했을때 DP[i-1]의 최소값이랑 더 함
			DP[i][2] += Math.min(DP[i - 1][1], DP[i - 1][3]);// DP[i][2]을 선택했을때 DP[i-1]의 최소값이랑 더 함
			DP[i][3] += Math.min(DP[i - 1][1], DP[i - 1][2]);// DP[i][3]을 선택했을때 DP[i-1]의 최소값이랑 더 함

		}
		bw.write(Math.min(Math.min(DP[num][1], DP[num][2]), DP[num][3]) + "");// 각각의 색깔에 대한 값 중 최소값을 정한다.
		bw.flush();
		bw.close();
		br.close();
	}

}
