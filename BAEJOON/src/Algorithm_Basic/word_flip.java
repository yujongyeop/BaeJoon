package Algorithm_Basic;

//https://www.acmicpc.net/problem/9093
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class word_flip {
	static StringBuilder sb = new StringBuilder();

	static void Reverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--)
			sb.append(str.charAt(i) + "");
		sb.append(" ");
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String[] input = br.readLine().split(" ");
			for (String str : input)
				Reverse(str);
			sb.append("\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		br.close();
		bw.close();
	}

}
