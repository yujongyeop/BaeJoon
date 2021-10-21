package Level_8;
//https://www.acmicpc.net/problem/2775
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			int sum = 0;
			int floor = Integer.parseInt(br.readLine());
			int ho = Integer.parseInt(br.readLine());
			int[][] table = new int[floor][ho];
			for (int j = 0; j < ho; j++)
				table[0][j] = j+1;
			if (floor == 0) {
				bw.write(Integer.toString(ho));
			} else {
				for (int x = 1; x < floor; x++) {
					table[x][0] = 1;
					for (int y = 0; y < ho; y++) {
						for (int z = 0; z <= y; z++) {
							sum += table[x - 1][z];
						}
						table[x][y] = sum;
						sum =0;
					}
				}
				int result = 0;
				for (int j = 0; j < ho; j++)
					result += table[floor - 1][j];
				bw.write(Integer.toString(result));
				bw.newLine();
			}
		}
		bw.flush();
	}

}
