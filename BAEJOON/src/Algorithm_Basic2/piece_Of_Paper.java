package Algorithm_Basic2;

//https://www.acmicpc.net/problem/14391
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class piece_Of_Paper {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);// N
		int M = Integer.parseInt(input[1]);// M
		int[][] arr = new int[N][M];// 사용자 값 저장 배열
		
		for (int i = 0; i < N; i++) {// 사용자 값을 배열에 저장
			String userInput = br.readLine();
			for (int j = 0; j < M; j++)
				arr[i][j] = userInput.charAt(j) - '0';
		}
		
		int ans = 0;// 정답 변수
		
		// 가로 연산
		for (int s = 0; s < (1 << (N * M)); s++) {// M*N번 1을 왼쪽으로 shift시킨 횟수 만큼 반복 Ex) N,M=2 일 때 16번 반복(16번 반복하는 이유는 중복을 모두 포함하기 떄문)
			// s의 값에 따라 배열 중에서 연산을 안하는 수가 선택됨
			int sum = 0;
			for (int i = 0; i < N; i++) {
				int current = 0;
				for (int j = 0; j < M; j++) {
					int k = i * M + j;
					if ((s & (1 << k)) == 0) {// 1을 k번 왼쪽으로 shift한 값이 s에 존재하면 해당 숫자는 제외시킨다.
						current = current * 10 + arr[i][j];// 가로로 연속되는 경우
					} else {// 연속되지 않는 경우 혹은 해당 수를 선택하지 않는 경우
						sum += current;
						current = 0;
					}
				}
				sum += current;
			}
			// 세로 연산(가로 연산에서 사용되지 않은 수를 연산함)
			for (int j = 0; j < M; j++) {
				int current = 0;
				for (int i = 0; i < N; i++) {
					int k = i * M + j;
					if ((s & (1 << k)) != 0) {// 32번 줄과 반대되는 조건
						current = current * 10 + arr[i][j];// 남은 수가 세로로 연속될 경우
					} else {// 가로 연산에서 선택된 수거나 세로로 연속되지 않는 경우
						sum += current;
						current = 0;
					}
				}
				sum += current;
			}
			ans = Math.max(sum, ans);// 기존 값과 sum값을 비교하여 최대값을 저장
		}
		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
