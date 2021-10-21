package Level_12;

//https://www.acmicpc.net/problem/1181
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main_lev8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		String[] input = new String[num];
		for (int i = 0; i < num; i++) {
			input[i] = br.readLine();
		}
		Arrays.sort(input, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length())
					return s1.compareTo(s2);
				else
					return Integer.compare(s1.length(), s2.length());
			}
		});
		sb.append(input[0] + "\n");
		for (int i = 1; i < num; i++) {
			if (input[i - 1].equals(input[i]) == false)
				sb.append(input[i] + "\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
	}

}
