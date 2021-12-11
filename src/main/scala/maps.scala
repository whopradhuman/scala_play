object maps {
  def main(args: Array[String]): Unit = {
    val map1 = Map("PEP" -> "CODING", 10 -> "TEN", "two" -> 2)

    if (map1.contains("PEP")) {
      printf("PEP%s\n", map1("PEP"))
    }
//    map1(100) = "FUN"
    val map2 = collection.mutable.Map("KIKI" -> "SPARROW", "GOGO" -> "PENGUIN", 10 -> "ten")

    println(map2)
    map2("KIKI") = "PARROT"
    println(map2)
    map2(100) = "FUN"
    println(map2)
    map2.remove(10)
    println(map2)

    for (kv <- map2) {
      print(s"$kv" + ", ")
    }
    println()

    for ((k,v) <- map2) {
      println(s"$k" + " : " + s"$v")
    }
    println()

  }
}
