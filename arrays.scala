import Array._
object arrays {
  val myarray: Array[Int] = new Array[Int](4);
  val myarray2 = new Array[Int](5);
  val array3 = Array(1,2,3,4,5,6,8)
  def main(args: Array[String]) {
    myarray(0) = 20;
    myarray(1) = 50;
    myarray(2) = 10;
    myarray(3) = 30;
    val result = concat(myarray,array3);
    array3.clone()
    for (x <- myarray2){
      println(x);
    }

    for (i <- 0 to (myarray.length - 1)){
      println(myarray(i));
    }
    println(array3.length);
    println();
  }
}
