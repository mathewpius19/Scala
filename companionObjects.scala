object companion{
    class Donut(name:String, productCode:Option[Long]=None){
        def print = println(s"Name is $name and product code is $productCode")
    }

    class GlazedDonut(name:String) extends Donut(name)

    class VanillaDonut(name:String)extends Donut(name)

    object Donut{

        def apply(name:String):Donut={
            name match{

                case "Glazed Donut" => new GlazedDonut(name)
                case "Vanilla Donut" => new VanillaDonut(name)
                case _ => new Donut(name)   // wildcard to create a donut object for anything not vanilla or glazed
            }
        }
    }
    def main(args:Array[String]):Unit={
        val glazed = Donut("Glazed Donut")
        val vanilla = Donut("Vanilla Donut")
        println(glazed.print)
        println(vanilla.print)
    }
}