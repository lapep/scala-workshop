import org.scalatest.{FlatSpec, Matchers}
import FirstExercise._

class FirstExerciseSpec extends FlatSpec with Matchers {

  it should "return the length of each name" in {
    val lengthList = findLengthOfEachName(guestNames)

    lengthList shouldBe List(5, 4, 7, 6, 4, 4, 7, 5)
  }

  it should "return empty list if input list is empty" in {
    val filteredNames = findAllNamesWithFirstLetter(List.empty[String], "A")

    filteredNames shouldBe List.empty[String]
  }

  it should "return empty list if there are no names starting with particular letter" in {
    val filteredNames = findAllNamesWithFirstLetter(List.empty[String], "Z")

    filteredNames shouldBe List.empty[String]
  }

  it should "return all names which start with letter A" in {
    val filteredNames = findAllNamesWithFirstLetter(guestNames, "A")

    filteredNames shouldBe List("Angela", "Adam", "Avinash")
  }

  it should "return 0 if the input list is empty" in {
    val totalLen = findTotalLength(List.empty[String])

    totalLen shouldBe 0
  }

  it should "return total number of characters in the list" in {
    val totalLen = findTotalLength(guestNames)

    totalLen shouldBe 42
  }

  it should "return all of the benefits for all the people" in {
    val result = findAllBenefits(employees)

    result should contain allOf ("pension", "bonus", "healthcare")
  }

}
