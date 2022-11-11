import java.io.PrintWriter
import scala.io.Source

object fileIO{
    def main(args: Array[String]):Unit={

        val writer = new PrintWriter("test.txt")
        writer.write("This is some new text\nHere is somemore text")
        writer.close()

        val textReader = Source.fromFile("test.txt","UTF-8")
        val lineIterator = textReader.getLines()
        for(line <- lineIterator)
        println(line)
    }
}