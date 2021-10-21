package Level_11;
//https://www.acmicpc.net/problem/7568
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev3 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][2];
		int[] result = new int[num];
		for (int i = 0; i < num; i++) {
			String str[] = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
		}
		for (int i = 0; i < num; i++) {
			int rank = 1;
			for (int j = 0; j < num; j++) {
				if (i == j)
					continue;
				else if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
					rank++;
			}
			bw.write(Integer.toString(rank) + " ");
		}
		bw.flush();

	}
}
