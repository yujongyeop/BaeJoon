package Algorithm_Basic;

//https://www.acmicpc.net/problem/10809
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class alphabet_find {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int[] alphabet = new int[26];
		for (int i = 0; i < 26; i++)
			alphabet[i] = -1;
		String input = br.readLine();
		for (int i = 0; i < input.length(); i++) {
			int c = input.charAt(i) - 'a';
			if (alphabet[c] == -1)
				alphabet[c] = i;
		}

		for (int i : alphabet)
			sb.append(i + " ");
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
