class A extends Object
{
	int num= 1;
}

class B extends A
{
	int num=2;
	public int getValue()
	{
		int num=3;
//		return this.num;
		return super.num;
	}
}


public class Demo
{
	public static void main(String a[]) 
	{
		B obj=new B();
//		System.out.println(obj.num);
		System.out.println(obj.getValue());
	}
}

==============================================================================================================================================================
In Java, the super keyword is used to refer to the immediate parent class of the current object. It plays a crucial role in inheritance, allowing a subclass 
to access members (fields, methods, and constructors) of its superclass.
--------------------------------------------------------------------------------------------------------------------------------------------------------------
✅ 1. Accessing Parent Class Variables
If a subclass has a field with the same name as its superclass, super helps distinguish between them.

class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";

    void printNames() {
        System.out.println(name);        // Dog
        System.out.println(super.name);  // Animal
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------
✅ 2. Calling Parent Class Methods
You can use super.methodName() to call a method defined in the parent class, especially when it is overridden in the subclass.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // Calls Animal's sound()
        System.out.println("Dog barks");
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------
✅ 3. Calling Parent Class Constructor
You can use super() to explicitly call a constructor of the parent class. This must be the first statement in the subclass constructor.

class Animal {
    Animal(String type) {
        System.out.println("Animal is: " + type);
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog"); // Calls Animal's constructor
        System.out.println("Dog constructor called");
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------
✅ 4. Constructor Chaining with super()
When a subclass constructor calls a superclass constructor, it helps initialize the parent part of the object.

class Person {
    Person(String name) {
        System.out.println("Person: " + name);
    }
}

class Student extends Person {
    Student(String name) {
        super(name); // Must be the first line
        System.out.println("Student: " + name);
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Rules of super
Rule	                   Description
super.variable	           Accesses parent class variable
super.method()	           Calls parent class method
super()	                   Calls parent class constructor
Must be first	           super() must be the first statement in a constructor
No static access	   super cannot be used to access static members
--------------------------------------------------------------------------------------------------------------------------------------------------------------
Comparison: this vs super
Keyword	Refers to
this	Current class instance
super	Immediate parent class instance
==============================================================================================================================================================
