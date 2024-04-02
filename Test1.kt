package chapter2

fun main(){
    print("점수를 입력해주세요 > ")
    val score = readLine()!!.toInt()
    val result = if(score in 1..100){
        if(score >= 90) {
            "A"
        } else if(score >= 80) {
            "B"
        } else if(score >= 70) {
            "C"
        } else if(score >= 60) {
            "D"
        } else {
            "F"
        }
    }
    else {
        "점수를 잘못 입력하셨습니다"
    }

    println(result)
}