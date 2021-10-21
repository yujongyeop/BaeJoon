package Level_2;

import java.util.Scanner;

public class Main_lev3 {

	public static void main(String[] args) {
		// 100의 배수면서 400의 배수면 ㅇ
		// 4의 배수면서 100의 배수면 x
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if((year %= 400) == 0)
			System.out.println("1");
		else if((year %= 100) == 0)
			System.out.println("0");
		else if((year %= 4) == 0 && (year %= 100) == 0)
			System.out.println("1");
		else
			System.out.println("0");
		sc.close();

	}

}
