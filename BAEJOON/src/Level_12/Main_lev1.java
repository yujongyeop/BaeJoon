package Level_12;
//https://www.acmicpc.net/problem/2750
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			int input = Integer.parseInt(br.readLine());
			arr[i] = input;
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i = 0; i < num; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
	}

}