import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn.readLine

object subsequence {
  def main(args: Array[String]): Unit = {
    val inp = readLine
    val ans = gss(inp)
    println(ans)
  }

  def gss(str :String): ArrayBuffer[String] = {
  if (str.length == 0) {
    var bAns = ArrayBuffer[String]()
    bAns.append("")
    return bAns
  }
  var ch = str(0)
//  println(ch)
  var ros = str.substring(1)
//  println(ros)
  var rec_res = gss(ros)
  var my_res = ArrayBuffer[String]()
//  println(rec_res)
  for (ele <- rec_res) {
    my_res.append(ele)
  }

  for (ele <- rec_res) {
    my_res.append(ch + ele)
  }
//  println(my_res)
  return my_res
}
}
