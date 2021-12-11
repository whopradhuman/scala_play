object classes {
  def main(args: Array[String]): Unit = {
    val kiki = Bird("KIKI", "FLIES HIGH")
    println(kiki.property)
    println(kiki.getName())
    kiki.setName("Kiwi")
    println(kiki.getName())
    println("")

    val gogo = Bird("GOGO")
    val meeki = new Bird
    println(gogo.getProp())
    println(meeki.getProp())
    println(meeki.getName())

    val mojo = Penguin("Mojo", "slow")
    val dodger = Eagle("Dodger", "fast")

    mojo.getInfo()
    dodger.getInfo()

    val hiss = Snake("Hiss")
    val lizz = Lizard("Lizz")

    hiss.getData
    lizz.getData

  } // main ends here

  class Bird(private var name :String, var property :String) {

    val id:Int = Bird.assignAge
//    def getName() :String = {
//      return this.name
//    }

    def getName():String = this.name

//    def getProperty() :String = {
//      return this.property
//    }
    def getProp() :String = this.property

    def this(name:String) = {
      this("No Name", "No Property")
      this.setName(name)
    }

    def this() = {
      this("No Name", "No Property")
    }

    def setName(name :String): Unit ={
      if(!name.matches(".*\\d+.*")) {
        this.name = name
      } else {
        this.name = "No Name"
      }
    }

    def setProp(prop :String): Unit ={
      this.property = prop
    }

//    override def toString: String = {
//      return "%s is %s and is %d years old.".format(this.name, this.property)
//    }

  }
    object Bird {
      private var age = 0
      private def assignAge :Int= {age += 1; age}
    }

    class Penguin(name :String, property :String) extends Bird(name, property) {
        var move = "walks"

        def getInfo(): Unit = {
          printf("%s is %s and %s\n", this.name, this.property, this.move)
        }
    }

    class Eagle(name:String, property :String) extends Bird(name, property) {
      var move = "flies high"
      def getInfo(): Unit = {
        printf("%s is %s and %s.\n", this.name, this.property, this.move)
      }
    }

    // abstract class
    abstract class Reptile(val name:String) {
      var move :String
      def getData :Unit
    }

    class Snake(name :String) extends Reptile(name) {
      var move = "Drags"
      def getData = {
        printf("%s, %s\n", this.name, this.move)
      }
    }

    class Lizard(name :String) extends Reptile(name) {
      var move = "Crawl"
      def getData = {
        printf("%s, %s\n", this.name, this.move)
      }
    }


} // code ends
