const val standartDiscount = 10_000
const val maxDiscount = 0.05
const val melomanDiscount = 0.01

fun main() {

    val user = UserFroamTaskThree("Igor", true, 80_000)
    val user2 = UserFroamTaskThree("Viktor", false, 500_000)
    val user3 = UserFroamTaskThree("Viktor", true, 1_500_000)

    pay(user, 50_000)
    pay(user2, 50_000)
    pay(user3, 50_000)

}

fun standartDiscountFun(sum: Int): Int {
    val calcSum = sum - standartDiscount
    println("Сумма после скидки $calcSum")
    return calcSum

}

fun maxDiscountFun(sum: Int): Int {
    val discount = (sum * maxDiscount).toInt()
    val calcSum = sum - discount
    println("Сумма после скидки $calcSum")
    return calcSum

}

fun pay(user: UserFroamTaskThree, sum: Int): Int {
    var sumPay: Int
    println("Покупка $sum ->")

    when (user.amountOfPurchases) {
        in 0..100_000 -> {
            println("Скидка не предусмотрена")
            sumPay = sum
        }
        in 100_001..1_000_000 -> sumPay = standartDiscountFun(sum)
        else -> sumPay = maxDiscountFun(sum)

    }

    if (user.meloman){
        sumPay -= (sumPay * melomanDiscount).toInt()
        println("Сумма после скидки за то что ты ,,Меломан,, = $sumPay ")
    }

    println()

    return sumPay
}

