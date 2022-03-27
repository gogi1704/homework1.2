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
    val commissionInt = commission.toInt()
    return commissionInt
}

//переводы с любых карт комиссия 0.75%, минимум 35 рублей.