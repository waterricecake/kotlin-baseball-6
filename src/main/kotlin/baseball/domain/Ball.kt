package baseball.domain

class Ball(private var value: Int) {

    fun count(){
        value++
    }

    fun getValue(): Int = value
}