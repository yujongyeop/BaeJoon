package Algorithm_Basic;

//https://www.acmicpc.net/problem/11722
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LDS {
	/*
	 * LIS 코드를 살짝 변경함
	 * 동작 원리는 똑같음
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] input = new int[num];
		int ans = 0;
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < num; i++)
			input[i] = Integer.parseInt(str[i]);
		int[] DP = new int[num];
		for (int i = 0; i < num; i++) {
			DP[i] = 1;
			for (int j = 0; j < i; j++) {
				if (input[j] > input[i]) {//LIS에서는 input[i]가 더 컸어야 하나 LDS에서는 작아야한다.
					DP[i] = Math.max(DP[i], DP[j] + 1);
				}
			}
		}
		for (int i : DP)
			if (i > ans)
				ans = i;
		bw.write(Integer.toString(ans));
		bw.flush();
		bw.close();
		br.close();
	}

}
