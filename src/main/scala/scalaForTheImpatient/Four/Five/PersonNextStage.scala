package scalaForTheImpatient.Four.Five

class PersonNextStage(fio: String) {
private  val fioSplit = fio.split("\\s")
val firstName: String = fioSplit.head
val lastName: String = fioSplit.last
  def current = (firstName, lastName)

}
