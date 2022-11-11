
import scala.io.StdIn.{readLine,readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source
object userInput{
    def main(args: Array[String]){

        var number = 0
        // do{
        //     print("Guess a number ")
        //     number = readLine.toInt

        // }while(number!=15)

        // println("The secret number is "+ 15);
    }

    var name = "Mathew"
    var age = 22
    var weight = 74.556

    println(s"My name is $name")
    println(f"My age is ${age} and my weight is ${weight}%.2f")

    var randSent = "I saw a dragon fly by"
    println(randSent(3)) // to show the 3rd index of the string

    println(randSent.concat(" and explode")) // to concat a substring to the given string

    //to compare two strings
    println("are the strings equal =  "+ "the dragon".equals(randSent));

    // to get the index of a word in a sentence

    println("the dragon starts at index "+ randSent.indexOf("dragon"))

    //converts string to an array

    var randSentArr = randSent.toArray
    for( v <- randSent){
        print(v)
    }
}