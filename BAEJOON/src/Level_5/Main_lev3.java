package Level_5;
//https://www.acmicpc.net/problem/2577
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev3 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int result = a * b * c;
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		while (result != 0) {
			int num = result % 10;
			arr[num]++;
			result = result / 10;
		}
		for (int i = 0; i < 10; i++) {
			bw.write(Integer.toString(arr[i]));
			bw.newLine();
		}
		bw.flush();
	}
}
