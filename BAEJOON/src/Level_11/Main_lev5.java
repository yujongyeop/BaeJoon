package Level_11;
//https://www.acmicpc.net/problem/1436
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int count = 0;
		int result = 0;
		for (int i = 666;; i++) {
			String num = Integer.toString(i);
			for (int j = 1; j < num.length() - 1; j++) {
				if (num.charAt(j - 1) == 54 && num.charAt(j - 1) == num.charAt(j)
						&& num.charAt(j - 1) == num.charAt(j + 1)) {
					count++;
					result = Integer.parseInt(num);
					break;
				}
			}
			if (count == input)
				break;

		}
		bw.write(Integer.toString(result));
		bw.flush();

	}

}
