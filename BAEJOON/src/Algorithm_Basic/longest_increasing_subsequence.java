package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class longest_increasing_subsequence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] input = new int[num];
		int result = 0;
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < num; i++)
			input[i] = Integer.parseInt(str[i]);
		int[] DP = new int[num];
		for (int i = 0; i < num; i++) {
			DP[i] = 1;
			for (int j = 0; j < i; j++) {
				if (input[j] < input[i]) {
					DP[i] = Math.max(DP[i], DP[j] + 1);
				}
			}
		}
		for (int i : DP)
			if (i > result)
				result = i;
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}

}
