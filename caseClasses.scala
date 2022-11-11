object caseClass{

    def main(args:Array[String]):Unit={
        val vanillaDonut :Donut=VanillaDonut("Vanilla")
        vanillaDonut.printName; 
    }
    //using case class
  case class doggo(name:String,breed:String,dogId :Option[Long]=None)
  val poodle :doggo = doggo("munch","poodle")
  println(s"${poodle.name}")
  println(s"${poodle.breed}")
  println(s"${poodle.dogId}")

  import implicitDog._
  println(s"${poodle.newNum}")

  //using implicit class to declare extension methods to modify values in an object
  object implicitDog{
    implicit class AugmentedDog(doggo:doggo){
      def newNum :String= s"${doggo.name} - ${doggo.dogId.getOrElse(1234)}"
    }
  }

  //using case class in inheritance

  //defining an abstract class

  abstract class Donut(name:String){

    def printName:Unit
  }

  // here we override the abstract class method by defining it.

  //VanillaDonut is a case class so a companion object is not required
  case class VanillaDonut(name:String) extends Donut(name){

   override def printName: Unit = {
    println("Donut name =="+name)
   }
  }
}