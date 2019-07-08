import GenerateNum._

object Locations{

  def playerX (int: Int): Int ={
    if (int == -1 ) {
      return randomNum()
    }
    return int }

  def playerY (int: Int): Int ={
    if (int == -1 ){
      return randomNum()}
    return int
  }

  def playerNorth(int: Int): Int ={
    return int +1 }

  def playerSouth(int: Int): Int ={
    return int -1 }

  def playerEast(int: Int): Int ={
    return int +1}

  def playerWest(int: Int): Int ={
    return int -1}

  def treasureX(): Int = randomNum()
  def treasureY(): Int = randomNum()


}
