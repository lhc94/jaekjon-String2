package S1152;

import java.util.Scanner;
import java.util.StringTokenizer;

//countTokens : StringTokenizer 로 구분자들을 제거 후 문자열들 개수를 세는것 

public class Main {
	public static void main(String[] args) {
		// 공백 + 1  => 단어 전체 개수
		// 맨앞과 뒤의 공백이있다면 단어의 개수로 포함하지 않게끔
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		sc.close();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		
		System.out.println(st.countTokens());
	}
}
