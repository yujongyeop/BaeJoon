package Algorithm_Basic;

//https://www.acmicpc.net/problem/1874
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class stack_sequence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = 1;
		int num = Integer.parseInt(br.readLine());
		int[] input = new int[num];
		int[] result = new int[num];
		Stack<Integer> sta = new Stack<>();
		for (int i = 0; i < num; i++)
			input[i] = Integer.parseInt(br.readLine());
		if (sta.empty())
			for (int i = 0; i < input[0]; i++) {
				sta.push(n++);
				sb.append("+\n");
			}
		for (int i = 0; i < num; i++) {
			while (sta.empty() == true || sta.peek() < input[i]) {
				sta.push(n++);
				sb.append("+\n");
			}
			if (sta.peek() == input[i]) {
				result[i] = sta.pop();
				sb.append("-\n");
			} else {
				sb.setLength(0);
				sb.append("NO");
				break;
			}
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		br.close();
		bw.close();
	}

}
