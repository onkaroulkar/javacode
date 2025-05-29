
//class A
//{
//	public void show()
//	{
//		System.out.println("in A show");
//	}
//	public void config()
//	{
//		System.out.println("in A config");
//	}
//}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}

class Calc 
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
}
class AdvCalc extends Calc
{
	public int add(int n1, int n2)
	{
		return n1+n2+1;
	}
}


public class Demo{
	public static void main(String args[])
	{
//		B obj=new B();
//		obj.show();
//		obj.config();
		
		AdvCalc obj=new AdvCalc();
		int r1=obj.add(3, 4);
		System.out.println(r1);
	}
}
==============================================================================================================================================================================

What is Method Overriding?
Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
The method in the subclass must have the same name, return type, and parameters as the method in the parent class.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Why Use Method Overriding?
To provide specific behavior for a subclass.
To achieve runtime polymorphism (dynamic method dispatch).
To allow a subclass to customize or extend the behavior of a parent class method.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Rules for Method Overriding
Rule	                           Description
Same method signature		   Name, return type, and parameters must match
Access modifier	                   Cannot be more restrictive than the overridden method
Final methods	                   Cannot be overridden
Static methods	                   Cannot be overridden (they are hidden)
Constructors	                   Cannot be overridden
Use of @Override	           Optional but recommended for clarity and compiler checking
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Concepts
🔸 Dynamic Method Dispatch
Java decides which method to call at runtime, not compile time.
Enables polymorphism.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔸 Use of @Override Annotation
Helps catch errors if the method signature is incorrect.
Improves code readability.
===============================================================================================================================================================================


