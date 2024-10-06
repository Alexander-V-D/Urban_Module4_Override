fun main() {

    //Задача 2
    val stringArray = arrayOf("1", "22", "333")
    var longestStringLength = stringArray[0].length
    var longestString = stringArray[0]
    stringArray.forEach {
        if (it.length > longestStringLength) {
            longestStringLength = it.length
            longestString = it
        }
    }
    println("Ответ к задаче 2: \nСамая длинная строка:" +
            " $longestString \nЕё длина: $longestStringLength\n")

    //Задача 3
    val stroke = "ПриВет, кАк деЛа"
    var count = 0
    println("Ответ к задаче 3:")
    stroke.toCharArray().forEach {
        if (it.isUpperCase()) {
            println(it)
            count++
        }
    }
    println("Количество заглавных букв: $count")
}
