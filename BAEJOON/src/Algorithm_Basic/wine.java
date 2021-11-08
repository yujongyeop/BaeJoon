package Algorithm_Basic;

//https://www.acmicpc.net/problem/2156
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class wine {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] price = new int[10001];
		int[] DP = new int[10001];
		for (int i = 1; i <= num; i++)
			price[i] = Integer.parseInt(br.readLine());
		DP[1] = price[1];
		DP[2] = DP[1] + price[2];
		for (int i = 3; i <= num; i++) {
			DP[i] = Math.max(DP[i - 3] + price[i] + price[i - 1], DP[i - 2] + price[i]);
			DP[i] = Math.max(DP[i - 1], DP[i]);
		}
		bw.write(DP[num] + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
