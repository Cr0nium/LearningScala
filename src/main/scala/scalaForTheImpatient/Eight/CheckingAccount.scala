package scalaForTheImpatient.Eight

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double)  {
  private var balance = this.initialBalance
  override def deposit(amount: Double): Double = {if (amount > 1) balance += (amount + 1); balance}
  override def withdraw(amount: Double): Double = {if (balance > (amount + 1)) balance -= (amount + 1); balance}
}
