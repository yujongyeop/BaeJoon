package Level_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int count = 0;
		if (input < 100) {
			count = input;
		} else {
			count = fun(input);
		}
		bw.write(Integer.toString(count));
		bw.flush();
	}

	static int fun(int input) {
		int count = 0;
		for (int i = 100; i <= input; i++) {
			int num = i;
			int one = num % 10;
			num /= 10;
			int ten = num % 10;
			int hun = num / 10;
			if (ten - hun == one - ten) {
				count++;
			}

		}
		return count + 99;
	}
}
