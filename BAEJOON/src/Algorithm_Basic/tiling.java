package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class tiling {
	static int[] DP = new int[1001];

	static int fibonacci(int num) {
		if (num < 2)
			return DP[num];
		if (DP[num] != 0) {
			return DP[num];
		} else {
			return DP[num] = (fibonacci(num - 1) + fibonacci(num - 2)) % 10007;//10007로 나눠서 나머지를 구하는 건 문제 조건에도 있음(하는 이유는 오버플로우 방지로 추청)
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		DP[0] = 0;
		DP[1] = 1;
		DP[2] = 2;
		int input = Integer.parseInt(br.readLine());
		sb.append(fibonacci(input));// 규칙은 피보나치와 같다 N이 개수별로 경우의 수를 계산해보면 나온다
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
