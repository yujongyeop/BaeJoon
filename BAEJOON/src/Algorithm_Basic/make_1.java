package Algorithm_Basic;

//https://www.acmicpc.net/problem/1463
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class make_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int[] DP = new int[input + 1];
		for (int i = 2; i < input + 1; i++) {// 2부터 input까지 1를 구할 수 있는 최소값을 모두 구함
			DP[i] = DP[i - 1] + 1;
			if (i % 2 == 0)
				DP[i] = Math.min(DP[i], DP[i / 2] + 1);
			if (i % 3 == 0)
				DP[i] = Math.min(DP[i], DP[i / 3] + 1);
		}
		bw.write(Integer.toString(DP[input]));
		bw.flush();
		bw.close();
		br.close();
	}
}
