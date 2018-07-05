object FirstExercise {
  val guestNames = List("Sonia", "Greg", "Povilas", "Angela", "John", "Adam", "Avinash", "Laura", "Rama")

  def findLengthOfEachName(list: List[String]): List[Int] = {
    list.map(name => name.length)
  }

  def findAllNamesWithFirstLetter(list: List[String], firstLetter: String): List[String] = {
    list.filter(_.startsWith(firstLetter))
  }

  def findTotalLength(list: List[String]): Int = {
    list.foldLeft(0) { (acc, name) =>
      acc + name.length
    }
  }

  case class Employee(name: String, benefits: List[String])

  val employees = List(Employee(name = "John", benefits = List("pension", "bonus")), Employee(name = "Julia", benefits = List("healthcare")))

  def findAllBenefits(people: List[Employee]): List[String] = {
    people.flatMap(_.benefits)
  }

  //Hint1: need to get all the strings to one List, Hint2: make sure char case is ignored, Hint3: lookup other higher order functions available on Lists
  def findMostFrequentLetter(listOfEmployees: List[Employee]) = {
    val allStrings = listOfEmployees
      .foldLeft(List.empty[String]){(acc, empl) =>
        empl.name :: empl.benefits ++ acc
      }

    allStrings
      .flatMap(_.toLowerCase)
      .groupBy(identity)
      .mapValues(_.size)
      .maxBy(x => x._2)
  }

}
