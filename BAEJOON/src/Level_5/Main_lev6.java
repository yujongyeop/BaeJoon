package Level_5;

//https://www.acmicpc.net/problem/8958
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev6 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int check = 1, score = 0;
		int num = Integer.parseInt(br.readLine());
		String arr[] = new String[num];
		for (int i = 0; i < num; i++) {
			arr[i] = br.readLine();
		}
		for (int i = 0; i < num; i++) {
			String question = arr[i];
			for (int j = 0; j < arr[i].length(); j++) {
				if (question.startsWith("O") == true) {
					question = question.substring(1);
					score = check + score;
					check++;
				} else {
					question = question.substring(1);
					check = 1;
				}
			}
			bw.write(Integer.toString(score));
			bw.newLine();
			score = 0;
			check = 1;
		}
		bw.flush();
	}
}
