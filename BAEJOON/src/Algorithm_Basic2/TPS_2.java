package Algorithm_Basic2;

//https://www.acmicpc.net/problem/10971
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TPS_2 {
	static int N, ans, start;
	static boolean[] visit;
	static int[] arr;
	static int[][] input;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());// 도시 개수
		input = new int[N][N];// 사용자 입력 배열
		visit = new boolean[N];// 방문 여부 저장 배열
		arr = new int[N];// dfs 배열
		ans = Integer.MAX_VALUE;// 정답 변수

		for (int i = 0; i < N; i++) {// 사용자 입력 받아오는 부분
			String[] user_Input = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				input[i][j] = Integer.parseInt(user_Input[j]);
			}
		}

		for (int i = 0; i < N; i++) {//시작점이 주어져 있지 않아 모든 위치가 시작점이 될 수 있음
			start = i;
			dfs(i, 0);
		}
		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int row, int depth) {// row를 통해 자신의 위치에서 갈 수 있는 곳을 정함
		if (depth == N) {
			int sum = 0;
			for (int m : arr)
				sum += m;
			ans = Math.min(sum, ans);
		}
		for (int i = 0; i < N; i++) {
			/*
			 *첫번째 조건: 중복 반복 여부 확인(방문 했으면 못감)
			 *두번째 조건: 갈려고하는 곳의 비용이 0이면 갈 수 없는 곳(문제 조건 중 비용이 0인 곳은 갈 수 없다고 명시)
			 *세번째 조건: 깊이가 N이 아니면서 i가 시작 위치랑 같으면 안됨(이는 완전 탐색 과정에서 중간에 시작 위치로 돌아가는 걸 막기 위한 것)
			 */
			if (visit[i] || input[row][i] == 0 || (depth != N - 1 && i == start))
				continue;
			
			arr[depth] = input[row][i];
			visit[i] = true;
			dfs(i, depth + 1);
			visit[i] = false;
		}
	}

}
