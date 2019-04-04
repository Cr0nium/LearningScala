package scalaForTheImpatient.Four.Five

class SubOne {
private var value = 0
  def increment() {if (value < Int.MaxValue) value += 1}
  def current() = value
}
