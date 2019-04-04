package scalaForTheImpatient.Four.Five

object One {
  def main(args: Array[String]): Unit = {
    var test = new SubOne
    println(test.current())
    test.increment()
    println(test.current())
  }
}
