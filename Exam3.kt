fun main() {
    val num1 = 127
    val num2 = -32768
    val num3 = 9223372036854775807 // 자동으로 long 타입으로 추론

    println("num1 : $num1 , num2 : $num2 , num3 : $num3")

    val exp1 = 3.14
    val exp2 = 3.14F // float로 추론
    val exp3 = 3.14E-2 // double로 추론
    val exp4 = 3.14e2f

    println("exp1 : $exp1 , exp2 : $exp2 , exp3 : $exp3 , exp4 : $exp4")

}