package Algorithm_Basic;

//https://www.acmicpc.net/problem/2089
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class minus_binary {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int input = Integer.parseInt(br.readLine());
		if (input == 0)
			bw.write("0");
		else {
			while (input != 1) {
				sb.append(Math.abs(input % -2));
				input = (int) Math.ceil((double) input / -2);
			}
			sb.append(input);
			bw.write(String.valueOf(sb.reverse()));
		}

		bw.flush();
		br.close();
		bw.close();
	}

}
