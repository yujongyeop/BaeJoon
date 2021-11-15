package Algorithm_Basic;

//https://www.acmicpc.net/problem/11055
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BIS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] input = new int[1001];
		int[] DP = new int[1001];
		String[] in = br.readLine().split(" ");
		for (int i = 1; i <= num; i++) {
			input[i] = Integer.parseInt(in[i - 1]);
		}
		DP[1] = input[1];
		for (int i = 2; i <= num; i++) {
			for (int j = 1; j < i; j++) {
				if (input[i] > input[j]) {
					DP[i] = Math.max(DP[i], DP[j]);
				}
			}
			DP[i] += input[i];
		}
		int ans = 0;
		for (int n : DP)
			if (ans < n)
				ans = n;
		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
