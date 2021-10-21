package Level_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		if ((Integer.parseInt(input[2]) - Integer.parseInt(input[1])) < 0
				|| (Integer.parseInt(input[2]) - Integer.parseInt(input[1])) == 0)
			bw.write("-1");
		else {
			bw.write(Integer.toString(
					(Integer.parseInt(input[0]) / (Integer.parseInt(input[2]) - Integer.parseInt(input[1])) + 1)));
		}
		bw.flush();
	}

}
