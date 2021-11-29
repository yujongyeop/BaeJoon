package Algorithm_Basic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Lotto {
	static int N;
	static boolean[] visit = new boolean[12];
	static int[] arr = new int[6];
	static int[] input;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			String[] userInput = br.readLine().split(" ");
			if (userInput[0].equals("0")) {//입력 값이 0일 경우
				break;
			}

			N = Integer.parseInt(userInput[0]);// 숫자 개수
			input = new int[N];//사용자 입력 배열
			
			for (int i = 0; i < N; i++)//사용자 입력 저장
				input[i] = Integer.parseInt(userInput[i + 1]);
			
			Arrays.sort(input);//오름차순 정렬을 통해 연산과정을 줄임
			//정렬이 안되있을 경우 사전순이 아닌 경우에 대해서도 연산을 해야하기 때문(모든 경우가 줄어드는 건 아님)
			
			dfs(0, 0);
			
			bw.write(String.valueOf(sb));
			sb.setLength(0);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}

	static void dfs(int start, int depth) {//start변수를 통해 사전순이 아닌 경우를 제거
		if (depth == 6) {
			for (int m : arr)
				sb.append(m + " ");
			sb.append("\n");
			return;
		}
		for (int i = start; i < N; i++) {//i의 시작값을 start로 하여 arr[i]앞에 그보다 큰 값이 들어갈 수 없게함
			if (visit[i])
				continue;
			arr[depth] = input[i];
			visit[i] = true;
			dfs(i + 1, depth + 1);
			visit[i] = false;
		}
	}
}
