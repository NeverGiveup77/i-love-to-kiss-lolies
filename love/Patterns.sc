/** Напишите решение в виде функции.
 *
 * Синтаксис:
 *   val a: Int = ???
 *
 *   a match {
 *     case 0 => true
 *     case _ => false
 *   }
 */
object PatternMatching {

  sealed trait Hand
  case object Rock    extends Hand
  case object Paper   extends Hand
  case object Scissor extends Hand

  sealed trait Result
  case object Win  extends Result
  case object Lose extends Result
  case object Draw extends Result

  sealed trait Food
  case object Meat       extends Food
  case object Vegetables extends Food
  case object Plants     extends Food

  sealed trait Animal {

    val name: String
    val food: Food
  }
  case class Mammal(name: String, food: Food, weight: Int) extends Animal
  case class Fish(name: String, food: Food)                extends Animal
  case class Bird(name: String, food: Food)                extends Animal



  /* a) Напишите функцию, которая ставит в соответствие числу строку слудеющим образом:
   * Если:
   *     1 => "it is one"
   *     2 => "it is two"
   *     3 => "it is three"
   *     иначе => "what's that"
   */
  def IntToString(a:Int): String = {
        a match {
          case 1 => "it is one"
          case 2 => "it is two"
          case 3 => "it is three"
          case _ => "what's that"
        }
  }

  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testIntToString(value: Int): String = value.toString
  IntToString(2)

  /* b) Напишите функцию которая возвращает true если переменная `value` принимает значение:
   *     "max" или "Max
   *     "moritz" или "Moritz"
   */
  def IsMaxAndMoritz(value: String): Boolean = {
    value match {
      case "max" => true
      case "Max" => true
      case "moritz" => true
      case "Moritz" => true
      case _ => false
    }
  }


  // примените функции из пункта (b) здесь, не изменяя сигнатуру
  def testIsMaxAndMoritz(value: String): Boolean = false
  IsMaxAndMoritz("max")
  // c) Напишите функцию проверки является ли `value` четным
  def IsEven(value: Int): Boolean = {
    if value % 2 == 0 then true
    false
  }

  // примените функции из пункта (c) здесь, не изменяя сигнатуру
  def testIsEven(value: Int): Boolean = false
  IsEven(2)


  /* d) Напишите функцию, моделирующую игру в Камень ножницы бумага
   *     1. камень побеждает ножницы
   *     2. ножницы побеждают бумагу
   *     3. бумага побеждает камень
   *    Выиграет ли игрок `a`?
   */
  def WinsA(a: Hand, b: Hand): Result = {
    (a,b) match {
      case (b, a) => Draw
      case (Rock, Scissor) => Win
      case (Scissor, Paper) => Win
      case (Paper, Rock) => Win
      case _ => Lose
    }
  }


  // примените вашу функцию из пункта (d) здесь, не изменяя сигнатуру
  def testWinsA(a: Hand, b: Hand): Result = Draw
  WinsA(Rock, Paper)


  // Примечание: используйте определение Animals

  // e) Верните вес (weight: Int) объекта Mammal, иначе верните -1.
  def ExtractMammalWeight(animal: Animal): Int = {
    animal match {
      case Mammal(_, _, weight) => weight
      case _ => -1
    }
  }


  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testExtractMammalWeight(animal: Animal): Int = 0
  val Masha = Mammal("Masha", Plants, 100)
  ExtractMammalWeight(Masha)

  // f) Измените поле еда   объектов классов Fishes и Birds на Plants, класс Mammels оставьте неизмененным.
  def UpdateFood(animal: Animal): Animal = {
    animal match {
      case Fish(animal.name, animal.food) => Fish(animal.name, Plants)
      case Bird(animal.name, animal.food) => Bird(animal.name, Plants)
    }
  }

  // примените функцию из пункта (f) здесь, не изменяйте сигнатуру
  def testUpdateFood(animal: Animal): Animal = animal
  var katya = Fish("Katya", Vegetables)
  UpdateFood(katya)
}
