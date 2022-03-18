package S1152;

import java.io.IOException;

public class Main01{
 
	public static void main(String[] args) throws IOException {
 
		int count = 0;
		int pre_str = 32;	// 공백을 의미한다.
		int str ;
		
		while(true) {
			
			str = System.in.read();
//			read() 키보드로 입력 후 한글자씩(한 바이트씩)만 읽는 메서드이다
            
			System.out.println(str);
			// 입력받은 문자가 공백일 때,
			if(str == 32) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) count++;
			}
			
			// 입력받은 문자가 개행일때 ('\n')
			else if(str == 10) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) count++;
				break;
			}
			
			pre_str = str;
			
		}
		
		System.out.println(count);
	}
 
}
