/*

abstract class Computer
{
//	public void code()
//	{
//		
//	}
	public abstract void code();
}

class Laptop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Demo {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
        
    }
}
*/



interface Computer
{
	 void code();
}

class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Demo {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
        
    }
}
===========================================================================================================================================================================================================
🧩 What is an Interface in Java?
An interface in Java is a reference type, similar to a class, that can contain:

Abstract methods (method signatures without bodies)
Default methods (with a body)
Static methods
Constants (public static final variables)
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
An interface defines a contract that classes can implement. It tells what a class must do, but not how to do it.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧱 Syntax of an Interface
interface Animal {
    void eat(); // abstract method
}

A class implements an interface using the implements keyword:
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats meat");
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


	
