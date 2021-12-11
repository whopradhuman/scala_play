import scala.io.StdIn.readLine
import math._
object functions {
  def main(args: Array[String]): Unit = {
    println(sum(10,5))
    println(sum(num2 = 4,num1 = 5))
    println(sum(num2 = 6))
    println(sum(6))

//    println("What's your name?")
//    val inp = readLine
//    greet(inp)
//    println("What's your name?")
//    greet(readLine)
    println(manySum(10,20,30,40))
    println(manySum(10,20,30,40,50))
    println()
    println(fact(5))
    // higher order

    val sq = pow _
    println(sq(5,2))
    println()

    val x = 5
    val times5 = (num:Int) => num * x

    println(times5(7))
  }

  def sum(num1:Int = 10, num2:Int = 20) :Int = {
    return num1 + num2
  }

  def greet(name:String) :Unit = {
    println(s"Hello $name!")
  }

  def manySum(args:Int*) :Int = {
    var sum = 0
      for i <- args do {
        sum += i
      }
    return sum
  }

  def fact(num :BigInt) :BigInt = {
    if (num == 1) {
      return 1
    }
    return num * fact(num - 1)
  }
}
