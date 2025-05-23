@FunctionalInterface
interface A
{
//	void show();
	void show(int i);
//	void show(int i,int j);
	

}


public class Demo {
    public static void main(String[] args) {
    	
 //   	A obj=() -> System.out.println("in Show");  
 //   	obj.show();
    	
//    	A obj=new A()
//    	{
//    		public void show(int i)
//    		{
//    			System.out.println("in show"+i);
//    		}
//    	};
//    	obj.show(5);
    	
//    	A obj=(int i) ->System.out.println("in show "+i);
//    	obj.show(5);
    	
//    	A obj=(int i,int j) ->System.out.println("in show "+i);
//    	obj.show(5,8);
    	
    	A obj=i -> System.out.println("in show "+i);
    	obj.show(5);
    }
}
====================================================================================================================================================
A lambda expression in Java is a concise way to represent an anonymous function—a function without a name. It was introduced in Java 8 to enable
functional programming and make code more readable and expressive, especially when working with functional interfaces.
----------------------------------------------------------------------------------------------------------------------------------------------------

🔹 Key Features
Concise: No need to write a full class or method.
Anonymous: No method name or class name.
Used with Functional Interfaces: Lambda expressions can only be used where a functional interface is expected.
----------------------------------------------------------------------------------------------------------------------------------------------------

List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(name -> System.out.println(name));
----------------------------------------------------------------------------------------------------------------------------------------------------
Benefits of Lambda Expressions
Less boilerplate code
Improved readability
Encourages functional programming
Easier to work with streams and collections
=========================================================================================
	

