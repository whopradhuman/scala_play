import scala.io.StdIn._
import scala.math._
object isPrime {
  def main(args: Array[String]): Unit = {
    val n = readInt

    var div = 2

    while (div <= sqrt(n) && n % div != 0) {
      div += 1
    }

    if (div > sqrt(n)) {
      println("PRIME")
    } else {
      println("NON-PRIME")
    }
  }
}