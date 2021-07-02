import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var result:String = ""
    println("Select the type of opperation:\n + for addition;\n - for subtraction;\n / for division;\n* for multiplication;\n")
    var selection:String = readLine()!!
    println("Now imput the two numbers:\n\n")
    println("Type a value for the first number: ")
    var number1:Float = reader.nextFloat()
    println("Type a value for the secont number: ")
    var number2:Float = reader.nextFloat()
    
    when(selection){
        "+" -> {result = "The result is: ${addition(number1,number2)}"}
        "-" -> {result = "The result is: ${subtraction(number1,number2)}"}
        "/" -> { if(!(number1.equals(0))) result = "The result is: ${division(number1,number2)}" else result = "Can't divide."}
        "*" -> {result = "The result is: ${multiplication(number1,number2)}"}
        else -> {println("This operation is unavailable.")}
    }
    println(result)
}

fun addition(n1:Float,n2:Float) = n1.plus(n2)
fun subtraction(n1:Float,n2:Float) = n1.minus(n2)
fun division(n1:Float,n2:Float) = n1.div(n2)
fun multiplication(n1:Float,n2:Float) = n1.times(n2)
