package Level_3;
//https://www.acmicpc.net/problem/2438
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev9 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 1; i < num+1; i++) {
			for(int j = i ; j > 0 ; j--) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
	}
}