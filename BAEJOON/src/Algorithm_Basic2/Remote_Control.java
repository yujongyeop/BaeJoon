package Algorithm_Basic2;

//https://www.acmicpc.net/problem/1107
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Remote_Control {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int target_Channel = Integer.parseInt(br.readLine());// 목표 채널
		int M = Integer.parseInt(br.readLine());// 부서진 키 개수
		boolean[] Keys = new boolean[10];// 사용 가능 키 저장(true면 부서진 키)
		if (M != 0) {
			String[] broken_Num = br.readLine().split(" ");
			for (int i = 0; i < M; i++) {// 0이면 실행 안됨
				int n = Integer.parseInt(broken_Num[i]);
				Keys[n] = true;
			}
		}

		int result = Math.abs(target_Channel - 100);// 목표 채널이 채널 100번과 떨어진 거리 계산

		for (int i = 0; i <= 999999; i++) {// 경우의 수가 50만까지지만 리모컨은 999999만까지 입력 받을 수 있다(즉 범위를 99999까지 늘려야함)
			String str = String.valueOf(i);
			int len = str.length();

			boolean isBreak = false;
			for (int j = 0; j < len; j++) {
				if (Keys[str.charAt(j) - '0']) { // str에 고장난 버튼이 있으면
					isBreak = true;
					break;// 연산 종료
				}
			}
			if (!isBreak) {
				int min = Math.abs(target_Channel - i) + len; // i의 길이와 이동 횟수를 더함
				result = Math.min(result, min);// 최소값 찾음
			}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}

}