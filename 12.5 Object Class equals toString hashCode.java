class Laptop
{
	String model;
	int price;
//	String serial;
	
	public String toString()
	{
//		return "Hey";
		return model+ " : "+price;
	}
	public boolean equals(Laptop that)
	{
//		if(this.model.equals(that.model) && this.price==that.price) 
//			return true;
//		else
//			return false;
		
		return this.model.equals(that.model) && this.price==that.price ;
	}
}
	
public class  Demo{
    public static void main(String[] args) {

    	Laptop obj=new Laptop();
    	obj.model="Lenevo Yoga";
    	obj.price=1000;
    	
    	Laptop obj2=new Laptop();
    	obj2.model="Lenevo Yoga";
 //   	obj2.model="Lenevo Yoga1";
    	obj2.price=1000;
    	
    	boolean result = obj.equals(obj2);
    	
    	System.out.println(obj.toString());
//   	System.out.println(obj);
    	
    }
}
=========================================================================================================================================================================================================
🧱 What is the Object Class?
In Java, Object is the root class of the class hierarchy. Every class in Java implicitly inherits from java.lang.Object if no other superclass is specified.

class MyClass {
    // This is implicitly: extends Object
}
So, whether you write it or not, every class you create is a subclass of Object.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
📦 Package Location
The Object class is part of the java.lang package, which is automatically imported in every Java program.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧠 Why is Object Important?
It provides default implementations of methods that are common to all objects.
It allows Java to treat all objects polymorphically.
It enables generic programming and collections to work with any object type.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔍 Methods of the Object Class
Here are the most important methods provided by the Object class:

Method	                                   Description
equals(Object obj)	                   Compares two objects for equality
hashCode()	                           Returns a hash code value for the object
toString()	                           Returns a string representation of the object
getClass()	                           Returns the runtime class of the object
clone()	                                   Creates and returns a copy of the object
finalize()	                           Called by the garbage collector before object is destroyed
wait(), notify(), notifyAll()	           Used for thread synchronization
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1️⃣ equals(Object obj)
Used to compare two objects for logical equality.

Default behavior:
public boolean equals(Object obj) {
    return (this == obj);
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2️⃣ hashCode()
Returns an integer hash code. Used in hash-based collections like HashMap, HashSet.

Contract with equals():
If two objects are equal (equals() returns true), they must have the same hash code.
If two objects have the same hash code, they may or may not be equal.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3️⃣ toString()
Returns a string representation of the object.
Default:
MyClass@15db9742
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Override:
@Override
public String toString() {
    return "MyClass{id=" + id + "}";
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
4️⃣ getClass()
Returns a Class object that represents the runtime class of the object.
MyClass obj = new MyClass();
System.out.println(obj.getClass().getName());  // prints "MyClass"
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
5️⃣ clone()
Creates a copy of the object. The class must implement the Cloneable interface.
class MyClass implements Cloneable {
    int x;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
6️⃣ finalize()
Called by the garbage collector before the object is destroyed. Rarely used now; replaced by try-with-resources and AutoCloseable.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
7️⃣ wait(), notify(), notifyAll()
Used for thread communication in synchronized blocks.

synchronized(obj) {
    obj.wait();      // thread waits
    obj.notify();    // wakes up one waiting thread
    obj.notifyAll(); // wakes up all waiting threads
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧪 Real-World Analogy
Think of Object as the "grandparent" of all Java classes. Just like all humans inherit basic traits (like breathing, walking), all Java classes inherit basic behaviors (like toString(), equals()).
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 🧰 Practical Use Cases
Collections: HashMap, HashSet rely on equals() and hashCode().
Debugging: toString() helps print object details.
Reflection: getClass() is used in frameworks like Spring, Hibernate.
Cloning: clone() is used to duplicate objects.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧠 Summary
Method	                                      Purpose
equals()	                              Logical equality
hashCode()	                              Hash-based collections
toString()	                              String representation
getClass()	                              Runtime type info
clone()	                                      Object duplication
finalize()	                              Cleanup before GC
wait()/notify()	                              Thread coordination
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


