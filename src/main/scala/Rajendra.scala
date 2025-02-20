object Rajendra {
  def main(args: Array[String]): Unit = {
    var num=1
    for (i <- 0 to 5 by 1) {
      for (j <- 1 to i by 1) {
        print(num )
        num=num+1
      }
      println()
    }
  }
}
