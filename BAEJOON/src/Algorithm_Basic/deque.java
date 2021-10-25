package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class deque {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> de = new LinkedList<Integer>();
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cmd = st.nextToken();
			switch (cmd) {
			case "push_front":
				de.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				de.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if (de.isEmpty())
					sb.append("-1\n");
				else
					sb.append(de.pollFirst() + "\n");
				break;
			case "pop_back":
				if (de.isEmpty())
					sb.append("-1\n");
				else
					sb.append(de.pollLast() + "\n");
				break;
			case "size":
				sb.append(de.size() + "\n");
				break;
			case "empty":
				if (de.isEmpty())
					sb.append("1\n");
				else
					sb.append("0\n");
				break;
			case "front":
				if (de.isEmpty())
					sb.append("-1\n");
				else
					sb.append(de.peekFirst() + "\n");
				break;
			case "back":
				if (de.isEmpty())
					sb.append("-1\n");
				else
					sb.append(de.peekLast() + "\n");
				break;
			}
		}

		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}
}
