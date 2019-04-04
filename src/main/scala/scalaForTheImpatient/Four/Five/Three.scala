package scalaForTheImpatient.Four.Five

object Three {
  def main(args: Array[String]): Unit = {
    val testOne = new Time(12, 20)
    val testTwo = new Time(11, 40)
    val result = testOne.before(testTwo)
    println(result)

  }
}
