package Algorithm_Basic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ABCDE {
	static ArrayList<Integer>[] list;
	static boolean[] visit;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		list = new ArrayList[N];
		visit = new boolean[N];

		for (int i = 0; i < N; i++)
			list[i] = new ArrayList<Integer>();

		for (int i = 0; i < M; i++) {
			input = br.readLine().split(" ");
			int n1 = Integer.parseInt(input[0]);
			int n2 = Integer.parseInt(input[1]);
			list[n1].add(n2);
			list[n2].add(n1);
		}
		for (int i = 0; i < N; i++) {
			dfs(i, 0);
		}
		bw.write("0");
		bw.flush();
		bw.close();
		br.close();

	}

	static void dfs(int x, int depth) throws IOException {
		if (depth == 4) {
			bw.write("1");
			bw.flush();
			bw.close();
			br.close();
			System.exit(0);
		}
		for (int i = 0; i < list[x].size(); i++) {
			int temp = list[x].get(i);
			if (!visit[temp]) {
				visit[x] = true;
				dfs(temp, depth + 1);
				visit[x] = false;
			}
		}
	}

}
