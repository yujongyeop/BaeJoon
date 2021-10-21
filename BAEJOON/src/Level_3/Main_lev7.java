package Level_3;
//https://www.acmicpc.net/problem/11021
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_lev7 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int counter = 1;
		for (int i = 0; i < num; i++,counter++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write("Case #" + counter + ": ");
			bw.flush();
			bw.write(Integer.toString(result));
			bw.newLine();
			bw.flush();
		}
	}

}
