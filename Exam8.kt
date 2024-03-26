fun whichType(data:Any){
    if(data is String) println("$data 는 String 입니다. $data 의 길이 = ${data.length}")
    else if(data is Int) println("$data 는 Int입니다. $data 의 2배 = ${data*2}")
    else println("$data 는 String도 Int도 아닙니다. ${data.javaClass}형입니다.")
}

fun main() {
    whichType("ABCDE")
    whichType(123)
    whichType('E')
    whichType(true)
}

// 오지은