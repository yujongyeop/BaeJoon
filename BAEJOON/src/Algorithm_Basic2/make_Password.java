package Algorithm_Basic2;

//https://www.acmicpc.net/problem/1759
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class make_Password {
	static int L, C, numConsonant, numVowel;// L, C, 모음개수, 자음개수
	static boolean[] visit;
	static String[] input, arr;
	static StringBuilder sb = new StringBuilder();
	static String consonant = "aeiou";// 모음 문자열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] userInput = br.readLine().split(" ");
		L = Integer.parseInt(userInput[0]);//암호 길이
		C = Integer.parseInt(userInput[1]);//암호 조합에 사용 가능한 문제 개수

		visit = new boolean[C];// 방문 여부 배열
		arr = new String[L];// 문자 담는 변수

		input = br.readLine().split(" ");// 사용자 입력 배열
		Arrays.sort(input);// 암호조합은 사전순이기 때문에 정렬을 해줌
		dfs(0, 0);

		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int start, int depth) {
		if (depth == L) {
			if (numConsonant >= 1 && numVowel >= 2) {// 모음 개수가 1이상, 자음 개수가 2이상일 때만 연산
				for (String m : arr)
					sb.append(m);
				sb.append("\n");
			}
			return;
		}
		for (int i = start; i < C; i++) {
			if (visit[i])
				continue;
			if (consonant.contains(input[i])) {// input[i]가 모음인 경우
				numConsonant++;//모음 개수 1을 추가한다.
				arr[depth] = input[i];
				visit[i] = true;
				dfs(i + 1, depth + 1);
				visit[i] = false;
				numConsonant--;//input[i]에 대한 dfs가 끝났으므로 1 감소 시켜준다

			} else {// input[i]가 자음인 경우
				numVowel++;// 모음인 경우와 동일
				arr[depth] = input[i];
				visit[i] = true;
				dfs(i + 1, depth + 1);
				visit[i] = false;
				numVowel--;
			}
		}
	}
}
