package Algorithm_Basic;

//https://www.acmicpc.net/problem/17103
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class goldbachs_partion {
	static boolean[] arr = new boolean[1000001];

	static void find_prime() {// 소수 구하는 부분
		arr[0] = true;
		arr[1] = true;
		for (int i = 2; i < 1000001; i++) {
			if (arr[i])
				continue;
			for (int j = 2 * i; j < 1000001; j += i) { // 2의 배수를 지우고, 3의 배수를 지움(에라토스테네스의 체 참고)
				arr[j] = true;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		find_prime();
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			int input = Integer.parseInt(br.readLine());
			int count = 0;
			for (int j = 2; j < (input / 2) + 1; j += 1) {
				/*
				 * 골드바흐의 추측과 다른 문제입니다 골드바흐의 추측은 두 홀 수 소수의 합이 조건이였지만 골드바흐 파티션은 두 소수의 합입니다. 반례로는 4
				 * 입력 시 정답은 1입니다.(계시판을 보니 0으로 나와서 틀리는 경우가 많았습니다)
				 */
				if (!arr[j] && !arr[input - j]) {
					count++;
				}
			}
			sb.append(count + "\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
