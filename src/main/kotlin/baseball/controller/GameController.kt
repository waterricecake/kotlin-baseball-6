package baseball.controller

import baseball.domain.BaseBallGame
import baseball.domain.Result
import baseball.service.RandomNumberCreator
import baseball.view.View

class GameController(val view: View, val randomNumberCreator: RandomNumberCreator) {

    fun startGame() {
        view.showStart()

        var restart = RestartType.RESTART
        while (restart.equals(RestartType.RESTART)) {
            playGame()
            restart = view.showRestart()
        }
    }

    private fun playGame(){
        val baseBallGame = BaseBallGame(GameState.PLAY, randomNumberCreator.createRandomNumbers())
        while (baseBallGame.isNotEnd()) {
            val input = view.showInput()
            val result: Result = baseBallGame.judgeNumbers(input)
            view.showResult(result)
        }
    }
}