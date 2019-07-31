fun main() {
    val rat = RationalNumber(8, 9)
    val rat2 = RationalNumber(1, 2)

    var cha = add(rat, rat2)

    println(cha)

    val cc = toDouble(rat).toString()

    println(cc)
}
