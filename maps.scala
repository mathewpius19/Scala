object maps {

  def main(args: Array[String]): Unit = {

    val employees = Map("Manager" -> "Mathew", "Secretary" -> "Janelle")

    println("all employess "+employees)
    if (employees.contains("Manager")) {
      printf("Manager: %s\n", employees("Manager"));
    }

    val customers = collection.mutable.Map(100 -> "Paul", 101 -> "Sally Smith")
    printf("Cust1: %s\n", customers(100))

    customers(100) = "Mathew"

    for ((k, v) <- customers) {
      println("Key: " + k)
      println("Value: " + v)
    }
  }
}
