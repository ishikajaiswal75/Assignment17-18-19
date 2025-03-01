package Assignment17

trait Drawable {
  def draw():Unit
}
class Circless(radius:Double) extends Drawable{
  override def draw(): Unit = {
    println(s"Drawing a circle with radius $radius")
  }
}
class Rect(width:Double,length:Double) extends Drawable{
  override def draw(): Unit = {
    println(s"Drawing a rectangle with width $width and length $length")
  }
}
object Mains {
  def main(args:Array[String]):Unit={
    val circle=new Circless(5.0)
    val rect=new Rect(4,6)

    circle.draw()
    rect.draw()
  }
}