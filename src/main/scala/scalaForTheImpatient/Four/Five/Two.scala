package scalaForTheImpatient.Four.Five

object Two {
  def main(args: Array[String]): Unit = {
    var test = new BankAccount
    println(test.corrent)
    test.deposit(50)
    println(test.corrent)
    test.withdraw(110)
    println(test.corrent)
  }
}
