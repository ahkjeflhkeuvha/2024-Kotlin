fun main() {
    val ch = 'a'
    println(ch + 1)

    val kor = '\uD55c'
    println(kor)

    val code:Int = 65

    val chFromCode:Char = code.toChar()
    println(chFromCode)

    val num = 10
    val formatedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num)
    """

    println(formatedString)

    var a = 1
    var str1 = "a = $a"
    var str2 = "a = ${a + 2}"
    println("str1 : $str1 , str2 : $str2")
}