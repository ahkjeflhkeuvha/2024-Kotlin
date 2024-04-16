package chapter2

fun sum5(a:Int, b:Int):Int {
    var sum = 0
    fun calSum(){
        for(i in a..b) sum += i
    }
    calSum()
    return sum
}

fun main() {
    print("시작 값 입력 > ")
    var a = readln().toInt()

    print("종료 값 입력 > ")
    var b = readln().toInt()

    print(sum5(a, b))
}