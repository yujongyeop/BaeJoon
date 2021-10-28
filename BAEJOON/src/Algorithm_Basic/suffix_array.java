package Algorithm_Basic;

//https://www.acmicpc.net/problem/11656
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class suffix_array {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		int num = input.length();
		String[] suffix = new String[num];
		for (int i = 0; i < num; i++) {
			suffix[i] = input;
			input = input.substring(1);
		}
		Arrays.sort(suffix);
		for (String str : suffix)
			sb.append(str + "\n");
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
