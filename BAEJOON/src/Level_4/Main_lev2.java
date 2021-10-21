package Level_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_lev2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer("");
		String input = "";
		int a , b , result;
		while((input = br.readLine()) != null) {
			st = new StringTokenizer(input);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken()); 
			result = a + b;
			bw.write(Integer.toString(result));
			bw.newLine();
		}
		bw.flush();
		
	}

}
