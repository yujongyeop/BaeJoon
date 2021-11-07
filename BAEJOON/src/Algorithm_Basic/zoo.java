package Algorithm_Basic;

//https://www.acmicpc.net/problem/1309
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class zoo {
	/*
	 * N = 0 일 때 1, N = 1 일 때 3, N = 2 일 때 7이다.
	 * 위 관계로 보았을 때 점화식은 DP[N] = DP[N-1]*2 + DP[N-2]가 된다.
	 */
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] DP = new int[100001];
		DP[0] = 1;
		DP[1] = 3;
		for (int i = 2; i <= num; i++) {
			DP[i] = ((DP[i - 1] * 2) + DP[i - 2]) % 9901;
		}
		bw.write(DP[num] + "");
		bw.flush();
		br.close();
		bw.close();
	}
}
