object SecondExercise {

  sealed trait City
  case object London extends City
  case object NewYork extends City
  case object Moscow extends City
  case class Hotel(name: String, price: Int, city: City)

  val hotels = List(Hotel("Hilton", 200, London), Hotel("Novotel", 180, Moscow), Hotel("HolidayInn", 240, NewYork), Hotel("HolidayInn", 100, London))

  //Try to implement these functions with pattern matching after completing https://www.scala-exercises.org/std_lib/pattern_matching
  def increaseLondonHotelPrices(list: List[Hotel], increaseBy: Int): List[Hotel] = {
    list.map {
      case Hotel(name, price, London) => Hotel(name, price + increaseBy, London)
      case hotel => hotel
    }
  }

  //Try to implement recursively. HINT: remember matching on a List
  def returnLastHotel(ls: List[Hotel]): Hotel = ls match {
    case h :: Nil  => h
    case _ :: tail => returnLastHotel(tail)
    case Nil => throw new NoSuchElementException
  }

  //Try to implement recursively. HINT: remember matching on a List
  def returnSecondLastHotel(ls: List[Hotel]): Hotel = ls match {
    case h :: _ :: Nil  => h
    case _ :: tail => returnSecondLastHotel(tail)
    case Nil => throw new NoSuchElementException
  }

}
