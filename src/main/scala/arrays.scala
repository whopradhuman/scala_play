import scala.collection.mutable.ArrayBuffer

object arrays {
  def main(args: Array[String]): Unit = {
    val arr = Array(30,40,10,50,60,20)
    println(arr.mkString("Array Elements -> " , ", ", "."))

    val arr2 = new Array[Int](10)
    println(arr2.mkString("Array 2 Elements -> " , ", ", "."))

    for i <- arr2.indices do {
      arr2(i) = (i + 1) * 10
    }

    println(arr2.mkString("Array 2 Elements -> " , ", ", "."))
    for (i <- arr2.indices) {
      print(arr2(i) + " ")
    }
    println()
    arr2.foreach(println)
    arr2.foreach(A => println(A*A))

    // arraybuffer
    var bufArr = ArrayBuffer[Any]()
    bufArr.foreach(println)
    println()
    bufArr.insert(0,10)
    bufArr.insert(1, "Hi")
    bufArr.foreach(println)
    println()

    bufArr += 'A'
    bufArr.foreach(println)
    println()
    bufArr ++= Array("thomas", "arthur", "john")
    bufArr.foreach(println)
    println()

    bufArr.remove(0)
    bufArr.foreach(println)
    println()

    bufArr.remove(0,2)
    bufArr.foreach(println)
    println()

    for (ele <- bufArr) {
      println(ele)
    }
    println()

    val arr3 = for(num <- arr) yield num * num
    for (ele <- arr3) {
      println(ele)
    }
    println()

    val arr4 = for(num <- arr if num % 3 == 0) yield num
    for (ele <- arr4) {
      println(ele)
    }
    println()

//    2d array
    var a = 10
    var arr2D = Array.ofDim[Int](3, 3)
    for i <- arr2D.indices do {
      for j <- arr2D(0).indices do {
        arr2D(i)(j) = a
        a += 10
      }
    }

    for i <- arr2D.indices do {
      for j <- arr2D(0).indices do {
        print(arr2D(i)(j) + " ")
      }
      println()
    }

    println(arr.sum)
    println(arr.min)
    println(arr.max)

    var sortArr = arr.sortWith(_ > _)
    print(sortArr.mkString("descending sorted: ", ", ", "."))
    println()
    sortArr = arr.sortWith(_ < _)
    print(sortArr.mkString("ascending sorted: ", ", ", "."))
    println()

    print(arr.mkString("arr: ", ", ", "."))
    println()
    arr(0) = 10
    print(arr.mkString("arr: ", ", ", "."))
    println()

    arr.map(x => x * 2).foreach(println)
    println()
    arr.filter(_ > 40).foreach(println)
  }
}
