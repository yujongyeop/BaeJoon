package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10828
public class stack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String input = st.nextToken();
			if (input.equals("push"))
				stack.push(Integer.parseInt(st.nextToken()));
			else if (input.equals("pop"))
				bw.write((stack.empty() ? "-1" : stack.pop()) + "\n");
			else if (input.equals("size"))
				bw.write(stack.size() + "\n");
			else if (input.equals("empty"))
				bw.write((stack.empty() ? "1" : "0") + "\n");
			else if (input.equals("top"))
				bw.write((stack.empty() ? "-1" : stack.peek()) + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
