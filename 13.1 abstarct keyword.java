abstract class Car
{
//	public void drive()
//	{
//
//	}
	
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic()
	{
		System.out.println("play music");
	}
}

abstract class WagnoR extends Car
{
//	public void fly()
//	{
//		System.out.println("Flying...");
//	}
	public void drive()
	{
		System.out.println("Driving...");
	}
}

class UpdateWagnoR extends WagnoR   //concrete class
{
	public void fly()
	{
		System.out.println("flying...");
	}
}

public class  Demo{
    public static void main(String[] args) {

 //   	Car obj=new Car();
 //   	Car obj=new WagnoR();
    	Car obj=new UpdateWagnoR();
    	obj.drive();
    	obj.playMusic();
    }
}

===============================================================================================================================================================

In Java, the abstract keyword is a modifier used for classes and methods. It plays a crucial role in object-oriented programming by supporting
abstraction, one of the four fundamental OOP principles (along with encapsulation, inheritance, and polymorphism).
----------------------------------------------------------------------------------------------------------------------------------------------------------------
1. What is Abstraction?
Abstraction is the process of hiding the implementation details and showing only the essential features of an object. It helps in reducing complexity 
and increasing efficiency.
----------------------------------------------------------------------------------------------------------------------------------------------------------------
2. Abstract Classes
An abstract class in Java is a class that cannot be instantiated on its own. It is meant to be subclassed, and it can contain both:

Abstract methods (methods without a body)
Concrete methods (methods with a body)

abstract class Animal {
    abstract void makeSound(); // abstract method

    void eat() {               // concrete method
        System.out.println("This animal eats food.");
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Points:
You cannot create an object of an abstract class.
It can have constructors, fields, and methods (both abstract and non-abstract).
It is used when you want to provide a common base class with some shared code and some methods that must be implemented by subclasses.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
 3. Abstract Methods
An abstract method is a method that is declared without an implementation. It only has a method signature and must be implemented by any concrete subclass.
syntax: abstract void makeSound();
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
Rules:
Abstract methods must be declared inside an abstract class.
Subclasses that extend the abstract class must override all abstract methods, unless the subclass is also abstract.
--------------------------------------------------------------------------------------------------------------------------------------------------------------
abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Bark
        myDog.sleep();     // Output: Sleeping...
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------
5. Why Use abstract?
To enforce a contract for subclasses.
To share common code while still requiring specific behavior to be defined by subclasses.
To design flexible and extensible systems using polymorphism.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
6. Abstract Class vs Interface
Feature	                Abstract Class	                        Interface
Can have method bodies	    Yes	                                Since Java 8, yes (default/static)
Can have constructors	    Yes                                 No
Multiple inheritance	    No (only one abstract class)        Yes (can implement multiple)
Fields	                    Can have instance variables	Only    static final constants
===============================================================================================================================================================
