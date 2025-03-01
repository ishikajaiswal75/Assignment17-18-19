package Assignment17

abstract class TestAppShape {

    def area(): Double

     }

//Circle class
class Circles(val radius:Double) extends TestAppShape{
  override def area(): Double = Math.PI*radius*radius
}
//Rectangle class
class Rectangles(val length: Double,val width:Double) extends TestAppShape {
  override def area(): Double = length*width

}

//Trait Drawable
trait Drawable {
  def draw():String
}
class DrawCircle(radius:Double) extends Drawable {
  override def draw(): String = s"Drawing a circle with radius $radius"
  //    println(s"Drawing a circle with radius $radius")
}
class DrawRectangle(width:Double,length:Double) extends Drawable {
  override def draw(): String = s"Drawing a rectangle with width $width and length $length"
  //    println(s"Drawing a rectangle with width $width and length $length")
  //  }
}
//object main for testing
object TestShapes {
    def main (args:Array[String]):Unit={
      //Testing abstract class shape
      val circle=new Circles(5)
      assert(circle.area()==Math.PI*5*5)
      println("circle area test passed")

      val rectangle=new Rectangles(4,6)
      assert(rectangle.area()==4*6)
      println("rectangle area test passed")

      //Testing trait(Drawable)
      val drawCircle=new DrawCircle(5)
      assert(drawCircle.draw()=="Drawing a circle with radius 5.0")
      println("Drawable circle test passed")

      val drawRectangle=new DrawRectangle(4,6)
      assert(drawRectangle.draw()=="Drawing a rectangle with width 4.0 and length 6.0")
      println("Drawable Rectangle test passed")

  }
}