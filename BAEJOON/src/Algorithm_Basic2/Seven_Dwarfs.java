package Algorithm_Basic2;

//https://www.acmicpc.net/problem/2309
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Seven_Dwarfs {
	/*
	 * 일곱 난쟁이 문제는 9명 중 7명의 키가 100일 때의 난쟁이들 키를 오름차순으로 출력하는 문제이다. 제가 푼 방식은 9명 난쟁이들의 키를
	 * 모두 합한 후 100으로 빼고 초과된 수를 입력받은 난쟁이들 끼리 더하면서 합이 초과된 수랑 같으면 해당 난쟁이들이 거짓말을 하고 있는
	 * 것이다. 정렬은 Arrays.sort를 이용했다
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[9];
		int result = 0;
		int over = 0;
		int fake_one = 0;
		int fake_two = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			result += arr[i];
		}
		over = result - 100;
		Arrays.sort(arr);
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (arr[i] + arr[j] == over) {
					fake_one = i;
					fake_two = j;
				}
			}
		}
		for (int i = 0; i < 9; i++) {
			if (i == fake_one || i == fake_two)
				continue;
			else
				sb.append(arr[i] + "\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
