package main;

public class Hello {

	int a = 1;
	int c = 3;

	public static void main(String[] args) {
		Hello hello = new Hello();
		System.out.println(hello.a); // 1
		
		int b = 2;
		System.out.println(b); // 2
		int c = 4;
		System.out.println(c);
		
		
		// 묵시적 형변환
		double e = 100000.0;
		byte f = 100;
		
		e = f;
		System.out.println(e);
		
		// 명시적 형변환
		long g = 10000;
		byte h = 100;
		
		h = (byte)g;
		
		System.out.println("h: " + h);

		
		// 배열 선언과 할당
		int[] arr = new int[5];
		
		System.out.println(arr[0]);
		System.out.println(arr.length);
		arr[0] = 1;
		
	}
}
