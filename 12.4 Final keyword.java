//final - variable, method, class

//final class Calc
//{
//	public void show()
//	{
//		System.out.println("in Calc show");
//	}
//	public void add(int a, int b)
//	{
//		System.out.println(a+b);
//	}
//}


class Calc
{
	public final void show()
	{
		System.out.println("By Navin");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

class AdvCalc extends Calc
{
	public void show()
	{
		System.out.println("By John");
	
}

	
public class  Demo{
    public static void main(String[] args) {
        
//    	final int num=8;
//    	num=9;
//    	System.out.println(num);
    	
//    	Calc obj= new Calc();
//    	obj.show();
//    	obj.add(4, 5);
    	
    	AdvCalc obj= new AdvCalc();
    	obj.show();
    	obj.add(4, 5);
    }
}
	
==============================================================================================================================================================
In Java, the final keyword is a non-access modifier used to restrict the user in various ways. It can be applied to variables, methods, and classes, 
and its behavior changes depending on where it's used.
--------------------------------------------------------------------------------------------------------------------------------------------------------------
✅ 1. Final Variables
A variable declared with final cannot be reassigned once it has been initialized.

final int MAX_SPEED = 120;
MAX_SPEED = 150; // ❌ Compilation error
--------------------------------------------------------------------------------------------------------------------------------------------------------------
Final primitive variables: Value cannot be changed.
Final reference variables: Reference cannot be changed, but the object’s internal state can be modified.

final List<String> names = new ArrayList<>();
names.add("Alice"); // ✅ Allowed
names = new ArrayList<>(); // ❌ Not allowed
--------------------------------------------------------------------------------------------------------------------------------------------------------------
2. Final Methods
A method declared as final cannot be overridden by subclasses.

class Vehicle {
    final void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    // void run() { } // ❌ Compilation error: Cannot override final method
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------
3. Final Classes
A class declared as final cannot be extended (i.e., no subclassing allowed).

final class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

// class Dog extends Animal { } // ❌ Compilation error
---------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Points to Remember
Use Case	Effect of final
Variable	Value cannot be changed after initialization
Method	        Cannot be overridden
Class	        Cannot be subclassed
--------------------------------------------------------------------------------------------------------------------------------------------------------------
⚠️ Common Mistakes
Declaring a final variable without initializing it (unless it's a blank final variable in a constructor).
Trying to override a final method.
Trying to extend a final class like java.lang.String.
==============================================================================================================================================================
