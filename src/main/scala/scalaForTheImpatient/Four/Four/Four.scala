package scalaForTheImpatient.Four.Four

object Four {
  def main(args: Array[String]): Unit = {
    def minmax (values: Array[Int]) = (values.min, values.max)
    def upperName(name: String): (String, String) = {(name.toUpperCase(), name)}
      println(minmax(Array(5,2,3,4,2,4)))
    }
}
