package Algorithm_Basic;

//https://www.acmicpc.net/problem/1699
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class sum_of_squares {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] DP = new int[100001];
		int input = Integer.parseInt(br.readLine());
		for (int i = 0; i <= input; i++)
			DP[i] = i;

		for (int i = 4; i <= input; i++) {
			for (int j = 2; j * j <= i; j++)
				DP[i] = Math.min(DP[i], DP[i - (j * j)] + 1);// DP[i]에 있던 (기존의 값)과 (DP[제곱 값 뺀 값] + 1) 중 최소값을 구한다
		}
		bw.write(Integer.toString(DP[input]));
		bw.flush();
		bw.close();
		br.close();
	}

}
