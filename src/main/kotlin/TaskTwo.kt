val likes = 121

fun main() {
    defineWord(likes)
}

fun defineWord(likes: Int) {
    when (likes % 10) {
        1 -> println("Человеку")
        else -> println("Людям")
    }

}
