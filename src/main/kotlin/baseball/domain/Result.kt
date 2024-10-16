package baseball.domain

private const val THREE_STRIKE = 3

private const val ZERO = 0

class Result(private val strike: Strike, private val ball: Ball) {

    fun isEnd() : Boolean {
        return strike.getValue() == THREE_STRIKE
    }

    fun hasStrike(): Boolean {
        return strike.getValue() > ZERO
    }

    fun hasBall(): Boolean {
        return ball.getValue() > ZERO
    }

    fun isNothing(): Boolean {
        return ball.getValue() == ZERO && strike.getValue() == ZERO
    }

    fun getBall(): Int = ball.getValue()

    fun getStrike(): Int = strike.getValue()
}