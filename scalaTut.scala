// import scala.math._
// println("5 + 4 ="+ (5+4))

// var num = abs(-5)
// println(num);

// //pow, round, ceil, sqrt, cbrt, etc math functions

// // for random values

// println((random *(11-1)+1).toInt)

// loops

object ScalaTutorial{
    def main(args: Array[String]){
        var i=1;
        while(i<=10){
            println (i)
            i+=1
        }
        println("")

        //do while loop
        var j=1
        do{
            println(j)
            j+=1
        }while(j<=10)
        println("")

        forLoop()
        itter()
        evenList()

        for( i<- 10 to 0 by -1){
        print(i+" ")} // this for itterating in reverse order using forloop
        

        for(i <- 0 until 10){ // this is same as i=0;i<10;i++
            print(i+" ")
        }
        for(i <- 1 to 10){ // this is same as i=1;i<=10;i++
            print(i+" ")
        }

    }


// for loop
    def forLoop(){
    var randLetters = "Mathew Pius"
    for(i <- 0 until randLetters.length)
    println(randLetters(i))
}

// itterate through a list
def itter(){
val alist = List(1,2,3,4,5)
for(i <- alist){
    println("List item "+ i)
}
}

def evenList(){
    var evenList = for{ i <- 1 to 20
    if(i%2)==0}
    yield i
    

    for(i <- evenList){
        println(i)
    }
}



}


