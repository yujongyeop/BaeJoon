package Algorithm_Basic;

//https://www.acmicpc.net/problem/10824
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class four_number {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		long a = Long.parseLong(input[0] + input[1]);
		long b = Long.parseLong(input[2] + input[3]);
		bw.write(Long.toString(a + b));
		bw.flush();
		bw.close();
		br.close();
	}

}
