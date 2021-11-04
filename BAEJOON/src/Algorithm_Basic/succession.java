package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class succession {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] input = new int[num];
		int[] DP = new int[num];
		int max = -10001;
		for (int i = 0; i < num; i++)
			input[i] = Integer.parseInt(str[i]);
		DP = input.clone();
		for (int i : input)
			if (i > max)
				max = i;
		for (int i = 1; i < num; i++) {
			DP[i] = Math.max(DP[i - 1] + input[i], input[i]);
			if (DP[i] > max)
				max = DP[i];
		}
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
		br.close();
	}

}
