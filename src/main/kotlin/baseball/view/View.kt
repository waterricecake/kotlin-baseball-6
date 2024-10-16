package baseball.view

import baseball.controller.RestartType
import baseball.domain.Result
import camp.nextstep.edu.missionutils.Console

class View {

    fun showStart() {
        println("숫자 야구 게임을 시작합니다.")
    }

    fun showInput():Array<Int> {
        print("숫자를 입력해주세여 : ")
        val input = Console.readLine()
            .map { it.toString().toInt() }
            .toTypedArray()
        if (input.isEmpty() || input.size > 3) {
            throw IllegalArgumentException()
        }
        return input
    }

    fun showResult(result: Result) {
        if (result.isEnd()){
            println("3스트라이크")
            println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
            return
        }
        if (result.hasBall()) {
            print("${result.getBall()}볼")
        }
        if (result.hasBall() && result.hasStrike()) {
            print(" ")
        }
        if (result.hasStrike()) {
            print("${result.getStrike()}스트라이크")
        }
        if (result.isNothing()) {
            print("낫싱")
        }
        println()
    }

    fun showRestart():RestartType {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        val input = Console.readLine()
        if (input == "1") {
            return RestartType.RESTART
        }
        if (input == "2") {
            return RestartType.STOP
        }
        throw IllegalArgumentException()
    }
}