class Eagle(override val order: String = "Ястребообразные"): Bird() {
    override fun toHunt() {
        println("Орёл парит высоко в небе, высматривая добычу")
    }
}