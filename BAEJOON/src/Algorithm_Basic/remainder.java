package Algorithm_Basic;

//https://www.acmicpc.net/problem/10430
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class remainder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] input = br.readLine().split(" ");
		int[] num = new int[input.length];
		for (int i = 0; i < input.length; i++)
			num[i] = Integer.parseInt(input[i]);
		sb.append((num[0] + num[1]) % num[2] + "\n");
		sb.append(((num[0] % num[2]) + (num[1] % num[2])) % num[2] + "\n");
		sb.append((num[0] * num[1]) % num[2] + "\n");
		sb.append(((num[0] % num[2]) * (num[1] % num[2])) % num[2] + "\n");
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
