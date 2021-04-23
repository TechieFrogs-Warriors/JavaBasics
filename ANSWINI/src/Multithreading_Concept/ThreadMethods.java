package Multithreading_Concept;
//Methods to practice in threads
public class ThreadMethods 
{
    public static void main(String[] args) 
    {
        //creating object for class that is implementing runnable interface
        ThreadMethod_Practice tm = new ThreadMethod_Practice();
        //craeting thread class object and passing runnable implemented class object as argument to it
        Thread t = new Thread(tm);
        //just checking thread status here
        System.out.println("thread state is: "+t.getState());
        //starting thread
        t.start();
        //just checking thread status here
        System.out.println("thread state is: "+t.getState());

        //method to practice in threads
        t.setName("first thread");//sets thread name
        System.out.println("thread name is: "+t.getName());//shows the thread name

        //setting thread priority
        t.setPriority(10);
        System.out.println("thread priority is: "+t.getPriority());//shows thread priority

        //shows the thread state
        System.out.println("thread state is: "+t.getState());

        //shows whether thread is live or not.(true or false)
        System.out.println("thread is live?: "+t.isAlive());

        //just checking thread status here
        System.out.println("thread state is: "+t.getState());
        
    }
    
}
//class implementing runnable interface
class ThreadMethod_Practice implements Runnable
{
    //overriding run() method
    public void run()
    {
        disp();
        sample();
    }
    void disp()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
    void sample()
    {
        System.out.println("From sample method in class extending thread class");
    }
}
