package baseball.domain

import baseball.controller.GameState

class BaseBallGame(private var gameState: GameState, val balls:Array<Int>) {

    fun judgeNumbers(numbers: Array<Int>): Result{
        val strike = Strike(0)
        val ball = Ball(0)
        for (i in 0 until numbers.size){
            judgeNum(numbers[i], balls[i], strike, ball)
        }
        judgeState(Result(strike, ball))
        return Result(strike, ball)
    }

    private fun judgeState(result: Result) {
        if (result.isEnd()) {
            gameState = GameState.END
        }
    }

    private fun judgeNum(target: Int, source : Int, strike: Strike, ball: Ball) {
        if (target == source){
            strike.count()
            return
        }
        if (balls.contains(target)){
            ball.count()
            return
        }
    }

    fun isNotEnd(): Boolean {
        return gameState.equals(GameState.PLAY)
    }
}