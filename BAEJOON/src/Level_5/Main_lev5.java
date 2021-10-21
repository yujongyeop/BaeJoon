package Level_5;
//https://www.acmicpc.net/problem/1546
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_lev5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		double sum = 0.0, max = 0.0, avg = 0.0;
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < num ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > max)
				max = arr[i];
		}
		for(int i = 0 ; i < num ; i++) {
			sum = sum + (arr[i]/max*100);
		}
		avg = Math.round(sum / arr.length*100.0)/100.0;
		bw.write(Double.toString(avg));
		bw.flush();
	}

}
