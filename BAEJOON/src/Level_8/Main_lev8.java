package Level_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int low = 0, high = 0, plus = 0, sum = 0, low_len = 0, high_len = 0;
		String input[] = br.readLine().split(" ");
		if (input[0].length() > input[1].length()) {
			low = 1;
			high = 0;
			low_len = input[1].length();
			high_len = input[0].length();
		} else {
			low = 0;
			high = 1;
			low_len = input[0].length();
			high_len = input[1].length();
		}
		String[] result = new String[input[high].length()];
		for (int i = 0; i < input[high].length(); i++) {
			if (i >= input[low].length()) {
				if (plus == 1) {
					int a = input[high].charAt(high_len - i - 1) - 48;
					sum = a + 1;
					if (sum > 9) {
						sum -= 10;
						result[i] = Integer.toString(sum);
						plus = 1;
					} else {
						plus = 0;
						result[i] = Integer.toString(sum);
					}
				} else {
					result[i] = Integer.toString((int) input[high].charAt(high_len - i - 1) - 48);
				}
			} else if (i < input[low].length()) {
				int a = input[high].charAt(high_len - i - 1) - 48;
				int b = input[low].charAt(low_len - i - 1) - 48;
				if (plus == 1) {
					sum = a + b + 1;
					if (sum > 9) {
						sum -= 10;
						result[i] = Integer.toString(sum);
						plus = 1;
					} else {
						result[i] = Integer.toString(sum);
						plus = 0;
					}
				} else {
					sum = a + b;
					if (sum > 9) {
						sum -= 10;
						result[i] = Integer.toString(sum);
						plus = 1;
					} else {
						result[i] = Integer.toString(sum);
						plus = 0;
					}
				}
			}
			sum = 0;
		}
		if (plus == 1)
			bw.write("1");
		for (int i = result.length - 1; i > -1; i--) {
			bw.write(result[i]);
		}
		bw.flush();
	}

}
