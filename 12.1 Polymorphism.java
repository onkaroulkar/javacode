Polymorphism:
- Many behaviour ( same object or reference has differnet behaviours)

1. Compile time polymorhism -- Overloading
	add(int, int)
	add(int, int, int)

2. Run time polymorphism -- Overriding
	A
		add(int,int)
	B
		add(int, int)

==========================================================================================================================================================================================================
🔮 What is Polymorphism?
Polymorphism means "many forms". In Java, it allows objects to be treated as instances of their parent class rather than their actual class. The actual method that gets called is determined at runtime 
or compile time, depending on the type of polymorphism.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧠 Types of Polymorphism in Java
Java supports two main types of polymorphism:

Compile-time Polymorphism (also called Static Polymorphism or Method Overloading)
Runtime Polymorphism (also called Dynamic Polymorphism or Method Overriding)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1️⃣ Compile-time Polymorphism (Method Overloading)
🔹 What is it?
When multiple methods in the same class have the same name but different parameters (type, number, or order), it's called method overloading.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔍 Key Points:
Happens within the same class.
Resolved at compile time.
Improves readability and code reuse.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2️⃣ Runtime Polymorphism (Method Overriding)
🔹 What is it?
When a subclass provides a specific implementation of a method that is already defined in its superclass, it's called method overriding.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}



Animal a;
a = new Dog();
a.sound();  // Output: Dog barks

a = new Cat();
a.sound();  // Output: Cat meows

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔍 Key Points:
Happens between superclass and subclass.
Resolved at runtime using dynamic method dispatch.
Enables polymorphic behavior.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧰 Polymorphism with Interfaces
Interfaces are a powerful way to achieve polymorphism in Java.

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

Shape s;
s = new Circle();
s.draw();  // Drawing Circle

s = new Square();
s.draw();  // Drawing Square
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧪 Real-World Analogy
Imagine a remote control (parent class) that can operate different devices like a TV, AC, or Fan (subclasses). You press the same button (method), but the action depends on the device (object type).

⚠️ Important Notes
Feature	                                Compile-time Polymorphism	                    Runtime Polymorphism
Method Type	                        Overloading	                                    Overriding
Resolution Time	                        Compile Time	                                    Runtime
Flexibility	                        Less flexible	                                    More flexible
Inheritance Required?	                No	                                            Yes
Return Type	                        Can be different	                            Must be same or covariant
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
✅ Benefits of Polymorphism
Code Reusability: Write generic code that works with different types.
Scalability: Add new classes without changing existing code.
Maintainability: Easier to manage and extend.
==========================================================================================================================================================================================================
