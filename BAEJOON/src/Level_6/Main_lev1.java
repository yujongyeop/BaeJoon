package Level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_lev1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] a = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
	}

	long sum(int[] a) {
		long result = 0;
		for (int i = 0; i < a.length; i++)
			result = result + a[i];
		return result;

	}

}

//제출한 코드
//public class Test {
//    long sum(int[] a) {
//		long ans = 0;
//		for (int i = 0; i < a.length; i++)
//			ans = ans + a[i];
//		return ans;
//
//	}
//}
