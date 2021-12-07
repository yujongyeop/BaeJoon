package Algorithm_Basic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class set {
	/*
	 * bitset 정수 안에 숫자를 표현하는 방식이다. 비트 방식으로 연산하기 때문에 bitset정수의 2진수를 10진수로 변환한 값이
	 * 예상한것과 다르다. 이는 비트단위 연산이기 때문에 10진수 값은 의미가 없다 생각하는 게 편한다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int bitset = 0;
		while (N-- > 0) {
			String[] Input = br.readLine().split(" ");
			int num = 0;
			switch (Input[0]) {
			case "add":
				num = Integer.parseInt(Input[1]);
				bitset |= (1 << (num - 1));
				// 1을 num-1번 만큼 왼쪽으로 shift시키고 bitset과 or 연산을 한 후 값을 저장
				break;
			case "remove":
				num = Integer.parseInt(Input[1]);
				/* 1을 num-1번 만큼 왼쪽으로 shift시키고 NOT 연산을 해준다.
				bitset과 and 연산을 한 후 값을 저장*/
				bitset = bitset & ~(1 << (num - 1));
				break;
			case "check":
				num = Integer.parseInt(Input[1]);
				sb.append((bitset & (1 << (num - 1))) != 0 ? "1\n" : "0\n");
				/*
				 * 1을 num-1만큼 shift 연산하고 bitset과 and 연산을 하여 그 값이 0이 아니면 1, 0이면 0을 출력한다.
				 * 이는 shift 연산을 한 1일 bitset의 해당 자리의 수와 일치하면 그 수가 있다는 것을 의미한다.
				 */
				break;
			case "toggle":
				num = Integer.parseInt(Input[1]);
				bitset ^= (1 << (num - 1));
				// 1을 num-1만큼 shift한 후 bitset과 xor연산을 통해 값이 있으면 삭제, 없으면 추가할 수 있다.
				break;
			case "all":
				bitset |= (~0);
				// bitset을 모두 1로 초기화시킨다.
				break;
			case "empty":
				bitset &= 0;
				// bitset을 모두 0으로 초기화신다.
				break;
			}
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
