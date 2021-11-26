package Algorithm_Basic2;

//https://www.acmicpc.net/problem/10972
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class next_Permutation {
	static int[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if (n_Permutation(N)) {
			for (int ans : arr)// 다음 순열이 있는 경우
				sb.append(ans + " ");
		} else {// 다음 순열이 없는 경우
			sb.append("-1");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();

	}

	static boolean n_Permutation(int n) {
		int i = n - 1;// 내림차순의 시작점
		while (i > 0 && arr[i - 1] >= arr[i])// 뒤에 배열이 앞에 배열보다 작을 때만 반
			i -= 1;
		if (i <= 0)// arr이 내림차순일 경우 다음 순열이 없으므로 false반환
			return false;
		int j = n - 1;// arr[i-1]보다 큰 수 중에
		while (arr[j] <= arr[i - 1]) // arr[i] ~ arr[n] 중 arr[i-1]보다 큰 수 중 j값이 제일 높은 수 찾기
			j -= 1;
		swap(i - 1, j);// arr[i-1] 과 arr[j]를 바꿔줌
		j = n - 1;
		while (i < j) {// arr[i]~ arr[n] 을 뒤집어 준다.
			swap(i, j);
			i++;
			j--;
		}
		return true;
	}

	static void swap(int pre, int next) {
		int temp = arr[pre];
		arr[pre] = arr[next];
		arr[next] = temp;
		return;
	}

}
