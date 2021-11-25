package Algorithm_Basic2;

//https://www.acmicpc.net/problem/14500
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Tetromino {
	static int N, M, maxSum;
	static int[][] Map; // 사용자 입력 배열
	static int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };// 상하좌우 비교를 위한 배열
	static boolean[][] visited; // 방문했는 지 확인을 위한 배열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());// N
		M = Integer.parseInt(st.nextToken());// M

		Map = new int[N][M];
		for (int i = 0; i < N; i++) {// 배열에 값 저장
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				Map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				visited[i][j] = true;
				dfs(i, j, 1, Map[i][j]);
				maxSum = Math.max(maxSum, getLast(i, j));
				visited[i][j] = false;
			}
		}
		bw.write(maxSum + "");
		bw.flush();
		bw.close();
		br.close();
	}

	static int getLast(int row, int col) {// Map[row][col]을 기준으로 상하좌우 값을 더한다.(ㅗ.ㅜ.ㅓ.ㅏ 모양)
		int base = Map[row][col];// 기준값
		int cnt = 0;
		int min = Integer.MAX_VALUE;// 최소값 저장(초기화 시 int형으로 표현할 수 있는 최대값으로 초기화)
		for (int i = 0; i < dirs.length; i++) {
			int nr = row + dirs[i][0];
			int nc = col + dirs[i][1];
			if (inIn(nr, nc)) {
				cnt++;
				base += Map[nr][nc];
				min = Math.min(min, Map[nr][nc]);
			}
		}
		if (cnt == 4) {// 상하좌우 모두 있는 경우는 4개 값중 최소값을 빼서 반환
			return base - min;
		} else if (cnt == 3) {// 상하좌우중 한개만 없을 경우 더 한 값 반환
			return base;
		} else {// 블럭 모양이 성립 안되는 경우
			return -1;
		}
	}

	static void dfs(int row, int col, int cnt, int sum) {// 행, 열, 깊이, 합 순서
		if (cnt == 4) { // 모양이 완성됐을 때
			maxSum = Math.max(maxSum, sum);
			return;
		}

		for (int i = 0; i < dirs.length; i++) {
			int nr = row + dirs[i][0];
			int nc = col + dirs[i][1];
			if (inIn(nr, nc) && !visited[nr][nc]) {
				visited[nr][nc] = true;
				dfs(nr, nc, cnt + 1, sum + Map[nr][nc]);
				visited[nr][nc] = false;
			}
		}
	}

	static boolean inIn(int r, int c) {// 사용자 입력 배열 내에 좌표가 위치하는 지 확인
		return 0 <= r && r < N && 0 <= c && c < M;
	}

}
