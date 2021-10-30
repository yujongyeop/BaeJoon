package Algorithm_Basic;

//https://www.acmicpc.net/problem/6588
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class goldbach_conjecture {
	static boolean[] arr = new boolean[1000001];

	static void find_prime() {
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
		int input;
		find_prime();
		while ((input = Integer.parseInt(br.readLine())) != 0) {
			int check = 0;
			int pre = 0, sec = -1;
			for (int i = 3; i <= (input / 2) + 1; i += 2) {
				if (!arr[i] && !arr[input - i]) {
					pre = i;
					sec = input - i;
					check = 1;
					break;
				}

			}
			if (check == 0)
				sb.append("Goldbach's conjecture is wrong.\n");
			else
				sb.append(input + " = " + pre + " + " + sec + "\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
