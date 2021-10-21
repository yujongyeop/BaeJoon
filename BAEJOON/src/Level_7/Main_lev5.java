package Level_7;
//https://www.acmicpc.net/problem/1157
import java.io.BufferedReader;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev5 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[] = new int[26];
		int count = 0, max = 0, result = 0;
		for (int i = 0; i < 26; i++)//배열 초기화
			arr[i] = 0;
		String input = br.readLine();
		input = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {//입력 받은 문자 배열에 저장
			int num = input.charAt(i);
			arr[num - 97] += 1;
		}
		max = Arrays.stream(arr).max().getAsInt();//배열에서 최대값 찾기
		for (int i = 0; i < 26; i++) {//최대값 중복 검사
			if (arr[i] == max) {
				result = i;
				count++;
			}
		}
		if (count >= 2)//최대값이 두개일 경우
			bw.write("?");
		else
			bw.write((char) (result + 65));
		bw.flush();
	}
}
