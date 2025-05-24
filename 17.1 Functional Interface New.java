@FunctionalInterface
interface A
{
	void show();
//	void run();
}
//class B implements A
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


public class Demo {
    public static void main(String[] args) {
    	
    	A obj=new A()
    	{    	
    		public void show()
    		{
    			System.out.println("in Show");
    		}
    	};
 //   	A obj=new A();
 //   	A obj=new B();
    	obj.show();
    }
}

=====================================================================================================================================================================

default methods and static methods are features introduced in Java 8 for interfaces. They allow you to provide implementations inside interfaces,
which was previously not possible.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Default Methods in Java
A default method is a method in an interface that has a body (implementation). It is declared using the default keyword.
Why Are Default Methods Useful?
- Allows adding new methods to interfaces without breaking existing implementations.
- Helps in evolving APIs gracefully.
interface Vehicle {
    void speedUp(); // Abstract method (must be implemented in subclass)

    default void showType() {
        System.out.println("This is a vehicle");
    }
}

class Car implements Vehicle {
    @Override
    public void speedUp() {
        System.out.println("Car is speeding up!");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp();   // Calls overridden method
        car.showType();  // Calls default method from interface
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Points
✔ Default methods allow interfaces to have implementations
✔ Classes implementing the interface can override them
✔ Default methods help in maintaining backward compatibility
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
2. Static Methods in Java
A static method in an interface is like a utility method that belongs to the interface itself, not to any instance.
Why Use Static Methods in Interfaces?
- Allows utility methods related to the interface.
- Prevents polluting helper methods inside implementing classes.
	
interface MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 10); // Calls static method directly from interface
        System.out.println("Sum: " + sum);
    }
}

Key Points
✔ Static methods belong to the interface itself, not to objects
✔ They are called directly using InterfaceName.methodName()
✔ They cannot be overridden by implementing classes

