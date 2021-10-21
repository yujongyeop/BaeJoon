package Level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_lev1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Integer.parseInt(br.readLine()); //StringTokenizer사용시 필요없는데 입력값때문에 씀
		int val = 0;
		int min = 1000000;
		int max = -1000000;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			if (min > val)
				min = val;
			if (max < val)
				max = val;
		}
		bw.write(Integer.toString(min) + " " + Integer.toString(max));
		bw.flush();
	}

}
