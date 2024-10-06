class Hawk(override val order: String = "Соколообразные") : Bird() {
    override fun toHunt() {
        println("При виде добычи сокол пикирует на большой скорости")
    }
}