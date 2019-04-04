package scalaForTheImpatient.Four.Five

class Time(val hrs: Int, val min: Int) {

  def before(other: Time): Boolean = {
    (hrs < other.hrs) || (hrs == other.hrs && min < other.min)
  }
}
