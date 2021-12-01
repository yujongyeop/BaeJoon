package Algorithm_Basic2;

//https://www.acmicpc.net/problem/2529
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class inEquality_sign {
	static int N;
	static String[] input;
	static boolean[] visit = new boolean[10];
	static LinkedList<String> list = new LinkedList<>();

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());// 등호 개수
		input = br.readLine().split(" ");// 등호 종류
		dfs(0, "");// 사전순으로 연산
		bw.write(String.valueOf(list.getLast()) + "\n");// 최대값은 가장 마지막에 연산
		bw.write(String.valueOf(list.getFirst()));// 최소값은 가장 먼저 연산
		bw.flush();
		br.close();
		bw.close();
	}

	static boolean check(String c, int num, String str) {// 등호가 성립하는 지 체크
		switch (c) {
		case "<":
			if (str.charAt(num - 1) < str.charAt(num))
				return true;
			break;
		case ">":
			if (str.charAt(num - 1) > str.charAt(num))
				return true;
			break;
		default:
			return false;
		}
		return false;
	}

	static void dfs(int depth, String temp) {// temp를 통해 숫자 조합
		if (depth == N + 1) { // 깊이는 등호의 개수 + 1
			for (int i = 1; i < N + 1; i++)
				if (!check(input[i - 1], i, temp))// 숫자 간의 등호가 성립하지 않으면 return함
					return;
			list.add(temp);// 등호가 성립 시 list에 추가함
			return;
		}
		for (int i = 0; i < 10; i++) {// 0~9까지 반복
			if (visit[i])// 숫자 중복 제거
				continue;
			visit[i] = true;
			dfs(depth + 1, temp + i);
			visit[i] = false;
		}

	}
}
