object FirstExercise {
  val guestNames = List("Sonia", "Greg", "Povilas", "Angela", "John", "Adam", "Avinash", "Laura", "Rama")

  def findLengthOfEachName(list: List[String]): List[Int] = {
    ???
  }

  def findAllNamesWithFirstLetter(list: List[String], firstLetter: String): List[String] = {
    ???
  }

  def findTotalLength(list: List[String]): Int = {
    ???
  }

  case class Employee(name: String, benefits: List[String])

  val employees = List(Employee(name = "John", benefits = List("pension", "bonus")), Employee(name = "Julia", benefits = List("healthcare")))

  def findAllBenefits(people: List[Employee]): List[String] = {
    ???
  }

}
