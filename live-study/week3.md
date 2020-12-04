
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

<br>

### 3. 관계 연산자(comparison operator)
관계 연산자는 피연산자 사이의 상대적인 크기를 판단하는 연산자. 어느쪽이 큰지, 작은지, 같은지
