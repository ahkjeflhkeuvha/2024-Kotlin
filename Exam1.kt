package chapter2

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    val c = if(a>b) a else b

    val d = if(a<b){
                println(b)
                b
            }else {
                println(a)
                a
            }
    println(c)
    println(d)
}