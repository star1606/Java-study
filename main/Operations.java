package main;

public class Operations {

	public static void main(String[] args) {
		
		int a = 3;
		System.out.println(0 % a);  // 0
		System.out.println(1 % a);  // 1
		System.out.println(2 % a);  // 2
		System.out.println(3 % a);	// 0
		System.out.println(4 % a);	// 1
		System.out.println(5 % a);	// 2
		System.out.println(6 % a);	// 0
		System.out.println(7 % a);	// 1
		System.out.println(8 % a);	// 2
		
		System.out.println("==============================");
		int c = 10;
		int d = 3;
		
		float e = 10.0F;
		float f = 3.0F;
		
		System.out.println(c/d);	// 3
		System.out.println(d/c);	// 0
				
		System.out.println(e/f);	// 3.3333333
		System.out.println(c/f);	// 3.3333333
		
		
		
	}

}
