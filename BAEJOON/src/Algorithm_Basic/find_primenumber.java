package Algorithm_Basic;

//https://www.acmicpc.net/problem/1978
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class find_primenumber {
	static boolean[] arr = new boolean[1001];

	static void find_prime() {
		arr[0] = true;
		arr[1] = true;
		for (int i = 2; i < 1001; i++) {
			if (arr[i])
				continue;
			for (int j = 2 * i; j < 1001; j += i) { // 2의 배수를 지우고, 3의 배수를 지움(에라토스테네스의 체 참고)
				arr[j] = true;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		br.readLine();
		int num = 0;
		String[] input = br.readLine().split(" ");
		find_prime();
		for (String str : input) {
			if (!arr[Integer.parseInt(str)])
				num++;
		}
		bw.write(Integer.toString(num));
		bw.flush();
		bw.close();
		br.close();
	}

}
