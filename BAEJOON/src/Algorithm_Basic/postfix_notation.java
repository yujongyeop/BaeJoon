package Algorithm_Basic;

//https://www.acmicpc.net/problem/1918
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class postfix_notation {
	static StringBuilder sb = new StringBuilder();
	static Stack<Character> stack = new Stack<Character>();

	static int priority(char c) {
		if (c == '(')
			return 0;
		else if (c == '+' || c == '-')
			return 1;
		else
			return 2;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String formula = br.readLine();
		for (int i = 0; i < formula.length(); i++) {
			char c = formula.charAt(i);
			if (c >= 65 && c <= 90) {
				sb.append(c);
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				while (!stack.isEmpty()) {
					char top = stack.pop();
					if (top == '(')
						break;
					sb.append(top);
				}
			} else {
				while (!stack.isEmpty() && priority(stack.peek()) >= priority(c))
					sb.append(stack.pop());
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
