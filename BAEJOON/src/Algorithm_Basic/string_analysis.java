package Algorithm_Basic;

//https://www.acmicpc.net/problem/10820
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class string_analysis {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = "";
		while ((input = br.readLine()) != null) {// null입력될 때까지 반복(하지만 사용자로부터 값을 입력받는 상황에서 실행시에는 값을 입력하지 않아도 계속 실행되는 무한
													// 루프발생)
			int[] analysis = new int[4];
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (c == ' ')
					analysis[3] += 1;
				else if (c >= '0' && c <= '9')
					analysis[2] += 1;
				else if (c <= 'Z' && c >= 'A')
					analysis[1] += 1;
				else
					analysis[0] += 1;
			}
			for (int i : analysis)
				bw.write(i + " ");
			bw.newLine();
			bw.flush();
		}
//		br.close();
//		bw.close();
//		버퍼를 닫을 경우 실행 속도가 느려짐(약 8~12ms)
	}

}
