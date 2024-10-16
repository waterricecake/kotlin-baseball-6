package baseball.service

import camp.nextstep.edu.missionutils.Randoms
import kotlin.collections.mutableListOf


class RandomNumberCreator {

    fun createRandomNumbers(): Array<Int> {
        val computer:MutableList<Int> = mutableListOf()
        while (computer.size < 3) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber)
            }
        }
        return computer.toTypedArray()
    }
}