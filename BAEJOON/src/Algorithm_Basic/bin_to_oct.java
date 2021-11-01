package Algorithm_Basic;

//https://www.acmicpc.net/problem/1373
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bin_to_oct {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String bin = br.readLine();
		if (bin.length() % 3 == 1) {// 맨앞 한 개가 남을때 예외 처리
			sb.append(bin.charAt(0));
		} else if (bin.length() % 3 == 2) {// 맨앞 두 개가 남을때 예외 처리
			sb.append((bin.charAt(0) - '0') * 2 + (bin.charAt(1) - '0'));
		}
		for (int i = bin.length() % 3; i < bin.length(); i += 3) {// 2진수를 8진수로 변경(자세한 방법은 인터넷을 찾아보면 나옵니다)
			sb.append((bin.charAt(i) - '0') * 4 + (bin.charAt(i + 1) - '0') * 2 + (bin.charAt(i + 2) - '0'));
		}
		bw.write(String.valueOf(sb));
		bw.close();
		br.close();
	}

}
