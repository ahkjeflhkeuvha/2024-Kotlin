package chapter2

fun sum(a:Int, b:Int) = a+b

fun main() {
    print("정수 입력 > ")
    var a = readln().toInt()

    print("정수 입력 > ")
    var b = readln().toInt()

    println("두 수의 합 = ${sum(a, b)}")
}