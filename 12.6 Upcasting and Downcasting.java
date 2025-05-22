class A
{
	public void show1()
	{
		System.out.println("in A show");
	}
}
class B extends A
{
	public void show2()
	{
		System.out.println("in show B");
	}
}

public class  Demo{
    public static void main(String[] args) {

//    	double d=4.5;
//    	int i=(int)d;
//    	
//    	System.out.println(i);
    	
//    	A obj= new A();
//    	A obj=(A) new B();   //upcasting
//    	obj.show1();
    	
    	A obj=new B();
    	obj.show1();
    	
    	B obj1=(B)obj;
    	obj1.show2();
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------
✅ What is Upcasting?
Upcasting is when a subclass object is treated as a superclass object. This is safe and implicit, meaning you don’t need to write any special code to do it.

📌 Why Use It?
To achieve polymorphism
To write generic code that works with superclass types

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        a.sound();             // Calls Dog's overridden method
        // a.fetch();          // ❌ Not allowed: Animal reference doesn't know about fetch()
    }
}

✅ Key Points:
Only methods available in the superclass can be called.
Overridden methods in the subclass will still execute (runtime polymorphism).

✅ Key Points:
Only methods available in the superclass can be called.
Overridden methods in the subclass will still execute (runtime polymorphism).
🔽 Downcasting (Narrowing)
❗ What is Downcasting?
Downcasting is when a superclass reference is explicitly cast back to a subclass. This is not always safe and must be done manually.

📌 Why Use It?
To access subclass-specific methods or fields

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        Animal a = new Dog();     // Upcasting
        Dog d = (Dog) a;          // Downcasting
   	d.fetch();                // Now we can call Dog-specific method
    }
}

Animal a = new Animal();
Dog d = (Dog) a;  // ❌ Runtime error: ClassCastException


