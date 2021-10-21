package Algorithm_Basic;

//https://www.acmicpc.net/problem/9012
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bracket {
	static StringBuilder sb = new StringBuilder();

	static void Check(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				count++;
			} else
				count--;
			if (count < 0) {
				sb.append("NO" + "\n");
				return;
			}
		}
		if (count == 0)
			sb.append("YES" + "\n");
		else
			sb.append("NO" + "\n");

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String input = br.readLine();
			Check(input);
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		br.close();
		bw.close();
	}

}
