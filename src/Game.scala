
import GameUtil._
import Distance._
import Locations._




object Game {
  def main(args: Array[String]) {
    var x: Int = -1
    var y: Int = -1
    var loop: Int = 0

    val tx = treasureX()
    val ty = treasureY()

    playerX(x)
    playerY(y)

    println("Hello, Welcome to the Murky Marsh! You are " + showDistance(tx, ty, x, y) +
      "m away from the exit. Which way would you like to step? (North, South, East or West)")
    while (loop != 1) {
      val userInput = getUserInput()

      if (userInput == "NORTH" || userInput == "N") {
        if (x == 8)
          {println("You hit an invisible wall")}
        else{x = playerNorth(x)}
      }
      else if (userInput == "SOUTH" || userInput == "S") {
        if (x == 0)
        {println("You hit an invisible wall")}
        else{x = playerSouth(x)}
      }
      else if (userInput == "EAST" || userInput == "E") {
          if (y == 8)
          {println("You hit an invisible wall")}
          else{y = playerEast(y)}
      }
      else if (userInput == "WEST" || userInput == "W") {
            if (y == 0)
            {println("You hit an invisible wall")}
            else{y = playerWest(y)}
      }
      else if (userInput == "EXIT") {
        loop = 1
      }
      else {
        println("Unrecognised Response")
      }


      if (loop == 1){
        println("You have been defeated by the GAME! SHAME SHAME SHAME")
      }
      else if(showDistance(tx, ty, x, y) != 0) {
        println("You are " + showDistance(tx, ty, x, y) +
        "m away from the exit. In which direction would you like to take your step next? (North, South, East or West)")
      }
      else {
        println("Well Done! You found the treasure, I'll leave you to your spoils")
        loop = 1
      }
    }
  }
}
