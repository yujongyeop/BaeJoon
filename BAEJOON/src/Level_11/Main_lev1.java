package Level_11;
//https://www.acmicpc.net/problem/2798
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_lev1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0, result = 300001;
		int input_num = Integer.parseInt(st.nextToken());
		int input_sum = Integer.parseInt(st.nextToken());
		String[] arr = br.readLine().split(" ");
		for (int i = 0; i < input_num - 2; i++) {
			for (int j = i + 1; j < input_num - 1; j++) {
				for (int k = j + 1; k < input_num; k++) {
					sum = Integer.parseInt(arr[i]) + Integer.parseInt(arr[k]) + Integer.parseInt(arr[j]);
					if (input_sum - sum >= 0 && input_sum - sum < Math.abs(input_sum - result)) {
						result = sum;
					}
				}
			}
		}
		bw.write(Integer.toString(result));
		bw.flush();
	}

}