package Algorithm_Basic2;

//https://www.acmicpc.net/problem/15661
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Start_and_Link {
	static int N, ans, team_Depth;
	static int[][] input;
	static boolean[] visit;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());// 참가자 명수
		team_Depth = 1; // 팀 구성 명수
		input = new int[N][N];// 팀원 간 능력치 배열
		visit = new boolean[N];// 방문 여부 배열
		ans = Integer.MAX_VALUE;// 정답 저장 변수

		for (int i = 0; i < N; i++) {// 사용자 입력을 배열에 저장
			String[] userInput = br.readLine().split(" ");
			for (int j = 0; j < N; j++)
				input[i][j] = Integer.parseInt(userInput[j]);
		}

		for (; team_Depth < N; team_Depth++)// 깊이가 1~N-1일 때의 경우를 모두 탐색
			dfs(0, 0);

		bw.write(ans + "");// 정답 출력
		bw.flush();
		bw.close();
		br.close();
	}

	static int calc_Ability() {// 두 팀간의 능력치 차이 연산
		int start_Team = 0; // start팀의 능력치
		int link_Team = 0; // link팀의 능력치
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (visit[i] && visit[j]) // visit[i]와 visit[j]가 모두 참이면 start팀의 선수
					start_Team += (input[i][j] + input[j][i]);
				else if (!visit[i] && !visit[j]) // visit[i]와 visit[j]가 모두 거짓이면 link팀의 선수
					link_Team += (input[i][j] + input[j][i]);
			}
		}

		return Math.abs(start_Team - link_Team);// 두 팀간의 능력치 차 반환
	}

	static void dfs(int start, int depth) {// start팀의 인원을 구하는 함수
		if (depth == team_Depth) {// team_Depth만큼 start팀이 정해졌을 때
			ans = Math.min(ans, calc_Ability());
			return;
		}

		for (int i = start; i < N; i++) {// start로 시작해서 연산 횟수를 줄임 Ex)(1,2)와 (2,1)은 같은 것으로 (1,2)만 연산
			if (visit[i])
				continue;
			visit[i] = true;
			dfs(i + 1, depth + 1);
			visit[i] = false;
		}
	}
}