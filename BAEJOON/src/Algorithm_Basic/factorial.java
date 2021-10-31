package Algorithm_Basic;

//https://www.acmicpc.net/problem/10872
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class factorial {
	static int fact(int num) {
		int result = num;
		if (num != 0) {
			num--;
			result *= fact(num);
		} else {
			return 1;
		}
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		bw.write(Integer.toString(fact(input)));
		bw.flush();
		bw.close();
		br.close();
	}

}
