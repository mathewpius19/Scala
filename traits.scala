object traitsTut{
    trait myTrait{

        //non abstract method
        def greeting = print("hello\n")

        //abstract method
        def action = {}

    }
    //if there are multiple traits, we have to use 'extends' keyword then 'with' keyword  
    //eg: class myClass extends trait1 with trait2 with trait3 .......
    class myClass extends myTrait{

        //implementation of abstract method is needed

        override def action: Unit = {
            print("Walking")
        }
    }

    def main(args:Array[String]):Unit={
        val obj = new myClass();
        obj.greeting
        obj.action;
    }
}