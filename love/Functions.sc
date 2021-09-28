/** Напишите отдельные функции, решающие поставленную задачу.
 *
 * Синтаксис:
 *   // метод
 *   def myFunction(param0: Int, param1: String): Double = // тело
 *
 *   // значение
 *   val myFunction: (Int, String) => Double (param0, param1) => // тело
 */
object Functions {

  /* a) Напишите функцию, которая рассчитывает площадь окружности
   *    r^2 * Math.PI
   */
  def area(r: Double): Double = {
    math.pow(r, 2) * math.Pi
  }


  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testCircle(r: Double): Double = r
  area(r = 2)


  /* b) Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
   */
  def rectangleArea(a:Int) = (b:Int) => a * b



  // примените вашу функцию из пукта (b) здесь, не изменяя сигнатуру
  def testRectangleCurried(a: Double, b: Double): Double = a
  rectangleArea(2)(3)


  // c) Напишите не карированную функцию для расчета площади прямоугольника.
  def rectangleArea(a:Int, b:Int): Int = {
    a * b
  }


  // примените вашу функцию из пункта (c) здесь, не изменяя сигнатуру
  def testRectangleUc(a: Double, b: Double): Double = a
  rectangleArea(3,4)
}
