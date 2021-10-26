package Algorithm_Basic;

//https://www.acmicpc.net/problem/10799
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class iron_stick {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int num_stick = 0;
		String input = br.readLine();
		for (int i = 0; i < input.length();) {
			char c_f = input.charAt(i);
			char c_b = ' ';
			if (i + 1 < input.length())
				c_b = input.charAt(i + 1);
			if (c_f == '(') {
				if (c_b == ')') {// ()가 나왔을 때
					num_stick += stack.size();
					i += 2;
				} else {
					stack.push(1);
					i += 1;
				}
			} else {// ')'가 나왔을때
				stack.pop();
				num_stick += 1;
				i += 1;
			}
		}
		sb.append(num_stick);
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}