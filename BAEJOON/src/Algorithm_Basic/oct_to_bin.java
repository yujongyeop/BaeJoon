package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class oct_to_bin {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String oct = br.readLine();
		for (int i = 0; i < oct.length(); i++) {
			int num = oct.charAt(i) - '0';
			int sum = 0;
			sum += (num / 4) * 100;
			if (sum == 0 && i != 0)// 좀 더 소스를 잘 짤 수 있는 부분이라 추후에 수정 예정
				sb.append(0);
			num %= 4;
			sum += (num / 2) * 10;
			if (sum == 0 && i != 0)
				sb.append(0);
			num %= 2;
			sum += num;
			sb.append(sum);
		}
		bw.write(String.valueOf(sb));
		bw.close();
		br.close();
	}
}
