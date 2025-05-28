class Launch
{
	A obj=new A();
	System.out.println(obj.marks);
}




package other;

public class A{
	int marks=6;
//	protected marks=6;
	public void show()
	{
		
	}
}




public class B
{
//	private int marks;
	int marks;
	
}




class C extends A
{
	public void abc()
	{
		System.out.println(marks);
	}
}

public class Demo{
	public static void main(String[] args) {
   
	A obj=new A();
	System.out.println(obj.marks);
	obj.show();
	
	B obj1=new B();
	System.out.println(obj.marks);
	
	}
}

=================================================================================================================================================================
What Are Access Modifiers?
Access modifiers in Java define visibility or accessibility of classes, methods, constructors, and variables. They help enforce encapsulation, 
a core principle of object-oriented programming.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
Types of Access Modifiers in Java
Modifier	Class	Package	  Subclass	
public  	✅	✅	    ✅	
protected	❌	✅	    ✅	
(default)	❌	✅	    ❌	
private		❌	❌	    ❌
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
1. public
Accessible from anywhere: same class, same package, different package, subclass, etc.
Used when you want to expose functionality globally.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
2. private
Accessible only within the same class.
Not visible to subclasses or other classes in the same package.
✅ Use for: Encapsulation, hiding internal logic or sensitive data.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
3. protected
Accessible within the same package and by subclasses (even in different packages).
Not accessible from unrelated classes outside the package.
✅ Use for: Allowing controlled access to subclasses.
------------------------------------------------------------------------------------------------------------------------------------------------------------------
4. Default (Package-Private)
If no modifier is specified, it’s package-private.
Accessible only within the same package.
✅ Use for: Internal package-level logic.
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Best Practices
Use private by default, and increase visibility only when needed.
Use protected for extensibility in inheritance.
Use public for APIs or utility methods.
Avoid default unless you specifically want package-level access.
------------------------------------------------------------------------------------------------------------------------------------------------------------------

