package Algorithm_Basic2;

//https://www.acmicpc.net/problem/1748
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_Continuation1 {
	/*
	 * num이 1,10,100,1000 등과 비교해서 작아질때까지 반봉한다. 만약 작지 않다면 해당 자릿수에 나오는 길이를 구해 ans에
	 * 더한다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int ans = 0;
		int count = 1;
		while (num >= count) {
			ans += (num - count + 1);
			count *= 10;
		}
		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
