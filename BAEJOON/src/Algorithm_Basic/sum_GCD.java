package Algorithm_Basic;

//https://www.acmicpc.net/problem/9613
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class sum_GCD {
	static int gcd(int a, int b) {// a를 b로 나눴을 때 나머지가 0이 될 때까지 재귀호출(나머지가 0일 경우의 b값이 최대공약수이다
		return a % b != 0 ? gcd(b, a % b) : b;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			long sum = 0;
			String[] input = br.readLine().split(" ");
			for (int j = 1; j < Integer.parseInt(input[0]) + 1; j++) {
				for (int k = j + 1; k < Integer.parseInt(input[0]) + 1; k++)
					sum += gcd(Integer.parseInt(input[j]), Integer.parseInt(input[k]));
			}
			sb.append(sum + "\n");
		}
		bw.write(String.valueOf(sb));
		bw.close();
		br.close();
	}
}
