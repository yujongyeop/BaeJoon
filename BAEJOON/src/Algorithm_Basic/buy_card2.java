package Algorithm_Basic;

//https://www.acmicpc.net/problem/16194
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class buy_card2 {
	/*
	 * 기본적인 방식은 카드 구매하기와 비슷하지만 카드 구매하기는 최대값을 구하는 반면
	 * 카드 구매하기2는 최소값을 구하는 방식이다
	 * 배열은 초기화할 때 0으로 초기화해서 최대값 구할 때는 상관없지만 최소값 구할때는 문제가 발생한다
	 * 그래서 카드수(i)가 늘어날 때마다 DP[i]를 price[i]로 초기화 해준다.
	 * 그후 max함수를 min함수로 바꾸면 된다.
	 */
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
			DP[i] = price[i];// DP[i]를 price[i]로 초기화
			for (int j = 1; j <= i; j++) {
				DP[i] = Math.min(DP[i], DP[i - j] + price[j]);
			}
		}
		bw.write(Integer.toString(DP[num]));
		bw.flush();
		bw.close();
		br.close();
	}

}
