import scala.math
object higherOrder{

    def main(args: Array[String]) : Unit={
        
     List(1,2,3,4,5).map((x:Int)=> x*10).foreach(println)
     List(1,2,3,4,5).filter(((x:Int)=> x%2==1)).foreach(println)

        //passing functions into another function

        def times3(num:Int) = num*3
        def times4(num:Int) = num*4

        def multIt(func:(Int) => Double, num:Int)={
            func(num);
        }
        println("3*100 = "+multIt(times3, 100))

        //closure : using values declared outside a function to get values inside it

        var divisorVal = 5;

        def divisorFunc = (num:Double)=>num/divisorVal;
        println("5/5 = "+divisorFunc(10))
    }
}