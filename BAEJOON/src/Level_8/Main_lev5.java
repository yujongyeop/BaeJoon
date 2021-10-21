package Level_8;

//https://www.acmicpc.net/problem/10250
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String[] input = br.readLine().split(" ");
			int result = (((Integer.parseInt(input[2]) % Integer.parseInt(input[0])) * 100) == 0 //층수 구하기 (N을 건물 높이로 나눠 나머지 값 * 100을 함)
					? (Integer.parseInt(input[0]) * 100)
					: ((Integer.parseInt(input[2]) % Integer.parseInt(input[0])) * 100))
					+ ((int) Math.ceil((Integer.parseInt(input[2]) / Double.parseDouble(input[0])))); // 호수 고르기(소수점이 있으면 올림 해버림)
			bw.write(Integer.toString(result));
			bw.newLine();
		}
		bw.flush();
	}

}
