package Level_10;
//https://www.acmicpc.net/problem/10870
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		bw.write(Integer.toString(fibonacci(0, 1, input)));
		bw.flush();
	}

	static int fibonacci(int pre1, int pre2, int input) {
		int result = pre1 + pre2;
		if (input == 0)
			return 0;
		else if (input > 2) {
			pre1 = pre2;
			pre2 = result;
			input--;
			result = fibonacci(pre1, pre2, input);
		}
		return result;
	}

}