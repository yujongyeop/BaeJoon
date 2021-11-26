package Algorithm_Basic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class all_Permutation {
	static int N;
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		visit = new boolean[N];
		dfs(0);
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int depth) {
		if (depth == N) {// 깊이가 N만큼 됐을때 sb에 값을 넣음
			for (int num : arr)
				sb.append(num + " ");
			sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visit[i] == true) // 이미 방문한 수면 다음 수로 넘어간다
				continue;
			visit[i] = true;// 방문 여부를 true로 바꿈
			arr[depth] = i + 1;// arr[depth]에 하나씩 쌓음
			dfs(depth + 1);
			visit[i] = false;// 재귀호출이 끝나면 다시 false로 바꿈
		}
	}

}
