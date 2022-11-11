object fileIO{
    def main(args: Array[String]):Unit={

        def divideNums (num1:Int, num2:Int)= try{
                num1/num2
        }
        catch{
            case ex: java.lang.ArithmeticException => "Cannot divide by zero"
        }
        finally{
            // End of code
        }

        println("3/0 = "+divideNums(3,0))

    }}