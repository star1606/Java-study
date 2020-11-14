# 1주차 과제
## 목표
자바 소스 파일(.java)을 JVM으로 실행하는 과정 이해하기.
학습할 것
JVM이란 무엇인가
컴파일 하는 방법
실행하는 방법
바이트코드란 무엇인가
JIT 컴파일러란 무엇이며 어떻게 동작하는지
JVM 구성 요소
JDK와 JRE의 차이


## JVM이란?

Java Virtual Machine :  Java Byte Code를 OS에 맞게 해석 해주는 역할.

java compiler : .java → .class (Java Byte Code)

java Compiler (javac 명령어)

Byte Code는 기계어가 아니기 때문에 OS에서 바로 실행되지 않음 이 때 JVM이 OS가 Byte Code를 이해할 수 있도록 해석함. 느리지만 JIT Compiler를 구현해 극복함
(../image/Untitled(14).png)
![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/af78c528-34fa-462c-ad74-b5014e0cae68/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/af78c528-34fa-462c-ad74-b5014e0cae68/Untitled.png)

## 컴파일 하는 방법

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f9bc54ac-2d3d-48ad-86ad-8ef8a658bfe7/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f9bc54ac-2d3d-48ad-86ad-8ef8a658bfe7/Untitled.png)

java comiler(javac명령어)가 .java를 .class로 바이트코드로 바꿈(기계어 아님)

이렇게 생성된 자바 바이트 코드(.class)는 클래스 로더에 의해서 JVM내로 로드 되고, 실행엔진에 의해 기계어로 해석되어 메모리 상(Runtime Data Area)에 배치되게 됩니다. 실행엔진에는 Interpreter와 JIT(Just-In-Time) Compiler가 있습니다. Interpreter는 바이트 코드를 한줄씩 읽기 때문에 실행이 느린 단점이 있었습니다. 이러한 단점을 보완하기 위해 나온 것이 JIT Compiler 입니다. 인터프리터 방식으로 실행을 하다가 적절한 시점에 바이트 코드 전체를 컴파일 하고 더이상 인터프리팅 하지않고 해당 코드를 직접 실행 하는 것 입니다. JIT Compiler에 의해 해석된 코드는 캐시에 보관하기 때문에 한 번 컴파일 된 후에는 빠르게 수행하는 장점이 있습니다. 하지만 인터프리팅 방식보다는 훨씬 오래 걸리므로 한번만 실행하면 되는 코드는 인터프리팅 하는 것이 유리합니다.



![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f73f1c31-a241-4cb9-b9d6-e6094ccc2e8a/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f73f1c31-a241-4cb9-b9d6-e6094ccc2e8a/Untitled.png)

## 실행하는 방법

.class가 클래스 로더에 의해 JVM내로 로드되고

실행엔진이 바이트코드를 기계어로 해석함

실행엔진에는 InterPreter와 JIT Compiler가 있음

바이트코드를 기계어로 해석하고 JVM이 자바 프로그램 실행 → JVM이 OS위에 있고 프로그램을 실행시킨다

JVM은 운영체제에 종속적

## 바이트 코드란?

자바 바이트 코드(Java bytecode)란 자바 가상 머신이 이해할 수 있는 언어로 변환된 자바 소스 코드를 의미합니

### JIT 컴파일러는 무엇이며 어떻게 동작하는지?

  Runtime중에 필요에 따라 바이트코드를 기계어로 번역함

실행엔진을 통해서 JIT compiler 실행

### JVM 구성요소

class Loader : RunTime 시점에 클래스를 로딩하게 해주며 클래스의 인스턴스를 생성하면 클래스 로더를 통해 메모리에 로드하게 됩니다.

Runtime Data Areas : 메모리 공간

실행엔진으로 구분되어있음

### JRE, JDK 차이


![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5b569650-a94b-4a18-9509-c67e8c496455/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5b569650-a94b-4a18-9509-c67e8c496455/Untitled.png)

JDK : JRE + 개발, 디버깅 툴

JRE : JVM + java 패키지 클래스 (유틸리티, math, lang, awt, swing) + 런타임 라이브러리

JVM : 클래스 로더 + 런타임 데이터 영역 + 실행 엔진

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e5c8d008-3149-4a93-9338-3e8ddf88c795/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e5c8d008-3149-4a93-9338-3e8ddf88c795/Untitled.png)

### 느낀점

자바를 쓰면서 어렴풋이만 들었던 개념들을 직접 검색해보니 구조를 이해하는데 많은 도움이 되었습니다.

다른 분들이 해온 과제들을 살펴보면서 정말 저보다 훨씬 정리를 잘하셔서 잘 참고할 수 있었습니다.

저는 개념을 익히면서 완벽하진 않지만 제 나름대로 요약해서 간략하게 정리해봤습니다.

감사합니다 :)
