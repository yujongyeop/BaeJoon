package Level_12;
//https://www.acmicpc.net/problem/10814
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_lev9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String[][] table = new String[num][2];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			table[i][0] = st.nextToken();
			table[i][1] = st.nextToken();
		}

		Arrays.sort(table, new Comparator<String[]>() {
			public int compare(String[] s1, String[] s2) {
				if (s1[0].equals(s2[0]))
					return 0;
				else
					return Integer.compare(Integer.parseInt(s1[0]), Integer.parseInt(s2[0]));
			}
		});

		for (String[] arr : table) {
			sb.append(arr[0] + " " + arr[1] + "\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
	}

}
