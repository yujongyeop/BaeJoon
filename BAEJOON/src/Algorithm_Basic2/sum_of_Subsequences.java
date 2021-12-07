	package Algorithm_Basic2;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	
	public class sum_of_Subsequences {
		static int N, S, d;
		static int count = 0;
		static int[] arr;
		static boolean[] visit;
	
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String[] input = br.readLine().split(" ");
			N = Integer.parseInt(input[0]);
			S = Integer.parseInt(input[1]);
			arr = new int[N];
			visit = new boolean[N];
			input = br.readLine().split(" ");
			for (int i = 0; i < N; i++)
				arr[i] = Integer.parseInt(input[i]);
			for (d = 1; d <= N; d++)
				dfs(0, 0, 0);
			bw.write(count + "");
			bw.flush();
			bw.close();
			br.close();
		}
	
		static void dfs(int start, int depth, int sum) {
			if (depth == d) {
				if (sum == S)
					count++;
				return;
			}
			for (int i = start; i < N; i++) {
				if (visit[i])
					continue;
				visit[i] = true;
				sum += arr[i];
				dfs(i + 1, depth + 1, sum);
				sum -= arr[i];
				visit[i] = false;
			}
		}
	}