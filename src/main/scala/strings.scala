object strings {
  def main(args: Array[String]): Unit = {
    var str = "Hello there, how was the day ?"

    println(str)
    println(str(5))  // char at index (indexing from 0)
    println(str.length)  // length
    println(str.concat("\nAre you free tomorrow ?"))  // combine two strings
    println("hello".equals(str))  // equates strings
    println(str.indexOf("day"))   // start index of a word

    var strArr = str.toArray    // array from str  str.split(" ")

//    for i <- 0 until strArr.length do {
//      println(strArr(i))
//    }

    for i <- strArr.indices do {
      print(strArr(i) + " ")
    }
    println()

    for v <- strArr do {
      print(v + " ")
    }
    println()
  }
}
