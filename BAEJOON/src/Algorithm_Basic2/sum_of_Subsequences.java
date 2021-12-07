package Algorithm_Basic2;

//	https://www.acmicpc.net/problem/1182
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class sum_of_Subsequences {

	public static void main(String[] args) throws IOException {
		int N;
		int S;
		int[] arr = new int[21];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		S = Integer.parseInt(input[1]);
		input = br.readLine().split(" ");
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(input[i]);
		int answer = 0;
		for (int mask = 1; mask < (1 << N); mask++) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				if ((mask & (1 << i)) != 0) {
					sum += arr[i];
				}
			}
			if (sum == S) {
				answer++;
			}
		}
		bw.write(answer + "");
		bw.flush();
		bw.close();
		br.close();

	}

}