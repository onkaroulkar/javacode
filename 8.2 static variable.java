class Mobile{
	String brand;
	int price;
	String network;
//	String name;
	static String name;
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
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
		
		//System.out.println(obj1.brand);

	
	}
}


=================================================================================================================================================================

🔹 What is a Static Variable in Java?
A static variable in Java is a class-level variable that is shared among all instances of the class. It is declared using the static keyword.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Characteristics
Feature	Description
Memory	        Stored in the Method Area (not in heap like instance variables).
Lifetime	Exists for the entire duration of the program.
Access	        Can be accessed using the class name or an object.
Shared	        Common to all instances of the class.
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Static Variables in Inheritance
Static variables are inherited, but they are not overridden.

class Parent {
    static int value = 10;
}

class Child extends Parent {
    static int value = 20;  // Hides Parent's value, doesn't override
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Static Blocks and Initialization
You can initialize static variables using a static block, which runs once when the class is loaded.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
Use Cases of Static Variables
Counters (e.g., number of objects created)
Constants (e.g., static final double PI = 3.14;)
Shared Configuration (e.g., database settings)
Utility Classes (e.g., Math.PI)
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Best Practices
✅ Use static variables for:

Constants (static final)
Shared data across instances
===================================================================================================================================================================
