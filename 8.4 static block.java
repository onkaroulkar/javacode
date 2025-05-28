class Mobile{
	String brand;
	int price;
	String network;
	static String name;
	
	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	public Mobile() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		Class.forName("Mobile");
		
//		Mobile obj1=new Mobile();
//		obj1.brand="Apple";
//		obj1.price=1500;
//		Mobile.name="SmartPhone";
//		
//		Mobile obj2=new Mobile();

	
	}
}
=================================================================================================================================================================

What is a Static Block?
A static block (also called a static initialization block) is a block of code inside a class that is executed only once, when the class is loaded into memory
by the Java Virtual Machine (JVM).
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
No method name.
No return type.
Runs automatically when the class is loaded.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Characteristics
Feature	Description
Execution Time	    When the class is loaded (before main() or any static method runs)
Runs	            Only once per class loading
Purpose	            Initialize static variables or perform setup tasks
Access	            Can only access static members directly
Order	            Executes in the order it appears in the class  
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
Example: Static Block with Static Variable
class Config {
    static int setting;

    static {
        setting = 42;
        System.out.println("Static block initialized setting to " + setting);
    }

    public static void main(String[] args) {
        System.out.println("Main method: setting = " + setting);
    }
}

Output:
Static block initialized setting to 42
Main method: setting = 42
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Multiple Static Blocks
You can have more than one static block. They execute in the order they appear.

class MultiBlock {
    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}

Output:
Block 1
Block 2
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
Use Cases
✅ Complex Static Initialization
When initializing static variables requires logic (e.g., reading from a file or computation).

✅ Logging or Debugging
To log when a class is loaded.

✅ Loading Native Libraries
Used to load native code with System.loadLibrary().
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
