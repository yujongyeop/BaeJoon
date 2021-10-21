package Level_4;
// Ex) 66일 경우
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int count = 0;
		int compare_num = 0;
		int mid; // 비교값의 오른쯕 값 ex) 66일 경우 6 + 6(이 값) = 12
		int result = 0;
		if (input > 0 && input < 10) {
			compare_num = input * 10 + input;
			count++;
		} else if (input == 0) {
			count++;
		}
		while (input != compare_num) {
			if (count == 0) {
				mid = input % 10;
				result = (input / 10) + mid;
				compare_num = (mid * 10) + (result % 10);
				count++;
				continue;
			}
			mid = compare_num % 10;
			result = (compare_num / 10) + mid;
			compare_num = (mid * 10) + (result % 10);
			count++;
		}
		bw.write(Integer.toString(count));
		bw.flush();
	}
}
