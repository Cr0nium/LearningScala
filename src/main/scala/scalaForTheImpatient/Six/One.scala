package scalaForTheImpatient.Six

import scalaForTheImpatient.Six.UnitConvesration

object One extends App {

  object InchesToCentimeters extends UnitConvesration(2.54) {}

val testTwo = InchesToCentimeters(100)
  println(testTwo)
}
