package chapter2

fun main() {
    while(true){
        print("데이터 타입 선택 (1:int, 2:String, 3:종료) > ")
        var dType = readln().toInt()
        if(dType == 3) {
            println("종료합니다")
            break
        }

        var n:Any
        if(dType == 1) {
            print("Int 데이터 입력 > ")
            n = readln().toInt()
        }
        else if (dType == 2) {
            print("String 데이터 입력 > ")
            n = readln().toString()
        }
        else n = "other"

        when(n) {
            in 1..100 -> println("Int")
            "dog", "cat" -> println("String")
            !is String -> println("Not String")
            else -> println("입력 오류! 다시 선택하세요")
        }
    }
}