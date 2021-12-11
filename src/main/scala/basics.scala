import scala.io.StdIn.readLine

object basics {
  def main(args: Array[String]) :Unit =
    println("Hello World!")

    // data types: Byte, Boolean, Char, Short, Int, Long, Float, Double,
    /*multi
      line
      comment
    */
    var a = 10 // mutable
    val b = 20 // immutable
    println(a + b)

    val c = BigInt("54523656861246532165316546313561265465")
    val d = BigDecimal("1.54523656861246532165316546313561265465")

    println(c + 1)
    println(d + .00000000000000000000000000000000000001)

    val ch = 'A'
    println(ch)
    val e:Float = 89.532

    val ch2 = ch.toString

    // input
    val name = readLine()
    printf("Hello, %s\n", name)
    println(s"Hello $name!")
    val n = readLine().toInt
    println(n + 100)
    // readInt readDouble readFloat readShort can also be used

}
