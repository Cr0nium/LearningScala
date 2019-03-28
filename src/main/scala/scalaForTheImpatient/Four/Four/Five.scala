package scalaForTheImpatient.Four.Four

object Five {
  def main(args: Array[String]): Unit = {
    def lteqgt(values:Array[Int], v:Int): (Int, Int, Int) = (values.count(_ < v), values.count(_ == v), values.count(_ > v))
    println(lteqgt(Array(1,2,1,3,4,5,5), 4))
  }

}
