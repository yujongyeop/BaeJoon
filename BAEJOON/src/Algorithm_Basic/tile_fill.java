package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class tile_fill {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] DP = new int[31];
		DP[0] = 1;
		DP[2] = 3;
		for (int i = 4; i <= num; i++) {
			DP[i] = DP[i - 2] * 3;
			for (int j = 4; j <= i; j += 2) {
				DP[i] += DP[i - j] * 2;
			}
		}
		bw.write(DP[num] + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
