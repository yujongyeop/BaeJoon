package Algorithm_Basic2;

//https://www.acmicpc.net/problem/14501
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class leave {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] time = new int[N + 1];
		int[] price = new int[N + 1];
		int[] DP = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			String[] userInput = br.readLine().split(" ");
			time[i] = Integer.parseInt(userInput[0]);
			price[i] = Integer.parseInt(userInput[1]);
			DP[i] = price[i];
		}

		for (int i = 2; i <= N; i++) {
			for (int j = 1; j < i; j++) {
				if (i - j >= time[j]) {
					DP[i] = Math.max(price[i] + DP[j], DP[i]);
				}
			}
		}
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			if (i + time[i] <= N + 1) {
				ans = Math.max(ans, DP[i]);
			}
		}

		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
