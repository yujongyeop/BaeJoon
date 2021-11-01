package Algorithm_Basic;

//https://www.acmicpc.net/problem/17087
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class hide_and_seek6 {
	static int gcd(int a, int b) {// a를 b로 나눴을 때 나머지가 0이 될 때까지 재귀호출(나머지가 0일 경우의 b값이 최대공약수이다
		return a % b != 0 ? gcd(b, a % b) : b;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		String[] pos = br.readLine().split(" ");
		int num = Integer.parseInt(input[0]);
		int[] x = new int[num];
		int S = Integer.parseInt(input[1]);
		for (int i = 0; i < num; i++)
			x[i] = Math.abs(Integer.parseInt(pos[i]) - S);
		int ans = x[0];
		for (int i = 1; i < num; i++) {
			ans = gcd(ans, x[i]);// 가장 작은 수와 최소 공배수를 구하고 그 최소 공배수를 ans에 저장
			// ex) gcd(a,b,c) = gcd(gcd(a,b),c)
		}
		bw.write(Integer.toString(ans));
		bw.flush();
		bw.close();
		br.close();
	}

}
