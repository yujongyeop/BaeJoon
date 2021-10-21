package Level_3;
//https://www.acmicpc.net/problem/10950
import java.util.Scanner;

public class Main_lev2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0 ; i < num ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}

}
