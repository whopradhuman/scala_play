import scala.io.StdIn.{readLine,readInt}
import scala.collection.mutable.ArrayBuffer
object spiral_Display {
  def main(args: Array[String]): Unit = {
    var n = readLine.toInt
    var m = readLine.toInt

    var matrix = Array.ofDim[Int](n, m)

    for (i <- 0 until n) {
      for (j <- 0 until m) {
        matrix(i)(j) = readLine.toInt
      }
    }

    var minc = 0
    var minr = 0
    var maxc = m - 1
    var maxr = n - 1

    var tno = n * m
    var count = 0

    while (count < tno) {
      var left = minr
      while (count < tno && left <= maxr) {
        println(matrix(left)(minc))
        count += 1
        left += 1
      }
      minc += 1

      var bottom = minc
      while (count < tno && bottom <= maxc) {
        println(matrix(maxr)(bottom))
        count += 1
        bottom += 1
      }
      maxr -= 1

      var up = maxr
      while (count < tno && up >= minr) {
        println(matrix(up)(maxc))
        count += 1
        up -= 1
      }
      maxc -= 1

      var right = maxc
      while (count < tno && right >= minc) {
        println(matrix(minr)(right))
        count += 1
        right -= 1
      }
      minr += 1
    }
  }
}
