package org.mysysdev.mykotlin
// Hello World Program
fun main(args : Array<String>) {
    print("The value is: ")
    println(9+10)
    var user = User("Hassan", 142255, 33)
    println(user)
    println(user.id)
    println(user.age)

    var dog = Dog()
    print("The dog " + dog.canBark())
}

class User(name:String){
    var id:Int = 0
    var age: Int = 0;
        init {
            print("my name is $name and age is $age")
        }
    constructor(n:String, id:Int, age:Int): this(n){
        this.id = id
        this.age = age
    }


}


class Dog: Animal(){
    fun canBark(): String {
        return "Can back"
    }
}

class Cat{
    fun canMeouw(){
        println("Nyau")
    }
}

open class Animal{
    fun canEat(){
        print("eat")
    }
}
