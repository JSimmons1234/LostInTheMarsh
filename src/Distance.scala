
import scala.math.sqrt
import scala.math.pow

object Distance {


  def showDistance(tX: Int,tY: Int,x: Int,y: Int): Double = {
    val xAxis = tX - x
    val yAxis = tY - y

    val d = sqrt(pow(xAxis, 2) + pow(yAxis, 2))

      return d

  }
}
