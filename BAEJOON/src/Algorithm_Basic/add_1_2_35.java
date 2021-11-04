package Algorithm_Basic;

//https://www.acmicpc.net/problem/15990
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class add_1_2_35 {
	/*
	 * 저는 풀 때 https://gdlovehush.tistory.com/260 블로그 참고해서 풀었습니다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		long[][] DP = new long[1000001][4];
		DP[1][1] = DP[2][2] = DP[3][1] = DP[3][2] = DP[3][3] = 1;
		for (int j = 4; j <= 1000000; j++) {
			DP[j][1] = (DP[j - 1][2] + DP[j - 1][3]) % 1000000009;// DP[num]에서 끝이 1로 끝나는 경우의 수는 DP[num-1][2]와
																	// DP[num-1][3]의 개수를 더 한거와 같다.
			DP[j][2] = (DP[j - 2][1] + DP[j - 2][3]) % 1000000009;
			DP[j][3] = (DP[j - 3][1] + DP[j - 3][2]) % 1000000009;
		}
		for (int i = 1; i < num + 1; i++) {
			int input = Integer.parseInt(br.readLine());
			sb.append((DP[input][1] + DP[input][2] + DP[input][3]) % 1000000009 + "\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
