
/*
class strict{
  val e ={
    println("strict");
    9
  }
}
class lazyEval {
  lazy val l = {
    println("lazy");
    9
  }
}

object lazy_evaluation {
  def main(args: Array[String]): Unit ={
    //lazy val l = 9
    //print(l)
    val x = new strict;
    val y = new lazyEval;

    println(x.e)
    println(y.l)
  }

}
*/
object Demo{
  def method1(n:Int): Unit ={
    println("Method 1");
    println(n);
  }
  def method2(n: => Int): Unit ={
    println("Method 2");
    println(n);
  }
  def main(args: Array[String]): Unit ={
   val add = (a: Int, b: Int) => {
     println("Add");
     a+b
   }
    method1(add(5,6));
    method2(add(5,6))
  }
}