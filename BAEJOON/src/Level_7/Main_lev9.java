package Level_7;
//https://www.acmicpc.net/problem/2941
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (i + 1 >= input.length()) {
				count++;
				break;
			}
			int num = input.charAt(i);
			if (num == 99 || num == 115 || num == 122) {// c s z 시작일 경우
				if (input.charAt(i + 1) == 61 || input.charAt(i + 1) == 45) {
					count++;
					i++;
				} else
					count++;
			} else if (num == 108 || num == 110) {// l n 시작일 겅우
				if (input.charAt(i + 1) == 106) {
					count++;
					i++;
				} else
					count++;

			} else if (num == 100) { // d 시작일 경우
				if (input.charAt(i + 1) == 122) {// 다음 알파벳이 z인지 확인
					if ((i + 2) < input.length() && input.charAt(i + 2) == 61) {// 다다음 알파벳이 =인지 확인 및 길이 초과 확인
						count++;
						i += 2;
					} else
						count++;

				} else if (input.charAt(i + 1) == 45) {
					count++;
					i++;
				} else
					count++;
			} else
				count++;
//			c=99 d=100 l=108 n=110 s=115 z=122
		}
		bw.write(Integer.toString(count));
		bw.flush();
	}
}
