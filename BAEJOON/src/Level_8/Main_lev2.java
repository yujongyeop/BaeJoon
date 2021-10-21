package Level_8;
//https://www.acmicpc.net/problem/2292
//칸 별로 최대값이 6의 배수로 증가
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int count = 1, result = 1;
		for (int i = 1;result < input; i++) {
			result += (6 * i);
			count++;
			
		}
		bw.write(Integer.toString(count));
		bw.flush();
	}

}
