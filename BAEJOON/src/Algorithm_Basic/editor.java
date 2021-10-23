package Algorithm_Basic;

//https://www.acmicpc.net/problem/1406
//LinkedList만 사용 시 시간초과 발생
//ListIterator 사용
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class editor {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Character> input = new LinkedList<Character>();
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++)
			input.add(str.charAt(i));
		ListIterator<Character> iter = input.listIterator();

		while (iter.hasNext())
			iter.next();

		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String cmd = br.readLine();
			char c = cmd.charAt(0);
			switch (c) {
			case 'L': {
				if (iter.hasPrevious())
					iter.previous();
				break;
			}
			case 'D': {
				if (iter.hasNext())
					iter.next();
				break;
			}
			case 'B': {
				if (iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break;
			}
			case 'P': {
				iter.add(cmd.charAt(2));
				break;
			}
			}
		}
		for (char s : input) {
			bw.write(s + "");
		}
		bw.flush();
	}

}
