package Algorithm_Basic;

//https://www.acmicpc.net/problem/1212
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class oct_to_bin {
	static StringBuilder sb = new StringBuilder();

	static void to_binary(int num, int div_num) {
		if (div_num > 0) {
			if (num / div_num == 0 && sb.length() != 0) {
				sb.append(0);
			} else if (num / div_num != 0) {
				sb.append(1);
			}
			num %= div_num;
			div_num /= 2;
			to_binary(num, div_num);// 재귀 호출
		} else if (num == 0 && sb.length() == 0) {
			sb.append(0);
		} else
			return;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String oct = br.readLine();
		for (int i = 0; i < oct.length(); i++) {
			int num = oct.charAt(i) - '0';
			to_binary(num, 4);
		}
		bw.write(String.valueOf(sb));
		bw.close();
		br.close();
	}
}
