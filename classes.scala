object classes {

  def main(args: Array[String]): Unit = {

    val rover = new Animal
    rover.setName("Rover");
    rover.setSound("Woof")
    println(rover.toString())

    val rover1 = new Animal
    rover1.setName("roverNew");
    rover1.setSound("arrg")
    println(rover1.toString())

    //we use the companion object of the class to create an object without the new keyword
    val whiskers :Animal= Animal("Whiskers", "Meow");
    println(s"${whiskers.getName()} has the sound ${whiskers.getSound()} and id ${whiskers.id}")

    val dobberman = new Dog("Zoey", "Woof","Arrgghh")
    
         println(dobberman.toString())


   

    //static function call
    println(s"${DogBreedClassifier.breedClassifer("dobberman")}")
  }
  // end of main

  class Animal(var name: String, var sound: String) {
    this.setName(name);

    val id = Animal.newIdNum;

    def getName(): String = {
      name
    }

    def getSound(): String = {
      sound
    }

    def setName(name: String): Unit = {
      if (!(name.matches(".*\\d+.*"))) {
        this.name = name
      } else {
        this.name = ("No Name");
      }
    }
    def setSound(sound: String): Unit = {
      this.sound = sound
    }

    def this(name: String) {
      this("No Name", "No Sound")
      this.setName(name)
    }
    def this() {
      this("No Name", "No Sound")
    }

    override def toString(): String = {
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }

  }

  //companion class
  object Animal {

    def apply(name:String, sound:String):Animal={
      new Animal(name,sound)
    }
      //declaring fields and values for companion class.Using private hides visibilty for outside world but is still accessible for Animal class
    private var idNumber=0;
    private def newIdNum = { idNumber += 1; idNumber  }
  }

  //Inheritance
   class Dog(name:String, sound:String, growl:String) extends Animal(name,sound){
    def this(name:String, sound:String){
      this("No Name", sound, "No growl")
      this.setName(name)
    }
    def this(name:String){
      this("No name", "No sound", "No growl")
      this.setName(name)
    }
    def this(){
      this("No name", "No sound", "No growl")
    }
    override def toString(): String = {
      return "%s with the id %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
    }
  }

  //declaring static methods and variables that are globally accessible 
  object DogBreedClassifier{
    //static variables
    val breed1 = "dobberman"
    val breed2 = "labrador"
    val breed3 = "husky"

    //static method

    def breedClassifer(breed:String):String={
      if(breed.equals(breed1)){
        return breed1
      }
      else if(breed.equals(breed2)){
        return breed2
      }
      else if(breed.equals(breed2)){
        return breed3
      }
      else{
        return "breed not found"
      }
    }
  }

  
}
