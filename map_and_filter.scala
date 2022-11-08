object map_and_filter {
  val lst = List(1, 2, 3,5,7,10,13);
  val mymap = Map(1 -> "Tom", 2 -> "Max", 3 -> "JOhn")

  def main(args: Array[String]): Unit = {
    println(lst.map(_* 2))
    println(lst.map((x => x * 2)));
    println(lst.map(x => "hi" * x))
    println(mymap.mapValues(x => "hi" + x));
    println("hello".map(_.toUpper));
    println(List(List(1,2,3), List(3,4,5)).flatten);
    println(lst.flatMap(x => List(x, x+1) ))

    println(lst.filter(x => x%2 == 0))
  }
}
