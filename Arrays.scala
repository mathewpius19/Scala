import scala.collection.mutable.ArrayBuffer

object arrays {
  def main(args: Array[String]) {

    // array
    var favNums = new Array[Int](20);
    var friends = Array("bob", "alice")
    friends(0) = "Sue"
    println(friends(0))

    // array buffer

    var friends2 = ArrayBuffer[String]()
    friends2.insert(0, "Mathew");
    friends2 += "Mark";
    friends2 ++= Array("Jan", "Paul");
    friends2.insert(1, "Mike", "Sally", "Sam")

    var friend = " ";
    for (friend <- friends2) {
      println(friend)
    }

    friends2.remove(1, 2)
    for (friend <- friends2) {
      println("Updated array " + friend)
    }

    // using for loop to add valus to array

    for (j <- 0 to (favNums.length - 1)) {
      favNums(j) = j
    }

    // to apply a function on each element in the array
    var favNumsMultipliedBy2 = for (num <- favNums) yield 2 * num;

    favNumsMultipliedBy2.foreach(println)

    var favNumsDivisibleBy4 = for (num <- favNums if num % 4 == 0) yield num;

    favNumsDivisibleBy4.foreach(println)

    // using a multi dimensional array

    var multTable = Array.ofDim[Int](10, 10);

    for (i <- 0 to 9) {
      for (j <- 0 to 9) {
        multTable(i)(j) = i * j;
      }
    }

    for (i <- 0 to 9) {
      for (j <- 0 to 9) {
        println(i + "*" + j + "=" + multTable(i)(j))
      }
    }
  }

}
