object Loop3 {
  def main(args: Array[String]): Unit = {
    var num=15
    for (i <- 5 to 1 by -1) {
      for (j <- i to 1 by -1) {
        //print(num + "  ")
        //num=num-1
        print(i+" ")
      }
      println()
    }
    println()
    for (i <- 1 to 5 by 1) {
      for (j <- 1 to i by 1) {
        //print(num + "  ")
        //num=num-1
        print(i + " ")
      }
      println()
    }
  }
}
