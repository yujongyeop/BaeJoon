package Level_10;
//https://www.acmicpc.net/problem/2447

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static void star(int i, int j, int num) throws IOException {
		if ((i / num) % 3 == 1 && (j / num) % 3 == 1) {
			bw.write(" ");
		} else {
			if (num / 3 == 0) {
				bw.write("*");
			} else {
				star(i, j, num / 3);
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		int input = Integer.parseInt(br.readLine());
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				star(i, j, input);
			}
			bw.newLine();
		}
		bw.flush();
	}
}