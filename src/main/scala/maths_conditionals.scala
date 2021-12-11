import scala.io.StdIn._
import scala.math.*
object maths_conditionals {
  def main(args: Array[String]): Unit = {
    // + - * / % += -= *= /= works
    // import math
    // math functions: abs sqrt cbrt round ceil floor max min pow hypot

    println("5 + 7 = " + (5 + 7))
    println("5 - 7 = " + (5 - 7))
    println("5 * 7 = " + (5 * 7))
    println("5 / 7 = " + (5 / 7))
    println("5 / 7 = " + (5.toDouble / 7))
    println("5 / 7 = " + (5f / 7))
    println("5 % 7 = " + (5 % 7))
    println("7 % 5 = " + (7 % 5))

    var a = 10
    println(a)
    a += 5 // -= *= /=
    println(a)

    println(abs(-50))
    println(round(10.6324))
    println(floor(10.6324))
    println(ceil(10.6324))
    println(pow(5,2))
    println(sqrt(100))
    println(cbrt(100))
    println(log10(2))
    println(log(2))

    // conditionals
    // < > <= >= == !=
    // && || !

    val age = readLine.toInt;
    if (age < 16) {
      println("Not eligible for any license")
    } else if(age >= 16 && age < 18) {
      println("eligible for gear-less two wheeler license")
    } else {
      println("eligible for all license")
    }

    val voter = if(age < 18) "No" else "Yes"
    println("Is a voter : " + voter)
  }
}
