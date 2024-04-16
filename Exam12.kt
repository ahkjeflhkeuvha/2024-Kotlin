package chapter2

fun sayHello(name:String) = println("hello $name")

fun sayHello1(name:String?){
    if(name == null) println("Hello Korea")
    else println("Hello ${name}")
}

fun sayHello2(name:String = "Korea") = println("Hello $name")

fun sayHello3(no:Int, name:String = "Korea") = println("Hello $name")

fun main(){
    sayHello("Jieun")
    sayHello1(null)
    sayHello2()
    sayHello2("Kim")
    sayHello3(5)
    sayHello3(no=10)
    sayHello3(no = 10, name = "Kim")
}