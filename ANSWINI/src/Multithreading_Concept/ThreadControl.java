package Multithreading_Concept;
//program to check how thread execution control  will work
public class ThreadControl 
{
    public static void main(String[] args) throws InterruptedException 
    {
        //control first finishes main method work.so FIRST this is executed 
        System.out.println("control starts  with main thread");

        //At last control goes into thread object to run it.
        ThreadControl_Practice tc = new ThreadControl_Practice();
        ThreadControl_Practice tc2 = new ThreadControl_Practice();

        //if you dont want main thread to end before executing child threads.
        //then specify join() with the child thread object after start() and before next works
        //(may be childthreads or main thread)
        tc.start();
        tc.join(); //takes execution control to the above started thread

        tc2.start();
        tc2.join();//takes execution control to the above started thread

        //control first finishes main method work.so SECONDLY this is executed 
        System.out.println("control ends with main thread");

        
    }
}
//class extending threadclass
class ThreadControl_Practice extends Thread
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