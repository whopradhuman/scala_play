import scala.io.StdIn._
object barChart {
  def main(args: Array[String]): Unit = {
    println("Enter number of elements")
    val n = readInt
    var arr = new Array[Int](n)
    println(s"Enter $n numbers")

    for i <- arr.indices do {
      arr(i) = readInt()
    }

    var max = arr.max

    while (max >= 1) {
      for(ele <- arr) {
        if(ele >= max) {
          print("*\t")
        } else {
          print("\t")
        }
      }
      println()
      max -= 1
    }
  }
}
