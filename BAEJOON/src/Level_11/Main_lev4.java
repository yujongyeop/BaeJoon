package Level_11;
//https://www.acmicpc.net/problem/1018
// 미완
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev4 {
	static String BW[][] = { { "B", "W", "B", "W", "B", "W", "B", "W" }, { "W", "B", "W", "B", "W", "B", "W", "B" },
			{ "B", "W", "B", "W", "B", "W", "B", "W" }, { "W", "B", "W", "B", "W", "B", "W", "B" },
			{ "B", "W", "B", "W", "B", "W", "B", "W" }, { "W", "B", "W", "B", "W", "B", "W", "B" },
			{ "B", "W", "B", "W", "B", "W", "B", "W" }, { "W", "B", "W", "B", "W", "B", "W", "B" } };
	static String WB[][] = { { "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "W", "B", "W", "B", "W" },
			{ "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "W", "B", "W", "B", "W" },
			{ "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "W", "B", "W", "B", "W" },
			{ "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "W", "B", "W", "B", "W" } };

	static int BW_check(String table[][], int x, int y) {
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (table[x + i][y + j] != BW[i][j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	static int WB_check(String table[][], int x, int y) {
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (table[x + i][y + j] != WB[i][j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input[] = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		int min = 64;
		String table[][] = new String[x + 1][y + 1];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				int in = br.read();
				if (in == 13) {// 개행
					in = br.read();
					in = br.read();
				}
				if (in == 66)// B
					table[i][j] = "B";
				else if (in == 87)// W
					table[i][j] = "W";
			}
		}
		for (int i = 0; i < x - 7; i++) {
			for (int j = 0; j < y - 7; j++) {
				if (min > Math.min(WB_check(table, i, j), BW_check(table, i, j)))
					min = Math.min(WB_check(table, i, j), BW_check(table, i, j));

			}
		}
		bw.write(Integer.toString(min));
		bw.flush();

	}

}
