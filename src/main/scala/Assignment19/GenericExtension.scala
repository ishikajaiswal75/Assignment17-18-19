package Assignment19

object GenericExtension {
  extension[T](list:List[T])
    def Second : Option[T] =
      if(list.length>=2) Some(list(1)) else None

  def main(args:Array[String]):Unit={
    println(List(10,20,30).Second)
    println(List("Scala","Java").Second)
    println(List(2.5).Second)
  }
}
