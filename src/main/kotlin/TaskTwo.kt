val likes = 211

fun main() {
    defineWord(likes)
}

fun defineWord(likes: Int) {
    if (likes % 10 == 1 && likes % 100 != 11){
        println("Человеку")
    }else println("Людям")

}
