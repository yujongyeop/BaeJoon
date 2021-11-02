package Algorithm_Basic;

//https://www.acmicpc.net/problem/11005
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class notation_convert2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] input = br.readLine().split(" ");
		int num = Integer.parseInt(input[0]);
		int notation = Integer.parseInt(input[1]);
		while (num > 0) {
			int n = num % notation;
			if (n > 9) {// 10 이상일때 알파벳으로 변환하는 부분
				n -= 10;
				n += 'A';
				sb.append((char) n);
			} else
				sb.append(n);
			num /= notation;
		}
		sb.reverse();
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
