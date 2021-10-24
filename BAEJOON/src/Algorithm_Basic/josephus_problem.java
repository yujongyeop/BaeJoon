package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class josephus_problem {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int cycle = Integer.parseInt(st.nextToken());
		Queue<Integer> que = new LinkedList<Integer>();
		for (int i = 1; i < num + 1; i++)
			que.add(i);
		while (que.size() != 1) {
			for (int i = 0; i < cycle - 1; i++) {
				que.offer(que.poll());
			}
			sb.append(que.poll() + ", ");
		}
		sb.append(que.poll() + ">");
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
