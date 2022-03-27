val commissionPercent = 0.075

fun main() {

    val amount = 2000
    println("Коммисия составляет " + calculateCommission(amount, commissionPercent))

}

fun calculateCommission(amount: Int, commissionPercent: Double): Int {
    var commission = amount * commissionPercent
    if (commission < 3500) {
        commission = 3500.0
    }
    return commission.toInt()
}
