package Assignment18

case class ContextBoundPerson(name:String,age:Int)

given Ordering[ContextBoundPerson]=Ordering.by(_.age)
//Function using context bound
def sortPeoples[T:Ordering] (list:List[T]):List[T]={
  list.sorted
}
object obj {
  def main(args:Array[String]):Unit={
    val peoples=List(
      ContextBoundPerson("ishika",22) ,
      ContextBoundPerson("Ayushi", 18),
      ContextBoundPerson("jaiswal",15)
    )
    val sortedByAge=sortPeoples(peoples)
    println(sortedByAge)

    //    given Ordering[ContextPerson]=Ordering.by(_.name)
    val sortedByName=sortPeoples(peoples)(using Ordering.by(_.name))
    println(sortedByName)
  }
}