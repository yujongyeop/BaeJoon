package Algorithm_Basic;

//https://www.acmicpc.net/problem/10845
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class queue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<Integer>();
		int rear = 0;
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			switch (cmd) {
			case "push": {
				rear = Integer.parseInt(st.nextToken());
				que.offer(rear);
				break;
			}
			case "pop": {
				if (que.isEmpty())
					sb.append("-1\n");
				else
					sb.append(que.poll() + "\n");
				break;
			}
			case "size": {
				sb.append(que.size() + "\n");
				break;
			}
			case "empty": {
				if (que.isEmpty())
					sb.append("1\n");
				else
					sb.append("0\n");
				break;
			}
			case "front": {
				if (que.isEmpty())
					sb.append("-1\n");
				else
					sb.append(que.peek() + "\n");
				break;
			}
			case "back": {
				if (que.isEmpty())
					sb.append("-1\n");
				else
					sb.append(rear + "\n");
				break;
			}
			}
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
