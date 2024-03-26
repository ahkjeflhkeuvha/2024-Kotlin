fun main() {
    var a : Any = 1
    println("a : $a type is ${a.javaClass}")

    a = 300L
    println("a : $a type is ${a.javaClass}")

    checkType("today")
    checkType(1234)
    checkType(1234567891234)
    checkType(1234f)
}

fun checkType(x:Any){ // 업 캐스팅
    if(x is String) println("x is String : $x") // 다운 캐스팅
    else if(x is Int) println("x is Int : $x")
    else println("x is ${x.javaClass} : $x")
}

// any는 모든 타입 가능 -> byte, short, int, long, float, double, char, string