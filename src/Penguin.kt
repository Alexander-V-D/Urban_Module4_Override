class Penguin(
    override val order: String = "Пингвинообразные",
    override val canFly: Boolean = false) : Bird() {
    override fun toHunt() {
        println("Пингивин ловит рыбу ловко плавая в воде")
    }
}