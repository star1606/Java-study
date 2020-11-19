
# 2주차 과제
## 목표
자바의 프리미티브 타입, 변수 그리고 배열을 사용하는 방법을 익힙니다.

## 학습할 것
프리미티브 타입 종류와 값의 범위 그리고 기본 값
프리미티브 타입과 레퍼런스 타입
리터럴
변수 선언 및 초기화하는 방법
변수의 스코프와 라이프타임
타입변환, 캐스팅 그리고 타입 프로모션
1차 및 2차 배열 선언하기
타입 추론, var

----
### 프리미티브 타입 종류와 값의 범위 그리고 기본 값
Primitive type은 총 8가지이다

| 종류 | 이름|크기| 기본값|  범위| 
|------|----|---|--| :-------:| 
|   논리형     |  boolean |  1byte   |  false  |   true, false      |     
|   정수형     |  byte   | 1byte  |   0  |   -128 ~ 127     |
|   정수형     |  short    | 2byte |  0   |    -32,768 ~ 32,767    |  
|   정수형     |  int    | 4byte |   0  |   -2,147,483,648 ~ 2,147,483,647  (21억)   |  
|   정수형     |  long| 8byte  |  0L   |     -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807   |  
|   실수형     | float    | 4byte  |   0.0F  |     (3.4 X 10^-38) ~ (3.4 X 10^38)   |  
|   실수형     | double    | 8byte  |  0.0   |   (1.7 X 10^-308) ~ (1.7 X 10^308)     |  
|   문자형     |  char   |  2byte |  '\u0000'   |  0 ~ 65,535      |  

1bit : 2
1byte: 2^8  (256)



#### 프리미티브 타입
8가지 타입이 있다.
- 기본 값이 있기 때문에 Null이 존재하지 않는다 기본형 타입에 Null을 넣고 싶으면 래퍼 클래스를 활용한다.
- 실제 값을 저장하는 공간으로 스택(Stack) 메모리에 저장됨
- 컴파일 시점에 담을 수 있는 크기를 벗어나면 에러를 발생시키는 컴파일 에러가 발생한다. 

#### 레퍼런스 타입(Reference type)
- 프리미티브 타입을 제외한 타입들이다
- 빈 객체. Null이 존재한다, 기본 값이 Null
- 값이 저장되어 있는 곳의 <b>주소값</b>을 저장하는 공간으로 <b>힙(Heap) 메모리</b>에 저장된다.
- 문법상으로는 에러가 없지만 실행시켰을 때 에러가 나는 런타임 에러가 발생한다. 객체나 배열을 Null 값으로 받으면 <b>NullPointException</b>이 발생하므로 변수 값을 넣어야한다!


#### 리터럴
상수: 바꿀 수 없는 변수
리터럴: 변수 및 상수에 저장되는 값 자체
리터럴은 변수에 넣는 변하지 않는 데이터를 의미한다
변수나 상수는 메모리에 할당된 공간이고 리터럴은 공간에 저장되는 값이다.
ex) int a = 1;
여기서 1은 리터럴이다.(프리미티브 타입도 리터럴이다)
String은 객체 리터럴이라고 하는데  "Hello World"와 같은 문자열은 한 번 생성하면 변하지 않기 때문에 리터럴이라고 부른다


####   변수 선언 및 초기화하는 방법
1. 변수선언
	- long a; (long형 변수 a를 선언함. 메모리에 8byte 할당)
2. 변수 초기화
	a. 프리미티브 타입 long a = 1;
	b. 레퍼런스 타입 A a = new A();

####   변수의 스코프와 라이프타임
1. 멤버변수(전역변수)
	- 클래스 전역에서 유효하다
	```java 
	public class Hello {
		int a = 1;
		public static void main(String[] args) {
			Hello hello = new Hello();
			System.out.println(hello.a); // 1
		}
	}
	```
2. 메소드 변수(지역변수)
	- 메소드 내에서만 유효하다
	 ```java public class Hello {
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
	```

둘 다 유효할 때는 메소드 변수가 우선한다
````java
public class Hello {

		int a = 1;
		int c = 3;

		public static void main(String[] args) {
			Hello hello = new Hello();
			System.out.println(hello.a); // 1
			
			int b = 2;
			System.out.println(b); // 2
			int c = 4;
			System.out.println(c); // 4
			}
		} 
 ````