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
====================================================================================================================================================
Method references in Java provide a concise and readable way to re-use methods already defined elsewhere by using a special :: syntax. Essentially, 
they are a shorthand for lambda expressions that invoke a particular method. This feature, introduced in Java 8, greatly enhances functional programming 
support in Java when working with functional interfaces (interfaces with a single abstract method), such as those used in the Stream API or for event handling.
----------------------------------------------------------------------------------------------------------------------------------------------------
1. Static Method Reference
A static method reference refers to a static method in a class. It’s most commonly used when a lambda expression merely calls a static method.
Syntax:
ClassName::staticMethodName
Example:
Consider converting a list of strings to integers. Instead of writing:
List<Integer> numbers = stringList.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());

You can simplify it with a static method reference:
List<String> stringList = Arrays.asList("10", "20", "30");
List<Integer> numbers = stringList.stream()
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());
Here, Integer::parseInt is a reference to the static parseInt method of the Integer class. The lambda behind the scenes is simply taking each string and 
passing it as an argument to parseInt.
------------------------------------------------------------------------------------------------------------------------------------------------------------------
2. Instance Method Reference of a Particular Object
This type of method reference is used when you want to call an instance method on a pre-existing object.
	
Syntax:
instance::instanceMethodName
	
Example:
Imagine you want to print messages using a specific output stream. Instead of writing:
List<String> messages = Arrays.asList("Hello", "World");
messages.forEach(msg -> System.out.println(msg));

You can simply use:
List<String> messages = Arrays.asList("Hello", "World");
messages.forEach(System.out::println);

Here, System.out is a specific instance (of PrintStream), and println is its instance method. The method reference System.out::println automatically maps each
string in the stream to the println call.
------------------------------------------------------------------------------------------------------------------------------------------------------------------
3. Instance Method Reference of an Arbitrary Object of a Particular Type
This form is used when the type of the object is known, but you don't have a specific instance in mind—the method will be invoked on the object passed as a parameter.

Syntax:
ClassName::instanceMethodName

Example:
Suppose you want to convert each string in a list to its uppercase form. Instead of:
List<String> words = Arrays.asList("apple", "banana", "cherry");
List<String> upperCaseWords = words.stream()
                                   .map(s -> s.toUpperCase())
                                   .collect(Collectors.toList());

You can simplify this using:
List<String> words = Arrays.asList("apple", "banana", "cherry");
List<String> upperCaseWords = words.stream()
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());
Here, String::toUpperCase acts on each element in the stream. The method reference automatically converts each string to uppercase by invoking its
instance method.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
4. Constructor Reference
Constructor references are used to create new instances. They offer a shorthand for a lambda expression that calls a constructor.

Syntax:
ClassName::new

Example:
Suppose you have a Person class:

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

You can use a constructor reference when creating instances:
import java.util.function.BiFunction;
  
public class ConstructorReferenceExample {
    public static void main(String[] args) {
        // Using a constructor reference for Person
        BiFunction<String, Integer, Person> personCreator = Person::new;
        Person p = personCreator.apply("Alice", 30);
        System.out.println(p);  // Output: Alice (30)
    }
}

n this case, Person::new is a constructor reference. It matches the signature of the BiFunction functional interface (which takes two parameters and produces a 
result).
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Benefits & Considerations
- Readability: Method references eliminate unnecessary boilerplate, making your code more concise.
- Clarity: They clearly indicate that the lambda expression is simply delegating to a method already defined elsewhere.
- Interchangeable with Lambdas: Any lambda expression that calls a method can be replaced with a method reference if the signatures align.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Requirement:
For a method reference to work, the target method’s signature must match the expected abstract method of the functional interface. Otherwise, the compiler will
report an error.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Let's connect this with Java Streams: method references are commonly used in pipeline operations like map, filter, and forEach to make the code more readable 
and declarative. For example:

List<String> names = Arrays.asList("alice", "bob", "charlie");
// Using method reference for an instance method of an arbitrary object
names.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);
===================================================================================================================================================================





	

