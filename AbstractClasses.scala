object abstractClasses{
    
    def main(args:Array[String]):Unit={
        var wolf = new Wolf("Grey Wolf")
        wolf.moveSpeed = 37.0
        println(wolf.move)
    }

    abstract class Mammal(name:String){
        var moveSpeed : Double;
        def move :String;

    }
    class Wolf (name:String) extends Mammal(name){
        var moveSpeed = 35.0;
        def move = "%s moves with the speed %.2f mph".format(this.name, this.moveSpeed);
    }
}