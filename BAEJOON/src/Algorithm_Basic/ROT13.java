package Algorithm_Basic;

//https://www.acmicpc.net/problem/11655
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ROT13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				if (c + 13 > 'Z') {
					c = (char) ((c + 13) - 'Z' + 'A' - 1);
					sb.append(c);
				} else {
					c += 13;
					sb.append(c);
				}
			} else if (c >= 'a' && c <= 'z') {
				if (c + 13 > 'z') {
					c = (char) ((c + 13) - 'z' + 'a' - 1);
					sb.append(c);
				} else {
					c += 13;
					sb.append(c);
				}
			} else {
				sb.append(c);
			}
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
