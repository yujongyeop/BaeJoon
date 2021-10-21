package Level_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[26];
		int check = 0, count = 0;
		for (int k = 0; k < 26; k++)
			arr[k] = 0;

		for (int i = 0; i < num; i++) {
			String input = br.readLine();
			String compare = input;
			for (int j = 0; j < input.length(); j++) {
				compare = compare.substring(1);
				if(compare.indexOf(input.charAt(j)) > 0)
					check++;
			}
			if(check == 0)
				count++;
			check = 0;

		}

		bw.write(Integer.toString(count));
		bw.flush();
	}

}
