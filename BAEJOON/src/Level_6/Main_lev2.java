package Level_6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main_lev2 {
	static int[] arr = new int[10001];

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 1; i < 10001; i++) {
			arr[i] = 1;
		}
		for (int i = 1; i < 10000; i++) {
			loop(i);
		}
		for (int i = 1; i < 10000; i++) {
			if (arr[i] == 1) {
				bw.write(Integer.toString(i));
				bw.newLine();
			}
		}
		bw.flush();
	}

	static void loop(int a) {
		int num = a;
		while (num != 0) {
			a = a + (num % 10);
			num /= 10;
		}
		if (a < 10000)
			arr[a] = 0;
	}
}
