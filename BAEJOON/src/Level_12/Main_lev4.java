package Level_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main_lev4 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int been = 0; // 빈도
		int been_num = -1;// 최빈값 나온 횟수
		int range = 0;// 범위
		int min = 0;// 최소값
		int[] count;// 최빈값 배열
		int equal_check = 1;
		int[] arr = new int[num];// 값 저장 배열
		for (int i = 0; i < num; i++)
			arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		range = arr[arr.length - 1] - arr[0]; // 범위
		min = arr[0];
		int avrg = Math.round((float) Arrays.stream(arr).sum() / num);// 평균
		count = new int[range + 1];

		for (int i = 0; i < num; i++) {// 최빈값 구하는 곳
			count[arr[i] - min]++;//계수 정렬?
		}
		for (int i = 0; i < count.length; i++) {
			if (been_num == count[i] && equal_check == 1) {
				been = i + min;
				equal_check++;
			}
			if (been_num < count[i] && been_num != count[i]) {
				been_num = count[i];
				been = i + min;
				equal_check = 1;
			}
		}

		bw.write(avrg + "\n");
		bw.write(arr[Math.round(arr.length / 2)] + "\n");
		bw.write(been + "\n");
		bw.write(range + "\n");
		bw.flush();
	}

}
