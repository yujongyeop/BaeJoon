package Level_7;
//https://www.acmicpc.net/problem/1152
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int length = arr.length;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == "")
				length--;
		bw.write(Integer.toString(length));
		bw.flush();
	}

}
