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

11.	Inflearn.ranges

	-	In 연산자를 이용해서 숫자 법위를 체크 가능

12.	Inflearn.collections

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

Control Flow
------------

1.	if else 문

	-	Java 와 거의 유사함
	-	if 문이 식으로 사용되는 경우 값을 반환함
	-	if 식의 경우 반드시 else 를 동반해야 함
	-	if 식의 branches 들이 블록을 가질 수 있음
	-	블록의 마지막 구문이 반환 값이 됨
	-	삼항연산자(ternary) 가 없음
		-	if 문이 삼항연산자 역할을 잘 해내기 때문

2.	When

	-	when 문은 C 계열 언어의 switch 문을 대체함
	-	when 문은 각각의 branches 의 조건문이 만족할 때 까지 위에서 부터 순차적으로 인자를 비교함
	-	when 문이 식으로 사용된 경우에는 조건을 만족하는 branch 의 값이 전체 식의 결과 값이 됨
	-	else 의 경우 다른 branch 들의 조건이 만족되지 않을 때 수행 됨
	-	when 이 식으로 사용된 경우 else 문이 필수
	-	when 이 식으로 사용된 경우 컴파일러가 else 문이 없어도 된다는 것을 입증할 수 있는 경우에는 else 를 생략 가능
	-	여러 조건들이 같은 방식으로 처리될 수 있는 경우, branch 의 조건문에 콤마(,) 를 사용하여 표기하면 됨
	-	branch 의 조건문에 함수나 식을 사용할 수 있음
	-	range 나 collection 에 in 이나 !in 으로 범위 등을 검사할 수 있음
	-	is 나 !is 를 이용하여 타입도 검사 할 수 있음
		-	이 때 스마트 캐스트가 적용됨
	-	when 은 if-else if 체인을 대체할 수 있음
	-	when 에 인자를 입력하지 않으면, 논리연산으로 처리됨

3.	for loops

	-	for 문은 iterator 을 제공하는 모든 것을 반복할 수 있음
	-	for 문의 body 가 블록이 올 수 도 있음
	-	for 문을 지원하는 iterator 의 조건
		-	멤버함수나 확장함수 중에
			-	iterator() 를 반환하는 것이 있는 경우
				-	next() 를 가지는 경우
				-	hasNext(): Boolean 를 가지는 경우
			-	위의 3 함수는 operator 로 표기 되어야 함
	-	배열이나 리스트를 반복할 때, index를 이용하고 싶다면 indices 를 이용하면 됨
	-	index 를 이용하고 싶을 때, withIndex() 를 이용할 수도 있음

4.	while loops

	-	while, do-while 문은 Java 와 거의 같음
	-	do-while 문에서 body 의 지역변수를 do-while 문의 조건문이 참조 할 수 있음

Packages Return and Jumps
-------------------------

1.	Package

	-	소스 파일은 패키지 선언으로 시작 됨
	-	모든 콘텐츠(클래스, 함수, ..) 는 패키지에 포함 됨
	-	패키지를 명세하지 않으면 이름이 없는 기본 패키지에 포함 됨

2.	기본 패키지

	-	기본으로 import 되는 package 가 있음
	-	플랫폼 별로 import 되는 package 도 다른 부분도 있음
		-	kotlin.* / kotlin.annotation.* / kotlin.Inflearn.collections.* / kotlin.comparisons.* ( since 1.1) / kotlin.io.* / kotlin.Inflearn.ranges.* / kotlin.sequences.* / kotlin.text.\*
		-	JVM : java.lang.* / kotlin.jvm.\*
		-	JS : kotlin.js.\*

3.	Import

	-	기본으로 포함되는 패키지 외에도, 필요한 package 들을 직접 import 할 수 있음
	-	foo.Bar / bar.Bar 처럼 이름이 충돌 나는 경우 'as' 키워드로 로컬 리네임 가능 (import bar.Bar as bBar)

4.	3가지 Jump 표현식

	-	return : 함수나 익명 함수에서 반환
	-	break : 루프를 종료
	-	continue : 루프의 다음 단계로 직행

