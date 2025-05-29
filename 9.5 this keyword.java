class Human
{
	
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int age, Human obj)
	{
		//Human obj1=new Human();
		Human obj1=obj;
		obj1.age=age;
		//this.age=age;
	}
	
//	public void SetAge(int a)
//	{
//		age=a;
//	}

	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
//	public void setName(String n)
//	{
//		name=n;
//	}

}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();

		obj.SetAge(30,obj);
//		obj.SetAge(30);
		obj.setName("Reddy");
		
//		System.out.println(obj.abc()+" : "+obj.getAge());
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}
===========================================================================================================================================================================
In Java, the this keyword is a reference variable that refers to the current object — the object whose method or constructor is being invoked.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Distinguishing Instance Variables from Parameters
When constructor or method parameters have the same names as instance variables, this helps differentiate between them.

public class Student {
    private String name;

    public Student(String name) {
        this.name = name; // 'this.name' refers to the instance variable
    }
}public class Student {
    private String name;
    private int age;

    public Student(String name) {
        this(name, 18); // Calls the constructor below
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3. Passing the Current Object as a Parameter
You can pass the current object to another method or constructor using this.

public class Student {
    public void display(Student s) {
        System.out.println("Student object: " + s);
    }

    public void show() {
        display(this); // Passes current object
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
4. Returning the Current Object
Useful in method chaining (common in builder patterns or fluent APIs).

public class Student {
    private String name;

    public Student setName(String name) {
        this.name = name;
        return this;
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
5. Accessing Members Hidden by Local Variables
If a local variable or parameter hides a field, this can be used to access the hidden field.

public class Student {
    private int id = 100;

    public void printId() {
        int id = 200;
        System.out.println(this.id); // prints 100
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Summary
Use Case	           Description
this.variable	           Refers to instance variable
this()	                   Calls another constructor
this.method()              Calls another method in the same class
return this                Returns current object
this as argument	   Passes current object
============================================================================================================================================================================
	
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2. Calling Another Constructor in the Same Class
You can use this() to call another constructor from within a constructor. This is known as constructor chaining.


