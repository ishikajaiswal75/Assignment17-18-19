package Assignment18

case class GivenInstance(name:String,age:Int)

given Ordering[GivenInstance]=Ordering.by(_.age)

object Main {
  def main(agrs:Array[String]): Unit = {
    val givenInstance=List(
      GivenInstance("ishika",22),
      GivenInstance("sakshi",20),
      GivenInstance("shubhangi",23)
    )
    val sortedInstance=givenInstance.sorted

    println(sortedInstance)


  }
}
