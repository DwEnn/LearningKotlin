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
	-	함수 몸체가 식(expression)인 경우 return 생략 가능(이 경우 return type 이 추론 됨)
	-	리턴할 값이 없는 경우 Unit(Object)으로 리턴
	-	Unit은 Java에서 Void 리턴 역할, Unit은 생략 가능

3.	지역 변수 정의

	-	val : 읽기 전용 변수
	-	값의 할당이 1회만 가능, **Java**의 **final**과 유사
	-	val a: Int = 1 // 즉시 할당
	-	val : Mutable 변수 ( ex : var x = 5 // x += 1 )

4.	주석

	-	Java 와 Javascript 와 동일
	-	// : 한 줄 주석
	-	/* */ : 여러 줄 주석 (block comment)
	-	block comment 가 Java 와 다르게 중첩 허용됨

5.	문자열 템플릿

	-	Striong Interpolation (문자열 보간법)

6.	조건문

	-	조건식으로 사용 가능

7.	Nullable

	-	값이 null 일 수 있는 경우 타입에 nullable 마크를 명시 해야 함
	-	nullable 타입의 변수를 접근 할 때는 반드시 null 체크를 해야 함
	-	그렇지 안으면 컴파일 오류가 발생

8.	자동 타입 변환

	-	타입 체크만 해도 자동으로 타입 변환이 됨

9.	While Loop

	-	Java 와 같음

10.	When expression

	-	switch case 와 비슷

11.	ranges

	-	In 연산자를 이용해서 숫자 법위를 체크 가능

12.	collections

	-	collection 도 in 으로 loop 가능
	-	in 으로 해당 값이 collection 에 포함되는지 체크 가능

Basic Types
-----------

1.	기본 타입

	-	Kotlin 에서 모든 것은 객체
	-	모든 것에 멤버 함수나 프로퍼티를 호출 가능하다는 의미에서 ..

2.	숫자 (Numbers)

	-	Java 의 숫자형과 거의 비슷하게 처리
	-	Kotlin 에서 Number 는 클래스, Java 의 Primitive Type 에 직접 접근 할 수 없음
	-	Java 에서 숫자형이던 char 가 Kotlin 에서는 숫자 형이 아님

3.	리터럴 (Literal)

	-	10 진수 : 123 (Int, Short)
	-	Long : 123L
	-	Double : 123.5, 123.5e10
	-	Float : 123.5f
	-	2진수 : 0b00001011
	-	8진수 : 미지원 ( Java : int I = 017; )
	-	16진수 : 0X0F

4.	Underscores in numberic literals(since 1.1)

5.	Representation

	-	Java 플랫폼에서 숫자형은 JVM Primitive Type 으로 저장됨
	-	Nullable 이나 제네릭의 경우는 Boxing 됨
	-	Boxing 된 경우 identity 를 유지 하지 않음

6.	Explicit conversions

	-	작은 타입은 큰 타입의 하위 타입이 아님, 즉 작은 타입에서 큰 타입으로의 대입이 안 됨

7.	문자 (Characters)

	-	Char 는 숫자로 취급 되지 않음

8.	배열

	-	배열은 Array 클래스로 표현
	-	get, set ([] 연산자 오버로딩 됨)
	-	size 등 유용한 멤버 함수 포함

9.	배열 생성

	-	Array 의 팩토리 함수를 이용
	-	arrayOf() 등의 라이브러리 함수 이용

10.	특별한 Array 클래스

	-	Primitive 타입의 박싱 오버헤드를 없애기 위한 배열
	-	IntArray, ShortArray, IntArray
	-	Array 를 상속한 클래스들은 아니지만, Array 와 같은 메소드와 프로퍼티를 가짐
	-	size 등 유용한 멤버 함수 포함

11.	문자열

	-	문자열은 String 클래스로 표현
	-	String 은 Characters 로 구성됨
	-	s[i] 와 같은 방식으로 접근 가능 (immutable 이므로 변경 불가)

12.	문자열 리터럴

	-	escaped string ("Kotlin")
		-	전통적인 방식으로 Java String 과 거의 비슷
		-	Backslash 를 사용하여 escaping 처리
	-	raw string ("""Kotlin""")
		-	escaping 처리 필요 없음
		-	개행 이나 어떠한 문자 포함 가능
