object higher_order_functions {
  //Higher-Order Functions
  def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y);
  var add1 = (x: Int, y: Int) => x + y;
  println(add1(7, 3))
  val result2 = math(50, 20, (x, y) => x * y);
  val result3 = math(50, 20, (x, y) => x max y);
  println(result2)
  println(result3)

  def main(args: Array[String]): Unit = {
    println("Hello world!")
  }
}
