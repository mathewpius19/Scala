import scala.collection.immutable.ListSet
import scala.collection.immutable.ListMap
import scala.collection.immutable.Queue
//listSet
val listSet: ListSet[String] = ListSet("Mathew","Jan","Mike")
println(listSet)

//adding 2 list sets together
val listSet2 = listSet++ListSet("Luke")
println(listSet2)

//remove elements from list set
val listSet3:ListSet[String] = listSet-("Mathew")
println(listSet3)

//List Map

val listMap1: ListMap[String,String] = ListMap("Animal"->"Dog", "Breed"->"Poodle", "Colour"->"Brown")
println(listMap1)

//adding elements to list map
val listMap2 : ListMap[String,String] = listMap1 + ("Name"-> "Zoey")
println(listMap2)

//adding 2 lists to together
val listMap3 = listMap1 ++ listMap2
println(listMap3)

//removing element from listMap
val listMap4 :ListMap[String,String] = listMap3 - ("Colour")
println(listMap4) 

//Initialise empty ListMap
val listMap5 :ListMap[String,String] = ListMap.empty[String,String]
println(listMap5)

//Immutable Queue

val queue1 :Queue[String] = Queue("Dog","Cat","Bird","Horse")
println(queue1)

//adding elements to queue (enqueue)
val queue2 :Queue[String] = queue1:+("Lion")
println(queue2)

//remove elements from queue(dequeue)
val deqeue: (String, Queue[String]) = queue2.dequeue
println("element dequeued "+deqeue._1)
println("elements remaining after dequeued"+ deqeue._2)

//immutable stack
val stack1: List[String] = List("Bahrain", "India", "America")
println(s"Elements of stack1 = $stack1")

//adding element to top of stack
val stack2: List[String] = "Brazil" :: stack1
println(s"Using an Immutable List for stack, elements after push = $stack2")

//pop element from top of stack

val stack3 : List[String] = stack2.tail
println(s"elements after popping top element of stack ${stack3}") 

//Streams

//streams are lazily computed so we only get the first element
val stream1 :Stream[Int]  = 1#::2#::3#::Stream.empty
println("Elements of stream"+ stream1)


//to print all the elements we specify a count of values to be printed
stream1.take(5).print

//vectors

val vector1: Vector[String] = Vector("BMW", "Mercedes", "Ferrari")
println(s"\nElements of vector1 = $vector1")

//appending values at the end
val vector2 = vector1 :+ "Toyota"
println(s"Adding elements to Vector using :+ = $vector2")

//prepending values to the start

val vector3 = "nissan"+:vector1
println(s"Adding elements to Vector using :+ = $vector3")