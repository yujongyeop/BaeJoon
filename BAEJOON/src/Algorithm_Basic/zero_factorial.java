package Algorithm_Basic;

//https://www.acmicpc.net/problem/1676
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class zero_factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 5; i <= input; i = i * 5)
			count += (input / i);
		/*
		 * 100!로 예를 들자면 5를 한번 곱해서 나올 수 있는 수는 총 20개이다. 
		 * 5를 두번 곱해서 나올 수 있는 수(25의 배수)는 4개이다. 
		 * 즉, 총 5가 나올 수 있는 경우의 수는 24번이다. 
		 * 2의 배수를 세지 않는 이유는 2의 배수가 무조건 5의 배수보다 많이 나오기 때문이다
		 */
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}

}
