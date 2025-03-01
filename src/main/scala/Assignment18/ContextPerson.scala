package Assignment18

case class ContextPerson(name:String,age:Int)

given Ordering[ContextPerson]=Ordering.by(_.age)

def sortPeople(list:List[ContextPerson])(using ord:Ordering[ContextPerson]):List[ContextPerson]={
  list.sorted
}
object Mains {
  def main(args:Array[String]):Unit={
    val people=List(
      ContextPerson("ishika",22) ,
        ContextPerson("Ayushi", 18),
      ContextPerson("jaiswal",15)
    )
    val sortedByAge=sortPeople(people)
    println(sortedByAge)

//    given Ordering[ContextPerson]=Ordering.by(_.name)
    val sortedByName=sortPeople(people)(using Ordering.by(_.name))
    println(sortedByName)
  }
}