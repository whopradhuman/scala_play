object traits {
  def main(args: Array[String]): Unit = {
    val mimi = Nightingale("mimi")
    mimi.getData
  }
  trait Flies {
    var fly :String
  }
  trait Sings {
    var sound :String
  }

  class Nightingale(var name: String) extends Flies with Sings {
    var fly = "can fly"
    var sound = "koo"

    def getData = {
      printf("%s %s and sings %s.\n", this.name, this.fly, this.sound)
    }
  }
}
