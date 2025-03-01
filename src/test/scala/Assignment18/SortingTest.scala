package Assignment18

object SortingTest {
  case class GivenInstance(name:String,age:Int)
  given Ordering[GivenInstance]=Ordering.by(_.age)

  def testGivenInstanceSorting():Unit={
//    val givenInstanc=List(
    val givenInstance = List(
      GivenInstance("ishika", 22),
      GivenInstance("sakshi", 20),
      GivenInstance("shubhangi", 23)
    )
      val sortedInstance=givenInstance.sorted
    val expected=List(
//       GivenInstance=List(
        GivenInstance("sakshi",20),
        GivenInstance("ishika",22),
        GivenInstance("shubhangi",23)
      )
      assert(sortedInstance==expected,s"Expected $expected but got $sortedInstance")
  }
//case class ContextPerson(name:String,age:Int)
case class ContextPerson(name: String, age: Int)

  given Ordering[ContextPerson] = Ordering.by(_.age)

  def sortPeople(list: List[ContextPerson])(using ord: Ordering[ContextPerson]): List[ContextPerson] = {
    list.sorted
  }

  def testContextPersonSorting():Unit={
      val people= List(
        ContextPerson("ishika", 22),
        ContextPerson("Ayushi", 18),
        ContextPerson("jaiswal", 15)
      )
    val sortedByAge=sortPeople(people)
    val expected = List(
      ContextPerson("jaiswal",15),
      ContextPerson("Ayushi",18),
      ContextPerson("ishika",22)
    )
    assert(sortedByAge==expected,s"Expected $expected but got $sortedByAge")

    val sortedByName = sortPeople(people)(using Ordering.by(_.name))
    val expectedByName = List(
      ContextPerson("Ayushi", 18),
      ContextPerson("ishika", 22),
      ContextPerson("jaiswal", 15)
    )
    assert(sortedByName == expectedByName, s"Expected $expectedByName but got $sortedByName")
  }

  case class ContextBoundPerson(name: String, age: Int)

  given Ordering[ContextBoundPerson] = Ordering.by(_.age)

  //Function using context bound
  def sortPeoples[T: Ordering](list: List[T]): List[T] = {
    list.sorted
  }
  def testContextBoundPersonSorting():Unit= {
    val peoples = List(
      ContextBoundPerson("ishika", 22),
      ContextBoundPerson("Ayushi", 18),
      ContextBoundPerson("jaiswal", 15)
    )
    val sortedByAge = sortPeoples(peoples)
    val expected = List(
      ContextBoundPerson("jaiswal", 15),
      ContextBoundPerson("Ayushi", 18),
      ContextBoundPerson("ishika", 22)
    )
    assert(sortedByAge == expected, s"Expected $expected but got $sortedByAge")

    val sortedByName = sortPeoples(peoples)(using Ordering.by(_.name))
    val expectedByName = List(
      ContextBoundPerson("Ayushi", 18),
      ContextBoundPerson("ishika", 22),
      ContextBoundPerson("jaiswal", 15)
    )
    assert(sortedByName == expectedByName, s"Expected $expectedByName but got $sortedByName")
  }
    def main(args:Array[String]):Unit={
      testGivenInstanceSorting()
      testContextPersonSorting()
      testContextBoundPersonSorting()
      println("All test case pass successfully")
  }
}
