package Algorithm_Basic;

//https://www.acmicpc.net/problem/2745
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class notation_convert {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int result = 0;
		int squared = 0;
		int notation = Integer.parseInt(input[1]);
		for (int i = input[0].length() - 1; i >= 0; i--) {
			char num = input[0].charAt(i);
			if (num >= 'A') {
				num -= 'A';
				num += 10;
			} else {
				num -= '0';
			}
			result += (Math.pow(notation, squared)) * (int) num;
			squared++;
		}
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}

}
