package Level_8;
//https://www.acmicpc.net/problem/2869
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int up = Integer.parseInt(input[0]);
		double down = Double.parseDouble(input[1]);
		int distance = Integer.parseInt(input[2]) - up;
		int day = (int) (Math.ceil(distance / (up - down)*1.0) + 1);
		bw.write(Integer.toString(day));
		bw.flush();
	}

}
