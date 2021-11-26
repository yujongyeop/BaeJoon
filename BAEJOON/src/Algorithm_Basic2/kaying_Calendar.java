package Algorithm_Basic2;

//https://www.acmicpc.net/problem/6064
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class kaying_Calendar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());// 반복 횟수
		for (int i = 0; i < num; i++) {
			String[] str = br.readLine().split(" ");
			int M = Integer.parseInt(str[0]);
			int N = Integer.parseInt(str[1]);
			int x = Integer.parseInt(str[2]);
			int y = Integer.parseInt(str[3]);
			int ans = x;// 년도 구하는 변수
			int LCM = lcm(M * N, gcd(M, N));// M과 N의 최소공배수
			while (ans <= LCM) {// ans는 M과 N의 최송공배수보다 클 수 없음
				int temp_X = (ans % M) == 0 ? M : (ans % M); // ans%M을 했을 때 ans가 M의 배수이면 0이 나오기 때문에 조건문으로 표현했다
				int temp_Y = (ans % N) == 0 ? N : (ans % N); // 위와 동일
				if ((temp_X == x) && (temp_Y == y))
					break;
				ans += M;
			}
			if (ans > LCM)// 최소 공배수보다 큰 경우는 해가 없는 경우이다
				bw.write("-1\n");
			else
				bw.write(ans + "\n");

		}
		bw.flush();
		bw.close();
		br.close();
	}

	static int gcd(int a, int b) {// a를 b로 나눴을 때 나머지가 0이 될 때까지 재귀호출(나머지가 0일 경우의 b값이 최대공약수이다
		return a % b != 0 ? gcd(b, a % b) : b;
	}

	static int lcm(int a, int b) {// a(입력값 두 수를 곱한 것)을 최대공약수로 나누면 최소공배수가 나옴
		return a / b;
	}
}
