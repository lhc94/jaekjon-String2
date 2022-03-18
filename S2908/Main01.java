package S2908;

import java.util.Scanner;

public class Main01 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
        
        in.close();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B);
		
		  String str1 = "Hollw";
		  
		  System.out.println(str1.hashCode());
		  
		  String str2 = "world";
		  str1 = str1 + str2;
		  
		  System.out.println(str1.hashCode());
	
	}
	
}
