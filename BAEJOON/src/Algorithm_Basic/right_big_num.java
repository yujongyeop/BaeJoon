package Algorithm_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class right_big_num {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		int[] result = new int[num];
		String[] input = br.readLine().split(" ");

		for (int i = 0; i < num; i++) {
			if (stack.empty())
				stack.push(i);
			while (!stack.empty() && Integer.valueOf(input[stack.peek()]) < Integer.valueOf(input[i])) {
				result[stack.pop()] = Integer.valueOf(input[i]);
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}
		for (int a : result)
			sb.append(a + " ");

		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();

	}

}