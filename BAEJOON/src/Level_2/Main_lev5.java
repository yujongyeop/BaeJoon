package Level_2;
//https://www.acmicpc.net/problem/2884	
import java.util.Scanner;

public class Main_lev5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if(min < 45 ) {
			min = 60 + (min - 45); 
			hour--;
		}else
			min = min - 45;
		if(hour < 0)
			hour = 23;
		System.out.println(hour + " " + min);
		sc.close();

	}

}
