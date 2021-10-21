package Level_12;
//https://www.acmicpc.net/problem/10989
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++)
			arr[i] = Integer.parseInt(br.readLine());
		int[] count = new int[10000];
		for (int i = 0; i < 10000; i++)
			count[i] = 0;

		for (int i = 0; i < num; i++) {
			count[arr[i] - 1]++;
		}
		for (int i = 0; i < 10000; i++) {
			if (count[i] != 0) {
				for (int j = count[i]; j > 0; j--) {
					bw.write(i+1 + "\n");
				}
			}
		}
		bw.flush();
	}

}
