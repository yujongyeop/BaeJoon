package Algorithm_Basic;

//https://www.acmicpc.net/problem/2193
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pinary_number {
	/*
	 * 이 문제를 풀 때 처음에는 2차원 DP로 풀려고 했는데 점화식을 만들고 보니 1차원으로도 가능해서 저는 1차원 DP로 풀었습니다.
	 * DP[1] = "1",DP[2] = "10", DP[3] = "100","101"으로 나아가는 데 처음에는 0으로 끝나는 경우와 1로 끝나는 경우 둘을 생각해서
	 * DP[num][0] = DP[num-1][0] + DP[num-1][1], DP[num][1] = DP[num-1][0]로 풀려고 했습니다.
	 * 이 식을 1차원으로 바꾸면 DP[num] = DP[num-1] + DP[num-2]가 됩니다.
	 * 유의사항으로는 DP를 int형으로 초기화하면 오버플로우가 생기기 때문에 long선언 해주셔야 합니다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		long[] DP = new long[91];
		DP[1] = 1;
		DP[2] = 1;
		for (int i = 2; i <= input; i++) {
			DP[i] = DP[i - 1] + DP[i - 2];
		}
		bw.write(Long.toString(DP[input]));
		bw.flush();
		br.close();
		bw.close();

	}

}
