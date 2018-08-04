Learning Kotlin
===============

출처 : https://www.inflearn.com/course/%EC%BD%94%ED%8B%80%EB%A6%B0-%EA%B0%95%EC%A2%8C-%EC%83%88%EC%B0%A8%EC%9B%90/

Basic Syntax
------------

**1. 패키지 정의**

```
-   패키지 정의는 파일 최상단에 위치
-   디렉터리와 패키지를 일치시키지 않아도 됨
```

**2. 함수 정의**

```
-   함수는 **fun** 키워드로 정의
-   함수 몸체가 식(expression)인 경우 return 생략 가능
-   **fun** sum(a: Int, b: Int) = a + b // 이런 경우 return type 이 추론 됨
-   리턴할 값이 없는 경우 Unit(Object)으로 리턴
-   fun printKotlin(): Unit { println("hello world") }
-   Unit은 Java에서 Void 리턴 역할, Unit은 생략 가능
```

\**3. \*\*
