1. Introduction to Threads
A thread is essentially a lightweight unit of execution within a process. Java supports multithreading through the java.lang.Thread class and the java.lang.Runnable 
  interface. Having multiple threads means that your application can perform several operations concurrently, making it possible to improve performance on multi-core
  CPUs or maintain a responsive user interface while doing long-running tasks.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
2. Creating Threads
There are two primary ways to create a thread in Java:
2.1 Extending the Thread Class
You can create a new thread by subclassing Thread and overriding its run() method. The run() method contains the code that will execute when the thread starts.

public class MyThread extends Thread {
    @Override
    public void run() {
        // Code executed by the thread.
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

// Using the thread:
MyThread t = new MyThread();
t.start(); // Always call start(), not run(), to initiate a new thread.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Key Points:
- Calling start() creates a new thread and schedules it for execution.
- Overriding run() defines the job for the thread.
- The Thread.currentThread() method retrieves a reference to the currently executing thread.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
2.2 Implementing the Runnable Interface
Another way is to implement the Runnable interface. This approach is often preferred because it decouples the task (the runnable) from the thread itself, 
which promotes reusability.

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code that runs in a separate thread.
        System.out.println("Runnable executing: " + Thread.currentThread().getName());
    }
}

// Creating a thread using a Runnable:
Thread t = new Thread(new MyRunnable());
t.start();

Key Points:
- You can pass an instance of a class that implements Runnable to the Thread constructor.
- This method allows your class to extend another class if needed, since Java supports single inheritance.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
3. Thread Lifecycle
A Java thread passes through several states during its lifecycle:

- New:
When a thread instance is created but the start() method has not been invoked.
  
- Runnable:
After start() is called, the thread enters the runnable state (ready-to-run) but does not mean it is running at that moment; it just awaits CPU allocation.
  
- Running:
When the thread scheduler picks the thread from the runnable pool and it starts executing its run() method.
  
- Blocked/Waiting:
The thread may enter a waiting state if it needs to wait for a resource, I/O operation, or if it has explicitly called methods such as wait(), sleep(), or join().
  
- Timed Waiting:
A variant of waiting where the thread waits for a specified period (e.g., Thread.sleep(1000)) before returning to the runnable state.
  
- Terminated:
Once the run() or call() method completes, the thread enters the terminated state.
  
Understanding these states is key to writing concurrent applications where synchronization and proper resource handling are paramount.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
4. Synchronization and Thread Safety
When multiple threads interact and share data, there’s a risk of race conditions. Java provides several mechanisms to ensure thread safety.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
4.1 Synchronized Blocks and Methods
The synchronized keyword enforces mutual exclusion by allowing only one thread to execute a block or method at a time for a particular object's monitor.

public class Counter {
    private int count = 0;
    
    // Synchronized method prevents concurrent access.
    public synchronized void increment() {
        count++;
    }
    
    // Alternatively, using a synchronized block:
    public void safeIncrement() {
        synchronized(this) {
            count++;
        }
    }
    
    public int getCount() {
        return count;
    }
}

Key Points:
- Synchronized methods or blocks lock on the object (or class level lock if static).
- Only one thread can access the synchronized section at a time.
- Overuse of synchronization can lead to performance bottlenecks.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
4.2 Volatile Keyword
The volatile keyword ensures that updates to a variable are propagated predictably to other threads. It is mainly used for variables that are accessed by multiple 
threads where simple atomicity of references is needed but not complex synchronization.

public class SharedFlag {
    // Marking flag as volatile ensures changes are visible to all threads.
    private volatile boolean flag = false;
    
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    public boolean getFlag() {
        return flag;
    }
}

Key Points:
- Use volatile when you need to ensure the visibility of changes.
- It does not guarantee atomicity for compound actions (e.g., incrementing a variable).
--------------------------------------------------------------------------------------------------------------------------------------------------------------------





