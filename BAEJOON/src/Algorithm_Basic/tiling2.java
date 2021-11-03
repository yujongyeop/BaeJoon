package Algorithm_Basic;

//https://www.acmicpc.net/problem/11727
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class tiling2 {
	/* 풀이:
	 * N = 1 일 때 1, N = 2 일 떼 3, N = 3 일 때 5, N = 4 일 때 11가지의 경우의 수가 나온다
	 * 즉 N = (N-1) + (N-2)*2 라는 규칙성을 가진다
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int[] DP = new int[1001]; // or new int[input+2](+2:입력이 0일때 DP[2]에서 오류 없애기 위해)
		DP[1] = 1;
		DP[2] = 3;
		for (int i = 3; i <= input; i++) {
			DP[i] = (DP[i - 1] + (DP[i - 2] * 2)) % 10007;
		}
		bw.write(Integer.toString(DP[input]));
		bw.flush();
		bw.close();
		br.close();
	}

}
