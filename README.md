Learning Kotlin
===============

**인프런 강좌와 백준 Java 코드를 Kotlin 으로 코딩하며 학습**

출처 : https://www.inflearn.com/course/%EC%BD%94%ED%8B%80%EB%A6%B0-%EA%B0%95%EC%A2%8C-%EC%83%88%EC%B0%A8%EC%9B%90/

Basic Syntax
------------

1.	패키지 정의

	-	패키지 정의는 파일 최상단에 위치
	-	디렉터리와 패키지를 일치시키지 않아도 됨

2.	함수 정의

	-	함수는 **fun** 키워드로 정의
	-	함수 몸체가 식(expression)인 경우 return 생략 가능
	-	**fun** sum(a: Int, b: Int) = a + b // 이런 경우 return type 이 추론 됨
	-	리턴할 값이 없는 경우 Unit(Object)으로 리턴
	-	**fun** printKotlin(): Unit { println("hello world") }
	-	Unit은 Java에서 Void 리턴 역할, Unit은 생략 가능
	-	**fun** printKotlin(): { println("hello world") }

3.	지역 변수 정의

	-	val : 읽기 전용 변수
	-	값의 할당이 1회만 가능, **Java**의 **final**과 유사
	-	val a: Int = 1 // 즉시 할당
	-	val b = 2 // 'Int' type 추론
	-	val c: Int // 컴파일 오류, 초기화가 필요
	-	c = 3 // 컴파일 오류, 읽기 전용
	-	val : Mutable 변수 ( ex : var x = 5 // x += 1 )

4.	주석

	-	Java 와 Javascript 와 동일
	-	// : 한 줄 주석
	-	/* */ : 여러 줄 주석 (block comment)
	-	block comment 가 Java 와 다르게 중첩 허용됨

