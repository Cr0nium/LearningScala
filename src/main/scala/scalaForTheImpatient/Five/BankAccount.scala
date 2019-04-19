package scalaForTheImpatient.Five

class BankAccount {
private var balance = 0
  def deposit(in: Int) {balance += in}
  def withdraw(out: Int) {if (out < balance) balance -= out}
  def corrent: Int = balance
}
