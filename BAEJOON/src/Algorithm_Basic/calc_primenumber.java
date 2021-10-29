package Algorithm_Basic;

//https://www.acmicpc.net/problem/1929
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class calc_primenumber {
	static StringBuilder sb = new StringBuilder();
	static boolean[] arr = new boolean[1000001];

	static void find_prime(int min, int target) {
		arr[0] = true;
		arr[1] = true;
		for (int i = 2; i <= target; i++) {
			if (arr[i])
				continue;
			for (int j = 2 * i; j <= target; j += i) { // 2의 배수를 지우고, 3의 배수를 지움(에라토스테네스의 체 참고)
				arr[j] = true;
			}
		}
		for (int i = min; i <= target; i++) {
			if (!arr[i])
				sb.append(i + "\n");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		find_prime(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
