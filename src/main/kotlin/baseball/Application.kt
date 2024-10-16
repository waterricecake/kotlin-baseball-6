package baseball

import baseball.controller.GameController
import baseball.util.RandomNumberCreator
import baseball.view.View

fun main() {
    val view = View()
    val randomNumberCreator = RandomNumberCreator()
    val gameController = GameController(view, randomNumberCreator)

    gameController.startGame()
}