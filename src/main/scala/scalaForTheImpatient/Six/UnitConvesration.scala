package scalaForTheImpatient.Six

class UnitConvesration (val converstionFactor: Double) {
  private def convert (value: Double) = value * converstionFactor

  def apply(value: Double) = convert(value)

  object InchesToCentimeters extends UnitConvesration(2.54) {}
  object GallonsToLiters extends UnitConvesration(3.78541) {}
  object MilesToKilometers extends UnitConvesration(1.60934) {}


}
