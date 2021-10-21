package Level_12;

//https://www.acmicpc.net/problem/2751
//병합 정렬 사용
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_lev2 {
	static int[] sorted;
	static int[] arr;
	static StringBuilder result = new StringBuilder();

	static void merageSort(int start, int end) {
		if (start < end) {// 한개가 남을 때까지 쪼개기
		int mid = (start + end) / 2;
		merageSort(start, mid);// 앞부분
		merageSort(mid + 1, end);// 뒷부분
		merage(start, mid, end);
		}
	}

	static void merage(int start, int mid, int end) {// 실제 연산 부분(병합 정렬)
		int left = start;
		int right = mid + 1;
		int k = start;
		while (left <= mid && right <= end) {
			if (arr[left] < arr[right]) {
				sorted[k] = arr[left];
				left++;
			} else {
				sorted[k] = arr[right];
				right++;
			}
			k++;
		}
		while (left <= mid) {// 왼쪽 남은 값 넣기
			sorted[k] = arr[left];
			left++;
		}
		while (right <= end) {// 오른쪽 남은 값 넣기
			sorted[k] = arr[right];
			right++;
			k++;
		}
		for (int i = 0; i <= end; i++) {// 임시 배열 내용 arr에 덮어 씌우기
			arr[i] = sorted[i];
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		sorted = new int[num];
		arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		merageSort(0, arr.length - 1);
		for (int i = 0; i < num; i++) {
			result.append(arr[i] + "\n");
		}
		bw.write(String.valueOf(result));
		bw.flush();
	}
}