5.	label 로 break and continue

	-	label 표현 : label@, abc@, fooBar@
		-	식별자 + @ 형태로 사용
	-	label 로 return
		-	코틀린에서 중첩 될 수 있는 요소들
			-	함수 리터럴 (function literals)
			-	지역함수 (local function)
			-	객체 표현식 (object expression)
			-	함수 (function)
		-	람다식에서 return 할 때 주의사항
			-	람다식에서 return 시 nearest enclosing 함수가 return 됨
			-	람다식에 대해서만 return 하려면 label 을 이용해야
		-	암시적 label
			-	람다식에서만 return 하는 경우 label 을 이용해서 return 해야 함
			-	직접 label 을 사용하는 것 보다 암시적 label 이 편리
			-	암시적 label 은 람다가 사용된 함수의 이름과 동일함
		-	label return 시 값을 반환할 경우
			-	return@label 1 형태로 사용
			-	return + @label + 값

Classes and Inheritance
-----------------------

1.	Class

	-	Class 는 class 키워드로 선언
		-	Class 이름
		-	Class 헤더 ( 형식 매개변수, 기본 생성자 등 )
		-	Class 바디 ( 중괄호 {} )
	-	헤더와 바디는 옵션이고, 바디가 없으면 {} 도 생략가능

2.	기본 생성자

	-	Class 별로 1개만 가질 수 있음
	-	Class 헤더의 일부
	-	Class 이름 뒤에 작성
	-	어노테이션이나 접근지정자가 없을 때는, 기본 생성자의 Constructor 키워드를 생략 가능
	-	기본 생성자는 코드를 가질 수 없음
		-	초기화는 초기화(init) 블록 안에서 작성해야 함
		-	초기화 블록은 init 키워드로 작성
	-	기본 생성자의 파라미터는 init 블록 안에서 사용 가능
	-	기본 생성자의 파라미터는 property 초기화 선언에도 사용 가능
	-	property 선언 및 초기화는 기본 생성자에서 간결한 구문으로 사용 가능
	-	기본 생성자에 어노테이션 접근 지정자 등이 있는 경우 Constructor 키워드가 필요함

3.	보조 생성자

	-	Class 별로 여러 개를 가질 수 있음
	-	Constructor 키워드로 선언
	-	Class 가 기본 생성자를 가지고 있다면, 각각의 보조 생성자들은 기본 생성자를 직접 or 간접적으로 위임해 주어야 함
	-	this 키워드를 이용
		-	직접적 : 기본 생성자에 위임
		-	간접적 : 다른 보조 생성자에 위임

4.	생성된(Generated) 기본 생성자

	-	Class 에 기본 생성자 or 보조 생성자를 선언하지 않으면, 생성된 기본 생성자가 만들어짐
	-	Generated Primary Constructor
		-	매개변수가 없음
		-	가시성이 public 임
	-	만약 생성된 기본 생성자의 가시성이 public 이 아니어야 한다면, 다른 가시성을 가진 빈 기본 생성자를 선언해야 함

5.	인스턴스 생성

	-	코틀린은 new 키워드가 없음
	-	객체를 생성하려면 생성자를 일반 함수처럼 호출하면 됨

6.	클래스 멤버

	-	클래스는 아래의 것들을 포함 할 수 있음
		-	Constructors and initializer blocks
		-	Functions
		-	Properties
		-	Nested and Inner Classes
		-	Object Declarations

7.	상속

	-	Kotlin 의 최상위 클래스는 Any
	-	클래스에 상위 타입을 선언하지 않으면 Any 가 상속됨
		-	<b>class</b> Example1 // 암시적 Any 상속
		-	<b>class</b> Example2: Any() // 명시적 Any 상속
	-	Any 는 java.lang.Object 와는 다른 클래스
		-	equals(), hashCode(), toString() 만 있음
	-	명시적으로 상위타입을 선언하려면, 클래스 헤더의 클론(: ) 뒤에 상위 타입을 선언
		-	**open class** Base(p: Int)
		-	**class** Derived(p: Int): Base(p)
	-	파생 클래스에 기본 생성자가 있으면, 파생클래스의 기본 생성자에서 상위 타입의 생성자를 호출에서 초기화할 수 있음
	-	파생 클래스에 기본 생성자가 없으면, 각각의 보조 생성자에서 상위 타입을 super 키워드를 이용해서 초기화 해주어야 함 또는 다른 생성자에게 상위 타입을 초기화 할 수 있게 위임 해주어야 함
	-	open 어노테이션은 Java 의 final 과 반대
	-	open class 는 다른 클래스가 상속할 수 있음
	-	기본적으로 Kotlin 의 모든 class 는 final (이유는 Effective Java, Item 17 : Design and document for inheritance or else prohibit it.)
		-	**open class** Base(p: Int)
		-	**class** Derived(p: Int): Base(p)

