package Algorithm_Basic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Date_Calculation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[3];
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < 3; i++)
			arr[i] = Integer.parseInt(str[i]);
		int ans = 1;
		while (true) {
			if ((ans - arr[0]) % 15 == 0 && (ans - arr[1]) % 28 == 0 && (ans - arr[2]) % 19 == 0)
				break;
			ans++;
		}
		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
