package Level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[42];
		int count = 0;
		for (int i = 0; i < 42; i++)
			arr[i] = 0;
		for (int i = 0; i < 10; i++) {
			int input = Integer.parseInt(br.readLine());
			input = input % 42;
			arr[input]++;
		}
		for (int j = 0; j < 42; j++) {
			if (arr[j] != 0)
				count++;
		}
		bw.write(Integer.toString(count));
		bw.flush();
	}

}
