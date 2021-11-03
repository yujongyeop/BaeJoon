package Algorithm_Basic;

//https://www.acmicpc.net/problem/11052
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class buy_card {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] price = new int[num + 2];
		for (int i = 1; i <= num; i++) {
			price[i] = Integer.parseInt(str[i - 1]);
		}
		int[] DP = new int[num + 2];
		DP[1] = price[1];
		for (int i = 1; i <= num; i++) {// i는 카드 개수
			for (int j = 1; j <= i; j++) {
				DP[i] = Math.max(DP[i], DP[i - j] + price[j]);// DP[i-j] + price[j] 를 통해 모든 경우의 수를 탐색하며 max로 비교하여 큰값 저장
				/*
				 * Ex) i = 4, j = 2 일 때 DP[2](두개를 샀을 때 최대값)와 price[2](두개 묶음을 샀을 때 가격)을 더하여 기존 DP[4]와 비교
				 */
			}
		}
		bw.write(Integer.toString(DP[num]));
		bw.flush();
		bw.close();
		br.close();
	}

}
