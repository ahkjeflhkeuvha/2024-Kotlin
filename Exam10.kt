fun main() {
    var num1 = 10
    var num2 = 10
    var result1 = ++num1
    var result2 = num2++

    println("num1 : ${num1}")
    println("num2 : ${num2}")
    println("result1 : ${result1}")
    println("result2 : ${result2}")

    var number1 = 12
    var number2 = 25

    println(number1 > 20 || number2 > 20)
    println(number1 or number2) //비트연산 00011101

    println(number1 and number2) //비트연산 00001000
    println(number1 > 20 && number2 > 20)

    println(number1 xor number2) //비트연산 00010101
}
