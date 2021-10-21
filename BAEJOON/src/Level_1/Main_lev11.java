package Level_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		br.close();
		int result = 0;
		int i = 1;
		while (b > 0) {
			int cal = (b % 10) * a;
			result += (cal * i);
			bw.write(cal + "\n");
			b /= 10;
			i *= 10;
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}

}
