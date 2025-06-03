Inheritance:-

is, has
is is used in inheritance

Class Calc     //Parent class , Super, Base
{
	add()
	sub()
	multi()
	div()
}

Class AdvCalc     //Child class, Sub, Derived 
{
	{
	}
}
====================================================================================================================================================================
🔍 What is Inheritance?
Inheritance is a mechanism in Java by which one class acquires the properties and behaviors (fields and methods) of another class. It allows for code reuse and establishes a parent-child relationship between classes.

The class that is inherited from is called the superclass (or parent class).
The class that inherits is called the subclass (or child class).
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧬 Syntax of Inheritance
class Superclass {
    // fields and methods
}

class Subclass extends Superclass {
    // additional fields and methods
}

The keyword extends is used to inherit from a class.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧱 Types of Inheritance in Java
Java supports the following types of inheritance:

Single Inheritance (✅ Supported)
Multilevel Inheritance (✅ Supported)
Hierarchical Inheritance (✅ Supported)
Multiple Inheritance (via interfaces) (✅ Supported)
Multiple Inheritance with classes (❌ Not supported directly)
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. 🔹 Single Inheritance
One class inherits from another.
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------
2. 🔹 Multilevel Inheritance
A class inherits from a class which is already a subclass.
class Animal {
    void eat() { System.out.println("Eats food"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barks"); }
}

class Puppy extends Dog {
    void weep() { System.out.println("Weeps"); }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
3. 🔹 Hierarchical Inheritance
Multiple classes inherit from a single superclass.
class Animal {
    void eat() { System.out.println("Eats food"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barks"); }
}

class Cat extends Animal {
    void meow() { System.out.println("Meows"); }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
4. 🔹 Multiple Inheritance (via Interfaces)
Java does not support multiple inheritance with classes to avoid ambiguity (Diamond Problem), but it supports it via interfaces.
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() { System.out.println("A"); }
    public void methodB() { System.out.println("B"); }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧠 Key Concepts in Inheritance
🔸 super Keyword
Used to refer to the immediate parent class.
Access parent class methods:
super.methodName();
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Access parent class methods:
super(); // must be the first statement in the constructor
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔸 Method Overriding
A subclass can override a method of the superclass to provide a specific implementation.
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 instanceof Operator
Used to test whether an object is an instance of a specific class or subclass.
Dog d = new Dog();
System.out.println(d instanceof Animal); // true
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧰 Advantages of Inheritance
Code Reusability: Avoids code duplication.
Method Overriding: Enables runtime polymorphism.
Extensibility: Easy to add new features.
Maintainability: Easier to manage and update code.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
⚠️ Things to Remember
Java does not support multiple inheritance with classes to avoid ambiguity.
Constructors are not inherited, but the superclass constructor can be called using super().
Private members of the superclass are not accessible directly in the subclass.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


