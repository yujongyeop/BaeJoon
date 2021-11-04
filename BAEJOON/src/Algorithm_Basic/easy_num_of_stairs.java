package Algorithm_Basic;

//https://www.acmicpc.net/problem/10844
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class easy_num_of_stairs {
	/*
	 * 이 문제는 1,2,3 더하기 5와 매우 유사한 문제이다.
	 * n: 자리수, i: 끝나는 숫자
	 * 이 문제의 점화식은 DP[n][i] = DP[n-1][i-1] + DP[n-1][i+1]이다.
	 * 이유는 숫자가 연속되어야 하고 이 때 DP[n][i]는 DP[n-1][i-1]과 DP[n-1][i+1]에 i를 붙인거와 동일하기 때문이다.
	 * 예를 들어 DP[2][2]는 "12","32"두 개로 이루어져 있는데 이는 DP[1][1]의 "1"과 DP[1][3]의 "3"에 각각 2를 붙여준 것과 동일하다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int[][] DP = new int[101][10];
		long result = 0;
		for (int i = 1; i < 10; i++)
			DP[1][i] = 1;
		for (int i = 2; i <= input; i++) {
			DP[i][0] = DP[i - 1][1];// 0으로 끝나는 수의 경우 -1에 해당하는 인덱스가 없으므로 i-1의 1값이 i의 0이 된다.
			DP[i][9] = DP[i - 1][8];// 9도 마찬가지로 10에 해당하는 인덱스가 없으므로 i-1의 8값을 넣어준다.(이부분은 DP초기화 시 DP[101][11]로 초기화 해주면 안써도 되는 부분이긴하다.)
			for (int j = 1; j < 9; j++) {
				DP[i][j] = (DP[i - 1][j - 1] + DP[i - 1][j + 1])%1000000000;
			}
		}
		for (int i = 0; i < 10; i++)
			result += DP[input][i];
		bw.write(Long.toString(result%1000000000));
		bw.flush();
		bw.close();
		br.close();
	}

}
