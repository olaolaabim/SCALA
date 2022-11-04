object while_doWhile {
  def main(args: Array[String]): Unit = {
    var d = 0
    while ( {
      d < 10
    }) {
      println("x = " + d)
      d += 1
    }
    var f = 0
    do {
      println("y = " + f)
      f += 1
    } while ( {
      f < 10
    })
  }
}
