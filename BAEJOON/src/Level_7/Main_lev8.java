package Level_7;
//https://www.acmicpc.net/problem/5622
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = 0;
		String input = br.readLine();
		for (int i = 0; i < input.length(); i++) {
			int num = input.charAt(i) - 65;
			if (num < 3)
				result += 3;
			else if (num < 6)
				result += 4;
			else if (num < 9)
				result += 5;
			else if (num < 12)
				result += 6;
			else if (num < 15)
				result += 7;
			else if (num < 19)
				result += 8;
			else if (num < 22)
				result += 9;
			else
				result += 10;
		}
		bw.write(Integer.toString(result));
		bw.flush();
	}

}
