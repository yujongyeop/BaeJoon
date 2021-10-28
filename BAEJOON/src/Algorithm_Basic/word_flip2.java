package Algorithm_Basic;

//https://www.acmicpc.net/problem/17413
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class word_flip2 {
	static StringBuilder sb = new StringBuilder();

	static void check_stack(Stack<Character> stack) {
		while (!stack.isEmpty())
			sb.append(stack.pop());
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int check_bracket = 0; // <>를 쉽게 확인하게 위해서 사용
		Stack<Character> stack = new Stack<>();
		String input = br.readLine();
		for (int i = 0; i < input.length(); i++) {// 문자를 하나씩 검사
			char c = input.charAt(i);
			if (check_bracket == 1) {
				sb.append(c);
				if (c == '>') {
					check_bracket = 0;
				}
				continue;
			} else if (c == '<') {// '<' 나왔을 때 Stack을 체크 해준 후 check_bracket을 1로 바꿔줌
				check_stack(stack);
				sb.append(c);
				check_bracket = 1;
			} else if (c == ' ') {// ' ' 나왔을 때 Stack을 체크 후 StringBuilder에 넣어줌
				check_stack(stack);
				sb.append(c);
			} else {// '<', ' '를 제외한 문자가 나왔을 때 Stack에 추가 시킴
				stack.add(c);
			}

		}
		check_stack(stack);// 스택에 남아있는 문자 뒤집기

		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
