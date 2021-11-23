package Algorithm_Basic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Candy_Game {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String[][] arr = new String[num][num];
		int ans = 0;

		for (int i = 0; i < num; i++) {// 입력을 arr배열에 저장
			String st = br.readLine();
			for (int j = 0; j < num; j++) {
				arr[i][j] = Character.toString(st.charAt(j));
			}
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - 1; j++) {
				v_swap(arr, i, j);
				ans = Math.max(ans, check_Arr(num, arr));
				v_swap(arr, i, j);

				h_swap(arr, i, j);
				ans = Math.max(ans, check_Arr(num, arr));
				h_swap(arr, i, j);
			}
		}
		bw.write(ans + "");
		bw.flush();
		br.close();
		bw.close();
	}

	static void h_swap(String[][] arr, int i, int j) {// 좌우 교환
		if (arr[i][j] != arr[i][j + 1]) {
			String temp = arr[i][j];
			arr[i][j] = arr[i][j + 1];
			arr[i][j + 1] = temp;
		}
	}

	static void v_swap(String[][] arr, int i, int j) {// 상하 교환
		if (arr[j][i] != arr[j + 1][i]) {
			String temp = arr[j][i];
			arr[j][i] = arr[j + 1][i];
			arr[j + 1][i] = temp;
		}
	}

	static int check_Arr(int num, String[][] arr) {
		int result = 0;
		for (int i = 0; i < num; i++) {// 행 확인
			int temp = 1;
			for (int j = 1; j < num; j++) {
				if (arr[i][j].equals(arr[i][j - 1]))
					temp++;
				else {
					result = Math.max(temp, result);
					temp = 1;
				}
				result = Math.max(temp, result);
			}
		}

		for (int i = 0; i < num; i++) {// 열 확인
			int temp = 1;
			for (int j = 0; j < num - 1; j++) {
				if (arr[j][i].equals(arr[j + 1][i]))
					temp++;
				else {
					result = Math.max(temp, result);
					temp = 1;
				}
				result = Math.max(temp, result);
			}
		}
		return result;
	}

}
