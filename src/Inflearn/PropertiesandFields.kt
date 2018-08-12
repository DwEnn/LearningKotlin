package Inflearn

import jdk.nashorn.internal.objects.annotations.Setter


/*
    Compile-Time Constants
 */

const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

@Deprecated(SUBSYSTEM_DEPRECATED)
fun foo() {
    // ..
}

fun main(args: Array<String>) {

    // 프로퍼티 문법
    var obj = Address()
    println(obj.name)

}

/*
    프로퍼티 선언
 */

class Aa {
    var name: String = "Kotlin"
    var city: String = "Seoul"
}

fun copyA(a: Aa): Aa {
    val res  = Aa()
    res.name = a.name
    return res
}

/*
    프로퍼티 문법
 */

class Address {
    var name: String = "Kotlin"
//        get() { return field + "!!" }
        get() { return field }
        set(value) { field = value }
}

// 두 Address 코드는 거의 같음
class Address1 {
    var name = "Kotlin"
}

class Address2 {
    // default getter 와 setter
    // 타입은 Int
    var init = 1

    // error : 오류 발생
     // default getter 와 setter 를 사용한 경우
     // 명시적인 초기화가 필요함
//    var allByDefault: Int?
}

class Address3 {
    // default getter
    // 타입은 Int
    val init = 1

    // error: 오류 발생
     // default getter
     // 명시적인 초기화가 필요
//    val allByDefault: Int?
}

// Custom accessor
class Address4 {
    private val size = 1
    val isEmpty: Boolean
        get() = this.size == 0
    var strRep: String
        get() = this.toString()
        set(value) {

        }
}

// 타입 생략
class Address5 {
    val size = 0
    val isEmpty: Boolean
        get() = this.size == 0
    val isEmpty1
        get() = this.size == 0
}

// 프로퍼티
class Address6 {
    var setterVisible: String = "abc"
        private set
    var setterWithAnnotation: Any? = null
//        @Inject set
    var setterVisible1: String = "abc"
        private set(value) {
            field = value
        }
}

/*
    Backing Fields
 */

class Address7 {
    // the initializer value is written directly
    // to the backing field
    var counter = 0
        set(value) {
            if (value >= 0) field = value
        }

    // Backing Field 생성
    val isEmpty = false
        get() { return field }
    // Backing Field 없음
    val isEmpty1
        get() = this.toString().equals("Any")
}

/*
    Backing Properties
 */

class Address8 {
    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null)
                _table = HashMap()
            return _table ?: throw AssertionError("null")
        }
}

/*
    Late-Initialized Properties
 */

class Address9 {
    lateinit var subject: String

    fun setUp() {
        subject = this.toString()
    }
}

    // 불가능, val 인 경우도 안 됨
//class Address9(lateinit subject : String) {
//
//    fun setUp() {
//        subject = this.toString()
//    }
//}

