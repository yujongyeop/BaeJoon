package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class combinations_of_zeros {
	static int check_five(int num) {
		int count = 0;
		for (long i = 5; i <= num; i *= 5) {// i를 int로 할 경우 int의 구현가능 최대값을 넘을 경우가 생겨 /by Zero 오류가 난다.
			count += (num / i);
		}
		return count;
	}

	static int check_two(int num) {
		int count = 0;
		for (long i = 2; i <= num; i *= 2) {
			count += (num / i);
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		/*
		 * 조합에서 0의 개수는 N!의 2의 개수를 M!,(N-M)! 의 각각의 2의 개수를 빼주고 N!의 5의 개수를 M!,(N-M)!의 각각의
		 * 5의 개수를 빼준 후 둘 중 더 작은 값을 구한다.
		 */
		int num_five = check_five(N) - check_five(M) - check_five(N - M);
		int num_two = check_two(N) - check_two(M) - check_two(N - M);
		int result = num_two > num_five ? num_five : num_two;
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}

}
