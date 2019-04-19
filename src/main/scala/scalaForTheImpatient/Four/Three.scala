package scalaForTheImpatient.Four

import scala.io.Source

object Three {
  def main(args: Array[String]): Unit = {

    val source = Source.fromFile("C:\\Users\\timur\\Desktop\\input.txt")
    val iterator = source.mkString.split("\\s+")
    var result = scala.collection.immutable.SortedMap[String, Int]()
    for (word <- iterator) process(word)
    println(result)

    def process(s: String): Unit = {
      val c = result.getOrElse(s, 0)
      result += (s -> (c + 1))
    }
  }
}
