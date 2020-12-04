  
# 3주차 과제
## 목표
자바가 제공하는 다양한 연산자를 학습하세요. 

## 학습할 것 
산술 연산자 
비트 연산자 
관계 연산자 
논리 연산자 
instanceof 
assignment(==) operator 
화살표 (->) 연산자 
3항 연산자 
연산자 우선 순위 
(optional) Java 13, switch operator 

----
#### 산술 연산자

수학적 계산에 사용되는 연산자 


### 1. 산술연산자
산술 연산자는 모두 두 개의 피연산자를 가지는 이항 연산자이며, 피연산자들의 결합 방향은 왼쪽에서 오른쪽입니다.
| 산술 연산자| 의미 | 
|------|----       | 
|   +     |  더하기    | 
|   -     |  빼기   | 
|   *     |    곱하기     |
|   /     | 나누기  | 
|   <b>%     |  <b>나머지   |  

```
	System.out.println(10%3) // 1
	System.out.println(3%10) // 3
```
<br>

나머지 규칙성

```
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
```
<br>

```
	String a = "안녕";
	String b = "하세요";
	System.out.println(a + b); // 안녕하세요
```
문자열 + 문자열하면 문자열이 더해진다. <br><br>


```
		int c = 10;
		int d = 3;
		
		float e = 10.0F;
		float f = 3.0F;
		
		System.out.println(c/d);	// 3
		System.out.println(d/c);	// 0
				
		System.out.println(e/f);	// 3.3333333
		System.out.println(c/f);	// 3.3333333
```
정수와 정수가 나눠지면 소숫점 버린다
정수와 실수가 나눠지면 형변환해서 실수로 변한다
<br><br>
### 2. 비트 연산자(bitwise operator)
비트 연산자는 비트(bit) 단위로 논리 연산을 할 때 사용하는 연산자입니다. 
또한, 비트 단위로 전체 비트를 왼쪽이나 오른쪽으로 이동시킬 떄도 사용합니다.
| 비트 연산자| 설명| 
|------|----       | 
|   &     |  대응되는 비트가 모두 1이면 1을 반환함. (비트 AND 연산)| 
|  역슬래쉬(\|)   |  대응되는 비트 중에서 하나라도 1이면 1을 반환함. (비트 OR 연산)| 
|   ^     |    대응되는 비트가 서로 다르면 1을 반환함. (비트 XOR 연산)|
|   ~     | 비트를 1이면 0으로, 0이면 1로 반전시킴. (비트 NOT 연산)| 
|   <<    | 지정한 수만큼 비트들을 전부 왼쪽으로 이동시킴. (left shift 연산)| 
|   >>    | 부호를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴.(right shift 연산)| 
![비트 AND 연산](http://www.tcpschool.com/lectures/img_php_bitwise_and.png)

![비트 XOR 연산](http://www.tcpschool.com/lectures/img_php_bitwise_xor.png)

참고
<진리표>

[![](https://postfiles.pstatic.net/MjAyMDEyMDRfMTU5/MDAxNjA3MDcxODEwOTk5.OCkbdgtwztz5T9DeZqJNB26dkZsZEty2yZxL5gQKmIsg.QA5ksMMwvI_Il54N5sI_5U6jHDFIFTXlDcl6Thdvgbsg.PNG.swiniee/image.png?type=w773)](https://blog.naver.com/PostView.nhn?blogId=swiniee&Redirect=View&logNo=222162897352&categoryNo=36&isAfterWrite=true&isMrblogPost=false&isHappyBeanLeverage=true&contentLength=2988#)

<br>


### 3. 관계 연산자(comparison operator)
관계 연산자는 피연산자 사이의 상대적인 크기를 판단하는 연산자. 어느쪽이 큰지, 작은지, 같은지 판단. 
 <b>판단해서 같으면 참을 반환하는 구조이다.</b>
관계연산자는 모두 두 개의 피연산자를 가지는 이항 연산자이며, 피연산자들의 결합방향은 왼쪽에서 오른쪽이다.


| 관계 연산자| 이름 | 설명 |
|------|----  |------| 
|   ==     |  같음 | 양쪽 값이 같으면 참, 다르면 거짓 |
|   !=     |  같지않음   | 양쪽 값이 다르면 참, 같으면 거짓  |
|   >   |    보다 큼     | 왼쪽 값이 크면 참, 같거나 작으면 거짓  |
|   >=     | 보다 크거나 같음  | 왼쪽 값이 크거나 같으면 참, 작으면 거짓 |
|   <    | 보다 작음  | 왼쪽 값이 작으면 참, 크면 거짓 |
|   >=     | 보다 작거나 같음  | 왼쪽 값이 작거나 같으면 참, 작으면 거짓 |
|   instanceof         |   | 왼쪽 참조 변수 값이 오른쪽 참조 변수 타입이면 참, 아니면 거짓 |


<br>


```
char ch1 = 'a', ch2 = 'A';

System.out.println("== 연산자에 의한 결과: " + (ch1 == ch2)); // false
System.out.println("> 연산자에 의한 결과: " + (ch1 > ch2)); // true
```
아스키코드에서 'A'는 10진수 62를 나타내며, 'a'는 10진수 97을 나타낸다. 따라서 'a'가 더 크다.
<br>


### 4. 논리 연산자(logical operator)
논리 연산자는 주어진 논리식을 판단하여, 참(true)과 거짓(false)을 결정하는 연산자이다.
boolean 타입의 논리 값이다. 
!는 논리적인 부정을 뜻하며, true을 false로,  false를 true로 바꿔준다.

&&: 양쪽 피연산자 모두 true일 때 true를 반환하고 그 외의 경우는 false를 반환한다.

|| : 는 양쪽 피연산자 중 하나라도 true이면 true를 반환하고 그 외의 경우는 false를 반환한다.

```
boolean myTrue = true;
boolean myFalse = false;

if(myTrue & myFalse) -> false라 출력안됨
if(myTrue | myFalse) -> true라 출력됨
if(myTrue && myFalse) -> false라 출력안됨
if(myTrie || myFalse) -> true라 출력됨

```

&와 &&,  | 과 || 의 차이점은?
&&는 첫번째 조건이 참이 아니면 두번째 조건은 확인하지 않는다.
&는 첫번째 조건이 참이 아니어도 두번째 조건을 확인한다.

||는 첫번째 조건이 참이면 두번째 조건을 확인하지 않는다.
|는 첫번째 조건이 참이어도 두번째 조건을 확인한다.

### 5. instanceof
instanceof 연산자는 레퍼런스 변수가 참조하고 있는 인스턴스의 실제 타입을 반환해준다.
해당 객체가 어떤 클래스나 인터페이스로부터 생성되었는지를 판별해주는 역할
instanceof 연산자는 왼쪽 피연산자인 인스턴스가 오른쪽 피연산자인 클래스나 인터페이스로부터 생성되었으면 true를 반환하고, 그렇지 않으면 false를 반환합니다.

```java
class A {}
class B extends A{}
public static void main(String[] args){
	A a = new A();
	B b = new B();
	
	System.out.println(a instanceof A); // true
	System.out.println(b instanceof A); // true
	System.out.println(a instanceof B); // false
	System.out.println(b instanceof B); // true
}


```


### 6. assginment(=) operator
대입연산자!
변수에 값을 대입할 때 사용하는 이항 연산자이며, 피연산자들의 결합방향은 오른쪽에서 왼쪽이다.

| 대입 연산자| 설명| 
|------|----       | 
|  =     |  왼쪽의 피연산자에 오른쪽의 피연산자를 대입함.)| 
|  +=|  왼쪽의 피연산자에 오른쪽의 피연산자를 더한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.| 
| -=    |  왼쪽의 피연산자에서 오른쪽의 피연산자를 뺀 후, 그 결괏값을 왼쪽의 피연산자에 대입함.| 
|  *=     |  왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.| 
|  /=     |  왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 결괏값을 왼쪽의 피연산자에 대입함.| 
|  %=     |  왼왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 왼쪽의 피연산자에 대입함.| 
| &=     |  왼쪽의 피연산자를 오른쪽의 피연산자와 비트 AND 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.  
|  =     |  왼쪽의 피연산자를 오른쪽의 피연산자와 비트 OR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.| 
|  ^=     |  왼쪽의 피연산자를 오른쪽의 피연산자와 비트 XOR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.| 
|  <<=    |  왼쪽의 피연산자를 오른쪽의 피연산자만큼 왼쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.| 
|  >>=    |  왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호를 유지하며 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.| 
|  >>>=     |  왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호에 상관없이 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.| 

자기 자신에 대해 연산한 결과를 다시 자기 자신에 담는다.

'>>'과 >>>의 차이는, 오른쪽으로 비트 이동을 할 때 MSB값으로 채우느냐 무조건 0으로 채우느냐이다.
'>>' 이 연산의 경우 MSB 값으로 부족한 비트를 채우고, >>> 이 연산은 MSB 상관없이 무조건 0으로 값을 채워준다.
모든 비트 연산을 할 때, 밀려나는 비트는 전부 버려진다.
<br>

### 7. 화살표 ( -> ) 연산자
자바에 람다식이 도입되면서 등장한 연산자
기존의 익명 클래스 객체를 만드는대신 메소드(또는 함수)를 1급 시민으로 값으로 취급하여 전달할 수 있다.

```
(매개변수, ...) -> { 실행문 ...}
```


```java
new Thread(new Runnable() {  
   @Override  
  public void run() {   
      System.out.println("Welcome Heejin blog");   
 }  
}).start();
```

<br>

```java
new Thread(()->{  
      System.out.println("Welcome Heejin blog");  
}).start();
```
함수를 생략해서 전달
<br>

### 8. 3항 연산자
피연산자를 세개 가진다.
```
문법
조건식 ? 반환값1 : 반환값2
```
물음표(?) 앞의 조건식에 따라 참(true)이면 반환값 1을 반환하고, 결과값이 거짓(false)이면 반환값 2를 반환.

```java
int num1 = 5, num2 = 7;
int result;

result = (num1 - num2 > 0) ? num1 : num2;
System.out.println("두 정수 중 더 큰 수는 " + result + "입니다.");
```
결과: 두 정수 중 더 큰 수는 7입니다.
num - num2 > 0는 거짓이기 때문에 뒤에 부분 출력됨.
<br>

### 9. 연산자 우선순위

| 우선순위| 연산자| 
|------|----       | 
| 1| ( ),  [ ]      | 
| 2| !, ~, ++, --     | 
| 3| *, /, %     | 
| 4| +, -      | 
| 5| <<, >>, >>>      | 
| 6| <, <=, >, >=     | 
| 7|  ==, !=     | 
| 8| &      | 
| 9| ^     | 
| 10| 역슬래쉬     | 
| 11| &&      | 
| 12|    역슬래쉬역슬래쉬  | 
| 13| ? :     | 
| 14| 증감연산자(+=, -=, /=, &= ...), =      | 

<br>

### 10. (optional) Java 13. switch operator
switch문을 편하고 간략하게 쓰기 위해 만들어짐
java 12 쉼표를 사용하여 여러 case를 한 줄에 나열하는 거 가능해짐, 화살표를 사용하여 결과 반환(화살표 사용으로 break 사용하지 않아도 결과 반환 가능)
java 13부터 yield로 값반환하고 break하는 거 가능함
break : 그냥 나가는 것
yield : (break + 값 반환)
※ {}블록을 사용하여 추가 로직 수행 가능
```java
String result = switch(code){
	case 1:
		yield "1번";
	case 2:
		yield "2번";
	default:
		yield "디폴트";
};
```
