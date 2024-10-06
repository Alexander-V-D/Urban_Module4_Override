open class Bird(
    open val order: String = "Пеликанообразные",
    open val canFly: Boolean = true,
    open val isPredator: Boolean = true) {

    open fun toFly() {
        println(if (canFly) "Эта птица может летать" else "Эта птица не может летать")
    }

    open fun toHunt() {
        println("Птица охотится")
    }

    open fun toEat() {
        println(if (isPredator) "Эта птица хищник" else "Эта птица травоядная")
    }
}