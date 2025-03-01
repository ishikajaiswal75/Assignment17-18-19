package Assignment19

object Palindrome {
//  def runPalindromeCheck(): Unit =
    extension (s: String)
      def isPalindrome: Boolean = s == s.reverse

  def main(args: Array[String]): Unit = {
    println("madam".isPalindrome)
    println("Hello".isPalindrome)
    println("racecar".isPalindrome)
  }
}