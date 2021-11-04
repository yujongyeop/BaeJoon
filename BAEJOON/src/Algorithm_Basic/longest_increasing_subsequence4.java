package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class longest_increasing_subsequence4 {
	/*
	 * cache 배열을 사용하는데 이 방식은 백트래킹 방식입니다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		int idx = 0;

		int[] input = new int[1001];
		int[] DP = new int[1001];
		int[] cache = new int[1001];
		int max = 0;
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < num; i++)
			input[i] = Integer.parseInt(str[i]);
		for (int i = 0; i < num; i++) {
			DP[i] = 1;
			for (int j = 0; j < i; j++) {
				if (input[j] < input[i] && DP[j] + 1 > DP[i]) {
					DP[i] = DP[j] + 1;
					cache[i] = j;
				}
			}
			if (DP[i] > max) {
				max = DP[i];
				idx = i;
			}
		}
		int[] ans = new int[max];
		sb.append(max + "\n");
		for (int i = max - 1; i >= 0; i--) {
			ans[i] = input[idx];
			idx = cache[idx];
		}
		for (int i : ans)
			sb.append(i + " ");
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}