package Algorithm_Basic;

// https://www.acmicpc.net/problem/10820
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class alphabet_num {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		int[] alphabet = new int[26];
		for (int i = 0; i < input.length(); i++) {
			int c = input.charAt(i) - 'a';// 문자는 반드시 소문자기 때문에 'a'를 빼주고 배열에 해당 문자가 인덱스 값을 증가시킴
			alphabet[c] += 1;
		}
		for (int i : alphabet)
			sb.append(i + " ");
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
