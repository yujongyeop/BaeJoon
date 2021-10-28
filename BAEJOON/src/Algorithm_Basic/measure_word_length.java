package Algorithm_Basic;

//https://www.acmicpc.net/problem/2743
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class measure_word_length {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		bw.write(Integer.toString(input.length()));
		bw.flush();
		bw.close();
		br.close();
	}

}
