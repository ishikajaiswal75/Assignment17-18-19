package Assignment17

abstract class ConcreteShape {
  def area():Double          //Abstract method(no implementation
}
//Concrete subclass:Circle
class Circles(val radius:Double) extends ConcreteShape{
  override def area(): Double = Math.PI*radius*radius
}
//Concrete subclass:Rectaangle
class Rectangles(val length: Double,val width:Double) extends ConcreteShape{
  override def area(): Double = length*width

}
object Main extends App {
  val circle=new Circle(5)
  println(s"Area of Circle:${circle.area()}")

  val rect=new Rectangle(4,6)
  println(s"Area of Rectangle:${rect.area()}")

}