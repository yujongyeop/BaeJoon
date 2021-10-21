package Level_3;
//https://www.acmicpc.net/problem/10871
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_lev11 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		StringTokenizer arr = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < num ; i++) {
			String j = arr.nextToken();
			if(Integer.parseInt(j) < x) {
				bw.write(j+" ");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}