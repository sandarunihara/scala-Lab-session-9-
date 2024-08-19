def calculateInterest(deposit: Double): Double = {
    val interest1 = (d: Double) => d * 0.02
    val interest2 = (d: Double) => d * 0.04
    val interest3 = (d: Double) => d * 0.035
    val interest4 = (d: Double) => d * 0.065

    if (deposit <= 20000) {
      interest1(deposit)
    } else if (deposit <= 200000) {
      interest2(deposit)
    } else if (deposit <= 2000000) {
      interest3(deposit)
    } else {
      interest4(deposit)
    }
  }

  def main(args: Array[String]): Unit = {
    val depositAmounts = List(15000, 50000, 500000, 3000000)

    depositAmounts.foreach { deposit =>
      println(s"Deposit: Rs. $deposit -> Interest: Rs. ${calculateInterest(deposit)}")
    }
  }