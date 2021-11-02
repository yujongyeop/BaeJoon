package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prime_factorization {

	static void find_prime(int max, boolean[] arr) {// 소수를 구하는 함수
		arr[0] = true;
		arr[1] = true;
		for (int i = 2; i < max + 1; i++) {
			if (arr[i])
				continue;
			for (int j = 2 * i; j < max + 1; j += i) { // 2의 배수를 지우고, 3의 배수를 지움(에라토스테네스의 체 참고)
				arr[j] = true;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int input = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[input + 1];
		find_prime(input, arr);
		int p_num = 2;// 소수 담는 변수
		while (input > 1) {
			if (arr[p_num]) {// 소수가 아니면 p_num 증가 후 continue
				p_num++;
				continue;
			} else if (input % p_num == 0) {// 동일 소수로 여러번 나눌 수도 있어 p_num을 증가 시키지 않음
				sb.append(p_num + "\n");
				input /= p_num;
			} else
				p_num++;
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
