object tuples {
  def main(args: Array[String]): Unit = {
    var tup = (10, "Hi", "Hello", 'A', 10.889)
    println(tup._1)
    println(tup._2)
    println(tup._3)

    tup.productIterator.foreach{i => print(s"$i" + ", ")}
    println()
    println(tup.toString())
    println(tup)
  }
}
