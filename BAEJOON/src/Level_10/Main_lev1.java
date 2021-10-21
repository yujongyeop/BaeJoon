package Level_10;
//https://www.acmicpc.net/problem/10872
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev1 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int a = input;
		bw.write(Integer.toString(fact(a)));
		bw.flush();
	}

	static int fact(int a) {
		int result = a;
		if (a == 0) {
			result = 1;
		} else if (a != 1) {
			a--;
			result *= fact(a);
		}
		return result;
	}

}