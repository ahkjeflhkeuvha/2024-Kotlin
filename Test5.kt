package chapter2

fun main() {
    print("점수 입력 >> ")
    var score = readln().toDouble()

    print("Score : $score")
    when(score) {
        in 90.0..100.0 -> println(" Grade : A")
        in 80.0..89.9 -> println(" Grade : B")
        in 70.0..79.9 -> println(" Grade : C")
        in 60.0..69.9 -> println(" Grade : D")
        else -> println(" Grade : F")
    }

    print("Score : $score")
    when(score.toInt()/10){
        9 -> println(" Grade : A")
        8 -> println(" Grade : B")
        7 -> println(" Grade : C")
        6 -> println(" Grade : D")
        else -> println(" Grade : F")
    }
}