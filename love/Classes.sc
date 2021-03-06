
import java.util.jar.Attributes.Name

/*
 *
 a) Создать класс Animal, который имеет следующие поля:
 *      - name: String (название)
 *      - species: String (вид)
 *      - food: String
 *
 *    Синтаксис: class MyClass(val publicField: Int, privateField: String) {
 *              // остальные поля и методы
 *            }
 *
 * b) Создайте объект-компаньон для класса Animal и добавьте следующие сущности как поля:
 *      - cat, mammal, meat
 *      - parrot, bird, vegetables
 *      - goldfish, fish, plants
 *
 *    Синтаксис: object MyClass {
 *              // статические поля и методы
 *            }
 *
 * c) Добавьте следующие метод в Animals:
 *      def eats(food: String): Boolean
 *
 *     который проверяет ест ли животное определенную пищу
 *
 * d) Переопределите ваш класс Animal как трейт и создайте объекты класса-образца для Mammals, Birds и Fishs.
 *    Вам все еще нужно поле `species`?
 *
 * e) Добавьте следующие функции в объект-компаньон Animal:
 *      def knownAnimal(name: String): Boolean  // true если это имя одного из трех животных из (b)
 *      def apply(name: String): Option[Animal] // возвращает одно из трех животных в соответствии с именем (Some) или ничего (None), см. ниже
 *
 * f) Создайте трейт Food со следующими классами-образцами:
 *      - Meat
 *      - Vegetables
 *      - Plants
 *   и добавьте это в определение Animal. Так же добавьте объект-компаньон с методом apply():
 *      def apply(food: String): Option[Food]
 */

trait Animal {
  val name: String
  val food: String
  def eats(food: String): Boolean = return this.food.equals(food)
}

case class Mammals(name: String, food: String) extends Animal
case class Birds(name: String, food: String) extends Animal
case class Fishs(name: String, food: String) extends Animal

object Animal {``

  trait Food

  case object Meat extends Food
  case object Vegetables extends Food
  case object Plants extends Food

  val cat = Mammals("cat", "meat")
  val parrot = Birds("parrot", "vegetables")
  val goldfish = Fishs("goldfish", "seaweed")

  def knownAnimal(name: String): Boolean =
    name.equals(cat.name) || name.equals(parrot.name) ||
      name.equals(goldfish.name)

  def apply(name: String): Option[Animal] = {
    name match {
      case cat.name => Some(cat)
      case parrot.name => Some(parrot)
      case goldfish.name => Some(goldfish)
      case _ => None
    }
  }
}