package Level_12;

//https://www.acmicpc.net/problem/18870
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_lev10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Integer, Integer> pos = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		int idx = 0;
		int num = Integer.parseInt(br.readLine());
		int[] input = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++)
			input[i] = Integer.parseInt(st.nextToken());
		int[] temp = input.clone();
		Arrays.sort(input);
		for (int i : input) {
			if (!pos.containsKey(i))
				pos.put(i, idx++);
		}
		for (int i : temp)
			sb.append(pos.get(i) + " ");
		bw.write(String.valueOf(sb));
		bw.flush();
	}

}