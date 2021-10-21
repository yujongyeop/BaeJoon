package Level_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for (int j = 0; j < num; j++) {
			String[] input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]), y = Integer.parseInt(input[1]);
			int distance = y - x, real_distance = distance - 1;
			int i = 0, count = 0, half = distance / 2;
			while (real_distance != 0) {
				if (real_distance > half) {
					if (i + 1 <= real_distance) {
						real_distance -= (i + 1);
						count++;
						i++;
					} else if (i <= real_distance) {
						if (real_distance < half) {
							real_distance -= (i);
							count++;
							i++;
						}
					} else if (i - 1 <= real_distance) {
						if (real_distance < half) {
							real_distance -= (i - 1);
							count++;
							i++;
						}
					}

				} else {
					if (i + 1 <= real_distance) {
						real_distance -= (i + 1);
						count++;
						i--;
					} else if (i <= real_distance) {
						if (real_distance <= half) {
							real_distance -= (i);
							count++;
							i--;
						}
					} else if (i - 1 <= real_distance) {
						if (real_distance < half) {
							real_distance -= (i - 1);
							count++;
							i--;
						}
					}
				}
				System.out.println(i);
			}
			bw.write(Integer.toString(count + 1));
			bw.newLine();
		}
		bw.flush();
	}

}
