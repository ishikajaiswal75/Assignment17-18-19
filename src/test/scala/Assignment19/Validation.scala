package Assignment19

import Assignment19.Palindrome.isPalindrome
import Assignment19.GenericExtension.Second
import scala.reflect.Selectable.reflectiveSelectable

object Validation {
  def main(args:Array[String]):Unit={
    //Test Palindrome Method
    println("Running Palindrome...")

    assert("madam".isPalindrome==true)
    assert("racecar".isPalindrome == true)
    assert("Hello".isPalindrome == false)
    assert("".isPalindrome == true)
    assert("a".isPalindrome == true)
   println("All Palindrome Test passes\n")

    //Test second Method
    println("Running Second Method Test....")
    assert(List(10,20,30).Second==Some(20))
    assert(List("Scala","Java").Second==Some("Java"))
    assert(List(2.5,3.7,4.8).Second==Some(3.7))
    assert(List(5).Second==None)
    assert(List().Second==None)
    println("All Second Method Test Passed\n")

    //Test Invalid cases
    println("Running Invalid Cases...")
    try{
      5.asInstanceOf[{def Second:Option[Int]}].Second
      println("Error:Second method should not be available for Int")
    }
    catch{
      case _: Throwable =>println("Error Caught: Second is not available for Int")
    }

 try{
      100.asInstanceOf[{def isPalindrome:Boolean}].isPalindrome
    println("Error:isPalindrome method sould not be available for Int")
  } catch {
    case _: Throwable => println("Error Caught: isPalindrome is not available for Int")
  }
  println("\nAll Tests Completed Successfully!")

}
}
