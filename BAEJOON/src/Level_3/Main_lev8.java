package Level_3;
//https://www.acmicpc.net/problem/11022
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_lev8 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a, b, result;
		int num = Integer.parseInt(br.readLine());
		int counter = 1;
		for (int i = 0; i < num; i++, counter++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			result = a + b;
			bw.write("Case #" + counter + ": " + a + " + " + b + " = " + Integer.toString(result));
			bw.newLine();
		}
		bw.flush();
	}
}