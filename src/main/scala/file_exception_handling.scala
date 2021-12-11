import java.io.PrintWriter
import scala.io.StdIn.*
import scala.io._

object file_exception_handling {
  def main(args: Array[String]): Unit = {

    // exception handling
    val divi = readInt
    val div = readInt

    def divide(dividend :Int, divisor :Int) = try {
      dividend / divisor
    } catch {
      case ex :ArithmeticException => "Can't divide by zero"
    } finally {
      //no
    }
      println(divide(divi,div))
      println("Hello world")

//    file i/o
    val writer = PrintWriter("pep.txt")
    writer.write("Hello there, how are you?\n")
    writer.close()

    val reader = Source.fromFile("pep.txt")
    val lines = reader.getLines()
    for (ln <- lines) {
      println(ln)
    }
    reader.close()
  }
}
