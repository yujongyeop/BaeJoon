package Level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_lev7 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer str;
		for (int i = 0; i < num ; i++) {
			int count = 0, sum = 0;
			double final_avg = 0.0;
			str = new StringTokenizer(br.readLine());
			int student_num = Integer.parseInt(str.nextToken());
			double avg = 0;
			int[] score = new int[student_num];
			for (int j = 0; j < student_num; j++) {
				score[j] = Integer.parseInt(str.nextToken());
				sum = sum + score[j];
			}
			avg = sum / student_num;
			for (int k = 0; k < score.length; k++) {
				if (score[k] > avg)
					count++;
			}
			final_avg = ((count * 100.0) / (student_num * 100)) * 100;
			bw.write(String.format("%.3f", final_avg)+"%");
			bw.newLine();

		}
		bw.flush();
	}
}
