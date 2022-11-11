object functions {
  def main(args: Array[String]) {

    def getValue(num1: Int = 1, num2: Int = 2): Int = {
      return num1 + num2
    }

    println("5 + 4 = " + getValue(5, 4))
  }

  def hi(): Unit = {
    println("Hi, how are you")
  }

  hi;

  def getMultipleValueSum(args: Int*): Int = { // if u have multiple integer arguments coming into the function

    var sum = 0;
    for (num <- args) { // to loop through the arguments
      sum += num
    }
    sum
  }
  println(getMultipleValueSum(1, 2, 3, 4, 5, 6))

  def factorial(num1: BigInt): BigInt = { // calling factorial using recurrsion
    if (num1 <= 1) {
      return 1
    } else {
      return num1 * factorial(num1 - 1);
    }
  }
  println("The factorial of 5 is " + factorial(5))
}
