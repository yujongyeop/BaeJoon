package Algorithm_Basic;

//https://www.acmicpc.net/problem/17299
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class right_equal_num {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int num = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();// input값을 이용해 배열을 사용했지만 index범위 오류로 인해 맵방식으로 바꿈
		int[] result = new int[num];
		String[] input = br.readLine().split(" ");

		for (int i = 0; i < num; i++) {
			int a = Integer.parseInt(input[i]);
			if (!map.containsKey(a)) {
				map.put(a, 1);
			} else {
				int re = map.get(a) + 1;
				map.replace(a, re);
			}
		}

		for (int i = 0; i < num; i++) {
			if (stack.empty())
				stack.push(i);
			while (!stack.empty() && Integer.valueOf(map.get(Integer.parseInt(input[stack.peek()]))) < Integer
					.valueOf(map.get(Integer.parseInt(input[i])))) {// 스택이 비어있지 않고, 스택 위 가장 위에 값을 기준으로 입력값을 설정 i번째 입력값과
																	// 비교하여 확인
				result[stack.peek()] = Integer.valueOf(Integer.parseInt(input[i]));// i번째 값이 더 많이 나왔다면 오등큰수설정
				stack.pop();
			}
			stack.push(i);// while 이후 스택에 푸시를 통해 while문 && 이후 조건식의 stack.peek부분이 i값보다 낮게 설정 가능
		}
		while (!stack.isEmpty()) {// 오등큰수가 없는 값들 처리
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