8.	메소드 오버라이딩

	-	오버라이딩 될 메소드
		-	open 어노테이션이 요구됨
	-	오버라이딩 된 메소드
		-	override 어노테이션이 요구됨

9.	프로퍼티 오버라이딩

	-	메소드 오버라이딩과 유사한 방식으로 오버라이딩 가능

10.	오버라이딩 규칙

	-	같은 멤버에 대한 중복된 구현을 상속받은 경우, 상속받은 클래스는 해당 멤버를 오버라이딩하고 자체 구현을 제공해야 함
	-	super + <클래스명> 을 통해서 상위 클래스를 호출 할 수 있음

11.	추상 클래스

	-	abstract 멤버는 구현이 없음
	-	abstract 클래스나 멤버는 open 이 필요 없음

Properties and Fields
---------------------

1.	프로퍼티 선언

	-	Kotlin 클래스는 프로퍼티를 가질 수 있음
		-	var (mutable) / val (read-only)
	-	프로퍼티 사용은 자바의 필드를 사용하듯이 하면 됨

2.	프로퍼티 문법

	-	전체 문법

		-	**var** <propertyName> \[: <propertyType>] [=<property_initializer>\]
			-	\[<getter>\]
			-	\[<setter>\]

	-	옵션 (생략가능)

		-	propertyType
			-	property_initializer 에서 타입을 추론 가능한 경우 생략가능
			-	property_initializer
			-	getter
			-	setter

	-	var (mutable) 프로퍼티

	-	val (read-only) 프로퍼티

		-	setter 가 없음

	-	Custom accessors (getter, setter)

		-	Custom accessors 는 프로퍼티 선언 내부에, 일반 함수처럼 선언 할 수 있음
		-	getter
		-	setter
			-	관습적으로 setter 의 파라미터의 이름은 value (변경가능)

	-	타입생략

		-	Kotlin 1.1 부터는 getter 를 통해 타입을 추론 할 수 있는 경우, 프로퍼티의 타입을 생략 할 수 있음

3.	프로퍼티

	-	accessor 에 가시성 변경이 필요하거나 accessor 에 어노테이션이 필요한 경우, 기본 accessor 의 수정 없이 body 없는 accessor 를 통해 정의 가능 (body를 작성해 주어도 됨)

4.	Backing Fields

	-	Kotlin 클래스는 field 를 가질 수 없음
	-	'field' 라는 식별자를 통해 접근할 수 있는 automatic backing field 를 제공
	-	field 는 프로퍼티의 accessor 에서만 샤용가능
	-	Backing Fields 생성 조건
		-	accessor 중 1개라도 기본 구현을 사용하는 경우
		-	custom accessor 에서 field 식별자를 참조하는 경우

5.	Backing Properties

	-	'implicit backing field' 방식이 맞지 않는 경우에는 'backing property' 를 이용할 수도 있음

6.	Compile-Time Constants

	-	Const modifier 를 이용하면 컴파일 타임 상수를 만들 수 있음
		-	이런 프로퍼티는 어노테이션에서도 사용 가능
	-	조건
		-	Top-Level 이거나, Obejct 의 멤버이거나, String 이나 프리미티브 타입으로 초기화된 경우

7.	Late-Initialized Properties

	-	일반적으로 프로퍼티는 non-null 타입으로 선언됨
	-	간혹 non-null 타입 프로퍼티를 사용하고 싶지만, 생성자에서 초기화를 해줄 수 없는 경우가 있음
		-	Dependency injection
		-	Butter Knife
		-	Unit test 의 setup 메소드
	-	객체가 constructor 에서는 할당되지 못하지만 여전히 non-null 타입으로 사용하고 싶은 경우, Lateinit modifier 를 사용가능
	-	조건
		-	클래스의 바디에서 선언된 프로퍼티만 가능
		-	기본 생성자에서 선언된 프로퍼티는 안 됨
		-	var 프로퍼티만 가능
		-	custom accessor 이 없어야 함
		-	non-null 타입이어야 함
		-	프리미티브 타입이면 안 됨
	-	lateinit 프로퍼티가 초기화 되기 전에 접근되면, 오류가 발생
		-	kotlin.UninitializedPropertyAccessException: lateinit property tet has not been initialized
