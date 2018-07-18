import SecondExercise.{Hotel, London, Moscow, NewYork}
import org.scalatest.{FlatSpec, Matchers}

class SecondExerciseSpec extends FlatSpec with Matchers {

  it should "increase hotel prices in London by 200" in {
    val hotelList = SecondExercise.increaseLondonHotelPrices(SecondExercise.hotels, 200)

    hotelList shouldBe List(Hotel("Hilton", 400, London), Hotel("Novotel", 180, Moscow), Hotel("HolidayInn", 240, NewYork), Hotel("HolidayInn", 300, London))
  }

  it should "return last hotel in the list" in {
    val hotel = SecondExercise.returnLastHotel(SecondExercise.hotels)

    hotel shouldBe Hotel("HolidayInn", 100, London)
  }

  it should "return second last hotel in the list" in {
    val hotel = SecondExercise.returnSecondLastHotel(SecondExercise.hotels)

    hotel shouldBe Hotel("HolidayInn", 240, NewYork)
  }
}
