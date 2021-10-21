package Level_5;
//https://www.acmicpc.net/problem/2562
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev2 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = 0, count = 1, i = 0, counter = 1;
		max = Integer.parseInt(br.readLine());
		while (i < 8) {
			int num = Integer.parseInt(br.readLine());
			counter++;
			i++;
			if (num > max) {
				max = num;
				count = counter;
			}
			
		}
		bw.write(Integer.toString(max));
		bw.newLine();
		bw.write(Integer.toString(count));
		bw.flush();
	}
}
