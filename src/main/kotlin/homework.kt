fun main() {

    println("Комиссия за перевод составит 0.75%, но не менее 35 руб.")
    print("Введите сумму для перевода в Банк \"Конкретный\": ")

    val amount = readln().toInt()
    val amountBit: Int = amount * 100
    val amountTaxBit: Double = if (amountBit / 100 * 0.75 < 3500) 3500.0 else amountBit / 100 * 0.75
    val amountTax: Double = amountTaxBit / 100
    val amountAfterTaxBit: Double = amountBit - amountTaxBit
    val amountAfterTax: Double = amountAfterTaxBit / 100

    println()
    println("Средства направленные на перевод $amount руб.")
    println("Размер комиссии $amountTax руб.")
    println("Средства к зачислению $amountAfterTax руб.")

    // ps для душнилы) Вывод средств в консоль
    // осуществляется в рублях, расчёт в копейках
    // для комфортного восприятия)


}

