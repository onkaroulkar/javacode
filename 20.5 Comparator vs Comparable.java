=======================================================================================================================================================================
The Comparable interface is used when a class needs to define a natural ordering of its objects. You implement this interface in the class itself and override the 
compareTo() method.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // Sorting by ID in ascending order
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        Collections.sort(students); // Uses Comparable's compareTo method
        System.out.println(students);
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Points:
- The class implements Comparable<T>.
- The compareTo() method is overridden to define the sorting logic.
- Sorting is applied directly with Collections.sort().
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
2. Comparator Interface
The Comparator interface is used when you need multiple sorting criteria or don’t want to modify the original class.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Sorting by name
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        Collections.sort(students, new NameComparator()); // Uses Comparator logic
        System.out.println(students);
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Points:
- The class does not implement Comparable.
- A separate Comparator class is created.
- The compare() method is overridden with custom sorting logic.
- Collections.sort() is used, passing the Comparator.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Using Lambda expressions in Java makes sorting more concise and readable, especially when working with Comparator. You don’t need to create a separate Comparator class—you define it inline.
Sorting with Lambda
Here’s how you can rewrite the previous Comparator example using Lambda expressions:
import java.util.*;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class LambdaSortingExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sorting by ID using Lambda
        students.sort((s1, s2) -> s1.id - s2.id);
        System.out.println("Sorted by ID: " + students);

        // Sorting by Name using Lambda
        students.sort((s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("Sorted by Name: " + students);
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Why Lambda Is Awesome?
✔ No need for a separate Comparator class
✔ More concise and readable
✔ Makes sorting flexible with multiple criteria
Would you like to explore Comparator with Comparator.comparing() for even more streamlined sorting? 
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
The Comparator.comparing() method provides an even cleaner way to sort objects using method references or lambda expressions.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class ComparatorComparingExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sorting by ID
        students.sort(Comparator.comparing(s -> s.id));
        System.out.println("Sorted by ID: " + students);

        // Sorting by Name
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("Sorted by Name: " + students);
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Why Comparator.comparing() Is Even Better?
✔ More readable than traditional Comparator
✔ No need for complex lambda expressions
✔ Works seamlessly with method references (Comparator.comparing(Student::getName), if a getter exists)
=====================================================================================================================================================================





    


