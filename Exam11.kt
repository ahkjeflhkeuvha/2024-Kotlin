lateinit var name1:String
lateinit var name2: String

fun main() {
    var result = 5
    if(result !in 1..3){
        println("1~3 아님")
    }
    else {
        println("1~3임")
    }

    name1 = "오지은"
    name2 = name1

    if(name1 === name2) println(name1)
    else println("주소가 다릅니다.")

    val data1: Int = 10
    val data2: Int = 10
    println("data1 == data2 : ${data1==data2}" )
    println("data1 === data2 : ${data1 === data2}")

    println()
    val int1 = Integer(10)
    val int2 = Integer(10)
    val int3 = int1
    println("int1 == int2 is ${int1 == int2}")
    println("int1 === int2 is ${int1 === int2}")
    println("int1 == int3 is ${int1 == int3}")
    println("int1 === int3 is ${int1 === int3}")
}