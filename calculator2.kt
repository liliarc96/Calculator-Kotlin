fun main() {
    var result:String = ""
    println("Select the type of opperation:\n + for addition;\n - for subtraction;\n / for division;\n* for multiplication;\n")
    println("Now input the two numbers:\n\n")
    var selection:String = "+"
    println("Type a value for the first number: ")
    var number1:Float = 2.00f
    println("Type a value for the secont number: ")
    var number2:Float = 4.00f
    
    when(selection){
        "+" -> {result = "The result is: ${addition(number1,number2)}"}
        "-" -> {result = "The result is: ${subtraction(number1,number2)}"}
        "/" -> {result = "The result is: ${division(number1,number2)}"}
        "*" -> {result = "The result is: ${multiplication(number1,number2)}"}
        else -> {println("This operation is unavailable.")}
    }
    println(result)
}

fun addition(n1:Float,n2:Float) = n1.plus(n2)
fun subtraction(n1:Float,n2:Float) = n1.minus(n2)
fun division(n1:Float,n2:Float) = n1.div(n2)
fun multiplication(n1:Float,n2:Float) = n1.times(n2)
