package Level_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main_lev5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine(); // 입력받은 정수 문자열
		Integer[] arr = new Integer[input.length()]; // input 문자열 길이만큼 배열 준비.
		for (int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i) - '0'; // i=0 일때, '1' - '0' = 1 이됨.
		}
		Arrays.sort(arr, Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++)
			bw.write(Integer.toString(arr[i]));
		bw.flush();
	}

}
