class A
{
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	
//	class B
//	{
//		public void config()
//		{
//			System.out.println("in config");
//		}
//	}
	
	static class B
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
}


public class  Demo{
    public static void main(String[] args) {
    	A obj=new A();
    	obj.show();
    	
//    	A.B obj1=obj.new B();
//    	obj1.config();
    	
    	A.B obj1=new A.B();
    	obj1.config();

    }
}
============================================================================================================================================

In Java, inner classes are classes defined within another class. They are used to logically group classes that are only used in one place, 
increase encapsulation, and can access members (including private ones) of the outer class.

1. Non-static Inner Class (Member Class)
Defined inside another class but outside any method.
Can access all members of the outer class, including private.
----------------------------------------------------------------------------------------------
class Outer {
    private String msg = "Hello from Outer";

    class Inner {
        void display() {
            System.out.println(msg);  // Accessing outer class member
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();  // Creating inner class object
        inner.display();
    }
}
------------------------------------------------------------------------------------------------

2. Static Nested Class
Defined with the static keyword.
Can only access static members of the outer class.
Doesn’t require an instance of the outer class to be created.
----------------------------------------------------------------------------------------------------
class Outer {
    static String msg = "Hello from Static Nested Class";

    static class Inner {
        void display() {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();  // No need for Outer instance
        inner.display();
    }
}
----------------------------------------------------------------------------------------------------------
3. Local Inner Class
Defined inside a method.
Can access final or effectively final variables of the method.
----------------------------------------------------------------------------------------------------------
class Outer {
    void outerMethod() {
        String localVar = "Inside Method";

        class Inner {
            void display() {
                System.out.println(localVar);
            }
        }

        Inner inner = new Inner();
        inner.display();
    }

    public static void main(String[] args) {
        new Outer().outerMethod();
    }
}
-------------------------------------------------------------------------------------------------------------
4. Anonymous Inner Class
A class without a name.
Used to instantiate a class with certain modifications, usually for interfaces or abstract classes.
-----------------------------------------------------------------------------------------------------------------
abstract class Animal {
    abstract void sound();
}

public class Test {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            void sound() {
                System.out.println("Dog barks");
            }
        };

        dog.sound();
    }
}
======================================================================================================================


	
