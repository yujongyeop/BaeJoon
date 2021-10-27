package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class postfix_notation2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		Stack<Double> stack = new Stack<Double>();
		int num = Integer.parseInt(br.readLine());
		String formula = br.readLine();
		int seq = 0;
		int[] input = new int[num];
		for (int i = 0; i < num; i++)
			input[i] = Integer.parseInt(br.readLine());

		for (int i = 0; i < formula.length(); i++) {
			char c = formula.charAt(i);
			if (c >= 65 && c <= 90) {
				if (!map.containsKey(c)) {
					map.put(c, seq);
					seq++;
				}
				stack.push((double) input[map.get(c)]);
				continue;
			}
			switch (c) {
			case '+':
				double add_end = stack.pop();
				double add_front = stack.pop();
				stack.push((add_front + add_end));
				break;
			case '-':
				double min_end = stack.pop();
				double min_front = stack.pop();
				stack.push((min_front - min_end));
				break;
			case '*':
				double mul_end = stack.pop();
				double mul_front = stack.pop();
				stack.push((mul_front * mul_end));
				break;
			case '/':
				double div_end = stack.pop();
				double div_front = stack.pop();
				stack.push((div_front / div_end));
				break;
			}
		}

		sb.append(String.format("%.2f", stack.pop()));
		bw.write(String.valueOf(sb));
		bw.close();
		br.close();
	}

}
