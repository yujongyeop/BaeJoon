package Algorithm_Basic;

//https://www.acmicpc.net/problem/11576
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class base_conversion {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] notation = br.readLine().split(" ");
		Stack<Integer> stack = new Stack<Integer>();
		int A_notation = Integer.parseInt(notation[0]);
		int B_notation = Integer.parseInt(notation[1]);
		int squared = 0;
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		String[] input = br.readLine().split(" ");
		for (int i = num - 1; i >= 0; i--) {// A진법을 10진법으로 변환
			result += (Integer.parseInt(input[i]) * Math.pow(A_notation, squared));
			squared++;
		}
		while (result >= B_notation) { // 10진법을 B진법으로 변환
			stack.push(result % B_notation);// 스택에 저장하여 출력 순서를 반대로 함
			result /= B_notation;
		}
		stack.push(result);
		while (!stack.isEmpty())
			sb.append(stack.pop() + " ");
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();

	}

}
