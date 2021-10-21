package Level_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev4 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int count = 0;

	static void hanoi(int num, int from, int to, int sub) throws IOException {
		if (num == 1) {
			bw.write(from + " " + to);
			bw.newLine();
			count++;
			return;
		} else {
			hanoi(num - 1, from, sub, to);
			bw.write(from + " " + to);
			bw.newLine();
			count++;
			hanoi(num - 1, sub, to, from);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		bw.write(Integer.toString((int) (Math.pow(2, input) - 1)));
		bw.newLine();
		hanoi(input, 1, 3, 2);
		bw.flush();
	}

}
