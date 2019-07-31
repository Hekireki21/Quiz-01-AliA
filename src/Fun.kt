fun toDouble (arg: RationalNumber): Double {
    return arg.numerator.toDouble()/arg.denominator.toDouble()
}

fun add (num: RationalNumber, num2: RationalNumber): RationalNumber{
    val numerator = num.numerator * num2.denominator + num2.numerator * num.denominator
    val denominator= num.denominator * num2.denominator
    return RationalNumber(numerator, denominator)
}