class Mobile{
	String brand;
	int price;
	String network;
//	String name;
	static String name;
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	public static void show1(Mobile obj)
	{
//		System.out.println("in static method");
		System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
	}
}

public class Demo {
	public static void main(String[] args) 
	{
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		//obj1.name="SmartPhone";
		Mobile.name="SmartPhone";
		
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.price=1700;
		//obj2.name="SmartPhone";
		Mobile.name="SmartPhone";
		
		//obj1.name="Phone";
		Mobile.name="SmartPhone";
		
		obj1.show();
		obj2.show();
		
		Mobile.show1(obj1);
		
		//System.out.println(obj1.brand);

	
	}
}
=================================================================================================================================================================
What is a Static Method?
A static method belongs to the class rather than any specific object of the class. It is declared using the static keyword and can be called without creating an 
instance of the class.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Characteristics
Feature	Description
Belongs to	The class, not instances
Access	        Via class name (preferred) or object
Memory	        Loaded into memory when the class is loaded
Cannot use	this or super keywords
Can access	Only static variables and other static methods directly
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
Why Use Static Methods?
✅ Utility or Helper Methods
Like Math.sqrt(), Arrays.sort(), etc.

✅ Factory Methods
To create objects in a controlled way.

✅ Main Method
The entry point of any Java program is static:
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Access Rules
From	Can Access
Static Method	Static variables and static methods only
Instance Method	Both static and instance members
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Static Method in Inheritance
Static methods are not overridden, they are hidden.

class Parent {
    static void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    static void greet() {
        System.out.println("Hello from Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent.greet();  // Hello from Parent
        Child.greet();   // Hello from Child
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Best Practices
Use static methods for stateless operations.
Avoid using static methods when you need polymorphism.
Keep static methods pure (no side effects) when possible.
==================================================================================================================================================================

