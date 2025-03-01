package Assignment17

//Abstract class
abstract class Shape{
  def area():Double
  def perimeter():Double
}

//Circle class
class Circle(val radius:Double) extends Shape{
  def area():Double=Math.PI*radius*radius    //Area=πr²
  def perimeter():Double=2*Math.PI*radius    //perimeter=2πr
}

//Rectangle class
class Rectangle(val length:Double,val width:Double) extends Shape{
  def area():Double=length*width
  def perimeter():Double=2 * (length+width)
}
object MainApp {
  def main(args: Array[String]): Unit = {
    val circle = new Circle(5)
    println(s"Area of Circle:${circle.area()},Perimeter of circle:${circle.perimeter()}")

    val rect = new Rectangle(4, 6)
    println(s"Area of Rectangle:${rect.area()},Perimeter of Rectangle:${rect.area()}")
  }
}