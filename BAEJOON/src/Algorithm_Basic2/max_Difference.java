package Algorithm_Basic2;

//https://www.acmicpc.net/problem/10819
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class max_Difference {
	static int N, ans;
	static boolean[] visit;
	static int[] arr, input;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());// N
		input = new int[N];// 사용자 입력 배열
		arr = new int[N];// DFS의 배열
		visit = new boolean[N];// 방문 여부 저장 배열
		ans = -1; // 정답을 저장하는 변수
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) // 사용자 입력 배열 저장
			input[i] = Integer.parseInt(st.nextToken());
		dfs(0); // 깊이 우선 탐색
		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int depth) {// 깊이 우선 탐색으로 확인
		if (depth == N) { // 깊이가 N이 될 경우 문제의 식으로 값을 구함
			int sum = 0;
			for (int i = 1; i < N; i++) {
				sum += Math.abs(arr[i - 1] - arr[i]);
			}
			if (sum > ans) // sum이 ans보다 클 경우 최대값 최신화
				ans = sum;
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visit[i])
				continue;
			arr[depth] = input[i];
			visit[i] = true;
			dfs(depth + 1);
			visit[i] = false;
		}
	}
}
