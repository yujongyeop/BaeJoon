package Level_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String result = "";
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < input[1].length(); j++)
				for (int k = 0; k < Integer.parseInt(input[0]); k++)
					result = result + (input[1].charAt(j));

			bw.write(result);
			bw.newLine();
		}
		bw.flush();
	}

}
