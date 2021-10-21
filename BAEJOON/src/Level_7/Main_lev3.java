package Level_7;

//https://www.acmicpc.net/problem/10809
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] alpha = new int[26];
		for (int i = 0; i < 26; i++)
			alpha[i] = -1;
		String input = br.readLine();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int num = (int) ch - 97;
			if (i > alpha[num])
				if (alpha[num] == -1)
					alpha[num] = i;
		}
		for (int i = 0; i < 26; i++)
			bw.write(Integer.toString(alpha[i]) + " ");
		bw.flush();
	}
}