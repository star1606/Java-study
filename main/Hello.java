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
	}
}
