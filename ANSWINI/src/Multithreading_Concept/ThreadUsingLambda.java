package Multithreading_Concept;
//program to create thread using lambda expression
public class ThreadUsingLambda 
{
    public static void main(String[] args) 
    {
        //sample thread creation using lambda expression
        new Thread(() -> System.out.println("Hello All")).start();

        //Another thread for runthreads class
        RunThreads rt =new RunThreads(); //created class object
        new Thread(rt).start();//creating thread object and starting it
        
    }
    
}

//class implementing Runnable
class RunThreads implements Runnable
{
    //overriding run() method of runnable interface
    public void run()
    {
        int a=5,b=10,c=a+b;
        System.out.println("sum is: "+c);
    }
}

