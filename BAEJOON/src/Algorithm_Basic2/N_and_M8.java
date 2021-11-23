package Algorithm_Basic2;

//https://www.acmicpc.net/problem/15657
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class N_and_M8 {

	static int[] arr, table;
	static StringBuilder sb = new StringBuilder();
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		arr = new int[M];
		table = new int[N + 1];
		input = br.readLine().split(" ");
		for (int i = 1; i < N + 1; i++)
			table[i] = Integer.parseInt(input[i - 1]);
		Arrays.sort(table);
		DFS(1, 0);
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

	static void DFS(int start, int depth) {
		if (depth == M) {
			for (int i = 0; i < M - 1; i++) {
				if (arr[i] > arr[i + 1])
					return;
			}
			for (int val : arr) {
				sb.append(val + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= N; i++) {
			arr[depth] = table[i];
			DFS(i + 1, depth + 1);
		}
	}

}
