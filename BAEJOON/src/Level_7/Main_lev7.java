package Level_7;
//https://www.acmicpc.net/problem/2908
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		String[] num = input.split(" ");
		int a = convert_num(Integer.parseInt(num[0]));
		int b = convert_num(Integer.parseInt(num[1]));
		if (a > b)
			bw.write(Integer.toString(a));
		else
			bw.write(Integer.toString(b));
		bw.flush();

	}

	static int convert_num(int a) {// 숫자 변환 ex) 437 to 734
		int result = (a % 10) * 100;
		a /= 10;
		result += (a % 10) * 10;
		a /= 10;
		result += (a % 10);
		return result;

	}
}
