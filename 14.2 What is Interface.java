interface A
{
//	public abstract void show();
//	public abstract void config();
	int age=44;            // final and static 
	String area="Mumbai";
	
	void show();
	void config();
}

class B implements A
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
}

public class Demo {
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A.area);
        
    }
}

===========================================================================================================================================================================================================
🔹 What is an Interface in Java?
An interface in Java is a reference type, similar to a class, that can contain:

Abstract methods (methods without a body)
Default methods (methods with a body, introduced in Java 8)
Static methods
Constants (public, static, and final variables)
It is used to specify a contract that classes must follow. Think of it as a blueprint for classes.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔹 Why Use Interfaces?
Abstraction: Interfaces allow you to define what a class should do, not how.
Multiple Inheritance: Java doesn't support multiple inheritance with classes, but interfaces allow it.
Loose Coupling: Interfaces help in designing loosely coupled systems.
Polymorphism: You can use interfaces to achieve runtime polymorphism.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔹 Syntax of an Interface
public interface Animal {
    void eat(); // abstract method
    void sleep();
}

Any class that implements this interface must provide implementations for all its methods:

public class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats bones");
    }

    public void sleep() {
        System.out.println("Dog sleeps in kennel");
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔹 Key Characteristics
Feature	                                                       Description
All methods are public and abstract by default	               Unless marked as default or static
Variables are public, static, and final                        Constants only
Cannot be instantiated	                                       You cannot create objects of an interface
Can extend multiple interfaces	                               Unlike classes, interfaces can extend more than one interface
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔹 Default and Static Methods (Java 8+)
public interface Vehicle {
    void start();

    default void honk() {
        System.out.println("Honking...");
    }

    static void service() {
        System.out.println("Vehicle service");
    }
}
Default methods allow interfaces to have method implementations.
Static methods belong to the interface itself, not to instances.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔹 Functional Interfaces (Java 8+)
A functional interface has exactly one abstract method. It can have multiple default or static methods.
@FunctionalInterface
public interface Calculator {
    int operate(int a, int b);
}
Used heavily in lambda expressions and streams.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔹 Advanced Concepts
1. Interface Inheritance
interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2. Multiple Interface Implementation
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() { System.out.println("Duck flies"); }
    public void swim() { System.out.println("Duck swims"); }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3. Marker Interfaces
Interfaces with no methods. Used to mark a class for a specific purpose.

Example: Serializable, Cloneable
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔹 Summary
Interfaces define what a class should do.
They support multiple inheritance.
They are essential for abstraction, polymorphism, and loose coupling.
Java 8+ added default and static methods.
Java 8+ also introduced functional interfaces for lambda expressions.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
