package Level_11;
//https://www.acmicpc.net/problem/2231
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		int input = Integer.parseInt(br.readLine());
		for (int i = 0; i < input; i++) {
			sum = i;
			if (i > 9) {
				for (int j = i; j != 0;) {
					sum += (j % 10);
					j /= 10;
				}
			} else {
				sum += sum;
			}
			if (sum == input) {
				bw.write(Integer.toString(i));
				break;
			}
		}
		if (sum != input)
			bw.write("0");
		bw.flush();
	}
}
