package S2908;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		// 두 수를 입력을 받고 (세 자리 수이다)
		 // 각 숫자들을 뒤집는다
		 // 뒤집은 숫자를 비교 해서 젤 큰 숫자를 출력값으로 한다
		 
			Scanner sc = new Scanner(System.in);
			
			int n1 = Integer.parseInt(sc.next());
			int n2 = Integer.parseInt(sc.next());
			
			sc.close();
			
			int L3 = n1 / 100;
			int L2 = ((n1 / 10) % 10) * 10;
			int L1 = (n1 % 10) * 100;
			
			int result = L1 + L2 + L3;
			
			int Lo3 = n2 / 100;
			int Lo2 = ((n2 / 10) % 10) * 10;
			int Lo1 = (n2 % 10) * 100;
			
			int result1 = L1 + L2 + L3;
			
			if(L1 > Lo1) {
				System.out.println(result);
			}
			else if(L1 == Lo1) {
				if(L2 > Lo2) {
					System.out.println(result);
				}
				else if(L2 == Lo2) {
					if(L3 > Lo3) {
						System.out.println(result);
					}
					else {
						System.out.println(result1);
					}
				}
				else {
					System.out.println(result1);
				}
			}
			else {
				System.out.println(result1);
			}
	 }
}
