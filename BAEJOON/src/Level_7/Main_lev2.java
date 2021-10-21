package Level_7;

//https://www.acmicpc.net/problem/11720
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		int num = Integer.parseInt(br.readLine());
		String input = br.readLine();
		for (int i = 0; i < num; i++) {
			char str = input.charAt(0);
			sum = sum + (int) str - 48;
			input = input.substring(1);
		}
		bw.write(Integer.toString(sum));
		bw.flush();
	}

}
