package Algorithm_Basic;

//https://www.acmicpc.net/problem/10872
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int factorial = 1;
		for (int i = input; i > 0; i--)
			factorial *= i;
		bw.write(Integer.toString(factorial));
		bw.flush();
		bw.close();
		br.close();
	}

}
