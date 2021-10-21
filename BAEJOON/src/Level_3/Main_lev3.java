package Level_3;
//https://www.acmicpc.net/problem/8393
import java.util.Scanner;

public class Main_lev3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		sc.close();
		for(int i = 1 ; i < num+1; i++)
			result += i;
		System.out.println(result);
	}
}
