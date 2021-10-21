package Level_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_lev7 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		Integer[][] pos = new Integer[num][2];
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			pos[i][1] = Integer.parseInt(st.nextToken());
			pos[i][0] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(pos, (o1, o2) -> {
			if (o1[0].equals(o2[0]))// == 사용시 틀렸다 뜸
				return Integer.compare(o1[1], o2[1]);
			else
				return Integer.compare(o1[0], o2[0]);
		});

		for (int i = 0; i < num; i++)
			bw.write(pos[i][1] + " " + pos[i][0] + "\n");
		bw.flush();
	}

}
