package baseball.domain

class Strike(private var value: Int) {

    fun count(){
        value++
    }

    fun getValue(): Int = value
}