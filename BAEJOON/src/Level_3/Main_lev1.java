package Level_3;
//https://www.acmicpc.net/problem/2739
import java.util.Scanner;

public class Main_lev1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.close();
		for(int i = 1 ; i < 10 ; i++)
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);

	}

}
