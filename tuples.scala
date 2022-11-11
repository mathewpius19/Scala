object tuples {
  def main(args: Array[String]): Unit = {

    var tupleMarge = (103, "Marge Simpson", 10.25);

    tupleMarge.productIterator.foreach(i => println(i))

    printf("%s owes $%.2f\n", tupleMarge._2, tupleMarge._3);

    println(tupleMarge.toString())
  }
}
