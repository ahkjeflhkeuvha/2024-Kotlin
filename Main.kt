// var은 읽기/쓰기가 가능
// val은 읽기만 가능 -> 변하지 않는 값을 입력할 때 사용
// 상수는 const 사용 -> 읽기 전용, 대문자로 선언, 기본 데이터형(Int, Long ...)에만 사용 가능

// lateinit은 var만 -> 객체 타입만 가능
// lazy는 val도 가능 -> 사용할 때 초기화 ㅂㅌ

lateinit var gender:String

lateinit var text:String
val textLength:Int by lazy {
    text.length
}

val grade = 2 // 자료형 추론, 초기화 무조건

fun main(){
    var name:String = "오지은"
    var age:Int = 18

    text = "happy"
    println("${text}의 길이 textlength : $textLength")
    gender = "W"
    println("이름 = $name\n나이 = ${age + 1}\n성별 = ${gender}")
}