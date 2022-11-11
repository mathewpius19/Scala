object PrimeNumber{
    def main (args: Array[String]){

        def primeNumbers(){
            var primes = List(1,2,3,5,7,11)
            for(i <- primes){
                if(i==11){ // break statement
                    return
                }

                if(i!=1){  //continue statement
                    println(i) 
                }
            }
        }
        primeNumbers()
    }
}