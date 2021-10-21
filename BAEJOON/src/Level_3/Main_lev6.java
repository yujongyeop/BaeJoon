package Level_3;

//https://www.acmicpc.net/problem/2742
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int i = 0;
		for( ; num > i ; num--) {
			bw.write(Integer.toString(num));
			bw.newLine();
		}
		bw.flush();
	}
}