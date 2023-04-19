fun main() {
 val person =Person("Joan",23)
    person.speak()
    val audi=Car("audi","320",1962,"blue")
    audi.start()
    val cat=Cat("bleow","pusspuss")
    println(cat.makeSound())
    val result=checkVowels("Joanita")
    println(result)

}
//1.Create a class called Person with properties for name and age. Write a method
//called speak that prints "Hello, my name is {name} and I am {age} years old."

class Person(var name:String,var age:Int){
    fun speak(){
        println("Hello,my name is $name and I am $age years old")
    }
}

//Create a data class called User with properties for username and password.
//Write a method called validatePassword that checks if the password contains
// at least one uppercase letter, one lowercase letter, and one number.

data class User (var username:String,var password:Any)


//Create a class called Vehicle with properties for make, model, and year.
// Write a method called start that prints "The {make} {model} is starting up."

open class Vehicle(var make:String,var model:String,var year:Int){
    open fun start(){
        println("The $make $model is starting up")
    }
}
//Create a class called Car that extends Vehicle and adds a property for color.
// Override the start method to print "The {color} {make} {model} is starting up."
 class Car(make: String,model: String,year: Int,var color:String):Vehicle(make,model,year){
    override fun start(){
        println("The {$color} {$make} {$model} is starting up")
    }
}

//Create a class called Rectangle with properties for width and height. Write a method called area
// that returns the area of the rectangle.

class Rectangle(var width:Double,var height:Double){
    fun rectArea():Double{
        return width*height
    }
}
//Create a data class called Point with properties for x and y.
// Write a method called distance that takes  another Point as
// an argument and returns the Euclidean distance between the two points.

data class Point(var x:Int,var y:Int)
fun distance(d:Int){
}
//Create a class called Animal with properties for species and sound. Write a
// method called makeSound that prints "{species} says {sound}."
open class Animal (var species:String,var sound:String){

    open fun makeSound(){
        println("$species says $sound")
    }
}

//Create a class called Dog that extends Animal and sets species to "dog" and sound to "woof".
// Override the makeSound method to print "{species} barks {sound}."

class Dog(species:String="dog",sound:String="woof",):Animal(species,sound){
    override fun makeSound(){
        println("$species barks $sound")
    }
}

//Create a class called Cat that extends Animal and sets species to "cat" and sound to "meow".
// Override the makeSound method to print "{species} meows {sound}."
class Cat(species: String="cat",sound: String="meow"):Animal(species ,sound){
     override fun makeSound(){
         println("$species meows $sound")
    }
}
//Create a class called Person with properties for name and age. Write a method called
// introduce that prints "Hi, my name is {name} and I am {age} years old."

class Persona (var name:String,var age:String){
    fun introduce(){
        println("Hi, my name is $name and I am $age years old")
    }
}
//Write a Kotlin function that accepts a string as a parameter,
// counts and returns the number of vowels within the string

fun checkVowels(word:String):Int{
    val vowels= arrayOf('a','e','i','o','u')
    var sum=0
    for(w in word){
        if (w in vowels){
            sum++
        }

    }
    return sum
}