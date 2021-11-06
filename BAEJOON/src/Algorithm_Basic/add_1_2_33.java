package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class add_1_2_33 {
	/*
	 * 풀이: N = 1 일 때 1, N = 2 일 떼 2, N = 3 일 때 4, N = 4 일 때 7가지의 경우의 수가 나온다 즉 N =
	 * (N-1) + (N-2) + (N-3) 라는 규칙성을 가진다.
	 *  기존 1,2,3 더하기 문제에서 DP를 int → long 변경 및 DP
	 * 크기를 12 → 1000002 변경 했음 그리고 문제 조건중 하나인 1000000009의 나머지 풀력 추가
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		long[] DP = new long[1000002]; // 범위가 작음으로 11로 고정 함
		DP[1] = 1;
		DP[2] = 2;
		DP[3] = 4;
		for (int i = 4; i <= 1000000; i++) {
			DP[i] = (DP[i - 1] + DP[i - 2] + DP[i - 3]) % 1000000009;
		}
		for (int i = 0; i < num; i++) {
			sb.append(DP[Integer.parseInt(br.readLine())] + "\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
