object loops {
  def main(args: Array[String]): Unit = {
    print("For Output: ")
    for i <- 1 to 10 do {
      if (i % 2 == 0) {
        print(i + ", ")
      }
    }
    println()

    print("While output: ")
    var a = 0
    while a < 10 do {
      print(a + " ")
      a += 1
    }
    println()

    var evens = for {i <- 1 to 50 if {
      i % 2 == 0
    }} yield i

    println(evens)

    for (i <- 1 until(5); j <- 1 to 5) {
      print("i" + i + " ; " + "j" + j)
      println()
    }

    def breakCont() :Unit = {
      print("break cont: ")
      for (i <- 1 to 20) do {
        if (i != 6) {
          print(i + " ")
          if (i == 11) {
            return
          }
        }
      }
    }

    breakCont()
    println()

    for (i <- List(10,20,30,40,50)) {
      print(i + " ")
    }
    println()

    for (i <- 0 until "Hello, World!".length) {
      print("Hello, World!"(i) + ", ")
    }
    println()
  }
}
