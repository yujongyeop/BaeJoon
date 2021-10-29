package Algorithm_Basic;

//https://www.acmicpc.net/problem/1934
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LCM {

	static int gcd(int a, int b) {// a를 b로 나눴을 때 나머지가 0이 될 때까지 재귀호출(나머지가 0일 경우의 b값이 최대공약수이다
		return a % b != 0 ? gcd(b, a % b) : b;
	}

	static int lcm(int a, int b) {// a(입력값 두 수를 곱한 것)을 최대공약수로 나누면 최소공배수가 나옴
		return a / b;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int L = lcm(a * b, gcd(a, b)); // 최소공약수
			sb.append(L + "\n");
			bw.write(String.valueOf(sb));
			sb.setLength(0);
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
