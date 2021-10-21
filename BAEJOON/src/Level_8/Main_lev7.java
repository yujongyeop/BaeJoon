package Level_8;
//https://www.acmicpc.net/problem/2839
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int kg = Integer.parseInt(br.readLine());
		int three = 0;
		int five = 0;
		if (kg % 5 == 0) {
			five = kg / 5;
			kg = 0;
			bw.write(Integer.toString(five + three));
		}
		while (kg % 5 != 0 && kg > 0) {
			kg -= 3;
			three++;
			if (kg % 5 == 0) {
				five = kg / 5;
				kg = 0;
				bw.write(Integer.toString(five + three));
			} else if (kg - 3 < 0) {
				bw.write("-1");
				break;
			}
		}
		bw.flush();
	}

}
